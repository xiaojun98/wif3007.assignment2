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
public class PersonalFriendsInsertCommand implements Command {
    PersonalFriends contact;
    boolean flag;
    ArrayList<Acquaintances> list;
    String name;
    String mobile;
    String email;
    String events;
    String aContext;
    String aDate;
    
    public PersonalFriendsInsertCommand(
            int index,
            ArrayList<Acquaintances> list,
            String name,
            String email,
            String mobile,
            String events,
            String aContext,
            String aDate
    ) {
        if(index < 0) {
            flag = true;
            contact = (PersonalFriends) AcquaintancesFactory.getInstance().createAcquaintance("Personal");
        } else {
            flag = false;
            contact = (PersonalFriends) list.get(index);
        } 
        this.list = list;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.events = events;
        this.aContext = aContext;
        this.aDate = aDate;
    }

    @Override
    public void execute() {
        if(events.isEmpty() || events.length() > 300){
            JOptionPane.showMessageDialog(MUI.getInstance(), "Enter a valid value ( 1 to 300 chars)");
            return;
        }
        if(aContext.isEmpty() || aContext.length() > 300){
            JOptionPane.showMessageDialog(MUI.getInstance(), "Enter a valid value ( 1 to 300 chars)");
            return;
        }
        if(!MUI.getInstance().validDate(aDate)){
            throw new UnsupportedOperationException("Enter valid date");
        }
        if(aDate.isEmpty() || aDate.length() > 300){
            JOptionPane.showMessageDialog(MUI.getInstance(), "Enter a valid value ( 1 to 300 chars)");
            return;
        }
        contact.newAcquaintances(name, email, mobile, events, aContext, aDate);
        if(flag)
            list.add(contact);
    }
    
}
