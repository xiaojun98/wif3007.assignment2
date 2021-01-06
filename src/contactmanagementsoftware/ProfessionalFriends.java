package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public class ProfessionalFriends extends Acquaintances implements Serializable{
    
    private String CommonInterests;
    public static int numberProF = 0;
    
    ProfessionalFriends(){
        numberProF++;
    }
    
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String Name) {
        super.setName(Name); 
    }

    @Override
    public String getMobileNo() {
        return super.getMobileNo();
    }

    @Override
    public void setMobileNo(String MobileNo) {
        super.setMobileNo(MobileNo);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String Email) {
        super.setEmail(Email);
    }

    public String getCommonInterests() {
        return CommonInterests;
    }

    public void setCommonInterests(String CommonInterests) {
        Scanner reader = new Scanner(System.in);
        if(!CommonInterests.isEmpty())
            this.CommonInterests = CommonInterests;
        else{
            System.out.println("Enter at least one character");
            setCommonInterests(reader.nextLine());
        }
    }
    
    @Override
    public void checkExtra(String one, String two, String three){
        this.setCommonInterests(one);
    }
    
    public boolean isEqual(ProfessionalFriends pf){
        boolean equal = true;
        if(!this.getName().equals(pf.getName())){
            equal = false;
        }
        if(!this.getMobileNo().equals(pf.getMobileNo())){
            equal = false;
        }
        if(!this.getEmail().equals(pf.getEmail())){
            equal = false;
        }
        if(!this.getCommonInterests().equals(pf.getCommonInterests())){
            equal = false;
        }
        return equal;
    }
}
