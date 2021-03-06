package contactmanagementsoftware;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class Relatives extends Acquaintances implements Serializable{
    private String BDate;
    private String LDate;
    public static int numberRel = 0;
    private static Scanner reader = new Scanner(System.in);
    
    Relatives(){
        numberRel++;
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
    
    public String getBDate() {
        return BDate;
    }

    public void setBDate(String BDate) {
        this.BDate = BDate;
    }

    public String getLDate() {
        return LDate;
    }

    public void setLDate(String LDate) {
        this.LDate = LDate;
    }
    
    @Override
    public void checkExtra(String one, String two, String three){
        this.setBDate(one);
        this.setLDate(two);
    }
    
    
    public boolean isEqual(Relatives rel){
        boolean equal = true;
        if(!this.getName().equals(rel.getName())){
            equal = false;
        }
        if(!this.getMobileNo().equals(rel.getMobileNo())){
            equal = false;
        }
        if(!this.getEmail().equals(rel.getEmail())){
            equal = false;
        }
        if(!this.getBDate().equals(rel.getBDate())){
            equal = false;
        }
        if(!this.getLDate().equals(rel.getLDate())){
            equal = false;
        }
        return equal;
    }
}
