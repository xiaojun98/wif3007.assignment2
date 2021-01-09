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
public class CasualAcquaintancesInsertCommand implements Command {
    CasualAcquaintances contact;
    boolean flag;
    ArrayList<Acquaintances> list;
    String name;
    String mobile;
    String email;
    String whenWhere;
    String circumstances;
    String otherInfo;
    
    public CasualAcquaintancesInsertCommand(
            int index,
            ArrayList<Acquaintances> list,
            String name,
            String email,
            String mobile,
            String whenWhere,
            String circumstances,
            String otherInfo
    ) {
        if(index < 0) {
            flag = true;
            contact = (CasualAcquaintances) AcquaintancesFactory.getInstance().createAcquaintance("Casual");
        } else {
            flag = false;
            contact = (CasualAcquaintances) list.get(index);
        } 
        this.list = list;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.whenWhere = whenWhere;
        this.circumstances = circumstances;
        this.otherInfo = otherInfo;
    }

    @Override
    public void execute() {
        
        if(whenWhere.isEmpty() || whenWhere.length() > 300){
            JOptionPane.showMessageDialog(MUI.getOccurrence(), "Enter a valid value ( 1 to 300 chars)");
            return;
        }
        if(circumstances.isEmpty() || circumstances.length() > 300){
            JOptionPane.showMessageDialog(MUI.getOccurrence(), "Enter a valid value ( 1 to 300 chars)");
            return;
        }
        if(otherInfo.isEmpty() || otherInfo.length() > 300){
            JOptionPane.showMessageDialog(MUI.getOccurrence(), "Enter a valid value ( 1 to 300 chars)");
            return;
        }
        contact.newAcquaintances(name, email, mobile, whenWhere, circumstances, otherInfo);
        if(flag)
            list.add(contact);
    }
    
}
