/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thechee
 */
public class ProfessionalFriendsInsertCommand implements Command {
    ProfessionalFriends contact;
    ArrayList<Acquaintances> list;
    boolean flag;
    String name;
    String mobile;
    String email;
    String commonInterests;
    
    public ProfessionalFriendsInsertCommand(
            int index,
            ArrayList<Acquaintances> list,
            String name,
            String email,
            String mobile,
            String commonInterests
    ) {
        if(index < 0) {
            flag = true;
            contact = (ProfessionalFriends) AcquaintancesFactory.getInstance().createAcquaintance("Professional");
        } else {
            flag = false;
            contact = (ProfessionalFriends) list.get(index);
        } 
        this.list = list;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.commonInterests = commonInterests;
    }

    @Override
    public void execute() {
        if(commonInterests.isEmpty() || commonInterests.length() > 300){
            JOptionPane.showMessageDialog(MUI.getOccurrence(), "Enter a valid value ( 1 to 300 chars)");
            return;
        }
        contact.newAcquaintances(name, email, mobile, commonInterests, "", "");
        if(flag)
            list.add(contact);
        
//        contact.setName(name);
//        contact.setMobileNo(mobile);
//        contact.setEmail(email);
//        contact.setCommonInterests(commonInterests);
    }
    
}
