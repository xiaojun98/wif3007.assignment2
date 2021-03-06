package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public class CasualAcquaintances extends Acquaintances implements Serializable{
    private String WhenWhere;
    private String Circumstances;
    private String OtherInfo;
    public static int numberCA = 0;
    
    CasualAcquaintances(){
        numberCA++;
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
    
    public String getWhenWhere() {
        return WhenWhere;
    }

    public void setWhenWhere(String WhenWhere) {
        Scanner reader = new Scanner(System.in);
        if(!WhenWhere.isEmpty())
            this.WhenWhere = WhenWhere;
        else{
            System.out.println("Enter atleast one character");
            setWhenWhere(reader.nextLine());
        }
    }

    public String getCircumstances() {
        return Circumstances;
    }

    public void setCircumstances(String Circumstances) {
        Scanner reader = new Scanner(System.in);
        if(!Circumstances.isEmpty())
            this.Circumstances = Circumstances;
        else{
            System.out.println("Enter atleast one character");
            setCircumstances(reader.nextLine());
        }
    }

    public String getOtherInfo() {
        return OtherInfo;
    }

    public void setOtherInfo(String OtherInfo) {
        Scanner reader = new Scanner(System.in);
        if(!OtherInfo.isEmpty())
            this.OtherInfo = OtherInfo;
        else{
            System.out.println("Enter atleast one character");
            setOtherInfo(reader.nextLine());
        }
    }
    
    @Override
    public void checkExtra(String one, String two, String three){
        this.setWhenWhere(one);
        this.setCircumstances(two);
        this.setOtherInfo(three);
    }
    
    public boolean isEqual(CasualAcquaintances ca){
        boolean equal = true;
        if(!this.getName().equals(ca.getName())){
            equal = false;
        }
        if(!this.getMobileNo().equals(ca.getMobileNo())){
            equal = false;
        }
        if(!this.getEmail().equals(ca.getEmail())){
            equal = false;
        }
        if(!this.getWhenWhere().equals(ca.getWhenWhere())){
            equal = false;
        }
        if(!this.getCircumstances().equals(ca.getCircumstances())){
            equal = false;
        }
        if(!this.getOtherInfo().equals(ca.getOtherInfo())){
            equal = false;
        }
        return equal;
    }
}
