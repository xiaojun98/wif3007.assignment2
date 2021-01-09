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
public class RelativesInsertCommand implements Command {
    Relatives contact;
    boolean flag;
    ArrayList<Acquaintances> list;
    String name;
    String mobile;
    String email;
    String BDate;
    String LDate;
    
    public RelativesInsertCommand(
            int index,
            ArrayList<Acquaintances> list,
            String name,
            String email,
            String mobile,
            String BDate,
            String LDate
    ) {
        if(index < 0) {
            flag = true;
            contact = (Relatives) AcquaintancesFactory.getInstance().createAcquaintance("Relative");
        } else {
            flag = false;
            contact = (Relatives) list.get(index);
        } 
        this.list = list;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.BDate = BDate;
        this.LDate = LDate;
    }

    @Override
    public void execute() {
        if(!MUI.getOccurrence().validDate(BDate)){
            throw new UnsupportedOperationException("Enter valid date");
        }
        if(BDate.isEmpty() || BDate.length() > 300){
            JOptionPane.showMessageDialog(MUI.getOccurrence(), "Enter a valid value ( 1 to 300 chars)");
            return;
        }
        if(!MUI.getOccurrence().validDate(LDate)){
            throw new UnsupportedOperationException("Enter valid date");
        }
        if(LDate.isEmpty() || LDate.length() > 300){
            JOptionPane.showMessageDialog(MUI.getOccurrence(), "Enter a valid value ( 1 to 300 chars)");
            return;
        }
        contact.newAcquaintances(name, email, mobile, BDate, LDate, "");
        if(flag)
            list.add(contact);
    }
    
}

