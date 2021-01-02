package contactmanagementsoftware;

import java.awt.event.ActionEvent;

public class EntryState extends State {

    public EntryState(MUI context) {
        super(context);
    }
    
    @Override
    public void jButton1ActionPerformed(ActionEvent evt) {
        getContext().proceedToAdd();
    }

    @Override
    public void jButton2ActionPerformed(ActionEvent evt) {
        getContext().proceedToDelete();
    }

    @Override
    public void jButton5ActionPerformed(ActionEvent evt) {
        getContext().proceedToEdit();
    }

    @Override
    public void jButton6ActionPerformed(ActionEvent evt) {
        getContext().proceedToView();
    }
    
}
