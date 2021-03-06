package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public class Acquaintances implements Serializable{
    private String Name;
    private String MobileNo;
    private String Email;
    public static int number = 0;
    
    Acquaintances(){
        number++;
    }
        
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Scanner reader = new Scanner(System.in);
        if(!name.isEmpty())
          this.Name = name;
        else{
            System.out.println("Enter atleast one character");
            setName(reader.nextLine());
        }
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public String getEmail() {
        return Email;
    }
    
    public boolean MobileNoChecker(String str)
    {
        int x;
        for(int j = 0 ; j < str.length() ; j++)
        {
            x = (int)str.charAt(j);
            if( x < 48 || x > 57 )
            return false;    
        }
        return true;
    }
    
    
    public void setMobileNo(String MobileNo){
        Scanner reader = new Scanner(System.in);
        if(MobileNoChecker(MobileNo) && MobileNo.length()>=6 && MobileNo.length()<=15)
            this.MobileNo = MobileNo;
        else{
            System.out.print("Enter a valid Mobile No of length between 6 and 15 (inclusive): ");
            setMobileNo(reader.next());
        }
    }
    
    public void setEmail(String Email){
        Scanner reader = new Scanner(System.in);
        if(Email.contains("@"))
            this.Email = Email;
        else{
            System.out.print("Enter a valid Email: ");
            this.setEmail(reader.next());
        }
    }
    
    //template method
    final void newAcquaintances(String name, String email, String mobile, String one, String two, String three){
        this.setName(name);
        this.setEmail(email);
        this.setMobileNo(mobile);
        this.checkExtra(one, two, three);
    }
    
    //template hook 
    public void checkExtra(String one, String two, String three){
        
    }
    
    public boolean isEqual(Acquaintances a){
        boolean equal = false;
        if(a instanceof Relatives){
            Relatives castThis = (Relatives)this;
            equal = castThis.isEqual((Relatives)a);
        }
        else if (a instanceof CasualAcquaintances){
            CasualAcquaintances castThis = (CasualAcquaintances)this;
            equal = castThis.isEqual((CasualAcquaintances)a);
        }
        else if (a instanceof PersonalFriends){
            PersonalFriends castThis = (PersonalFriends)this;
            equal = castThis.isEqual((PersonalFriends)a);
        }
        else if (a instanceof ProfessionalFriends){
            ProfessionalFriends castThis = (ProfessionalFriends)this;
            equal = castThis.isEqual((ProfessionalFriends)a);
        }
        return equal;
    }
}
