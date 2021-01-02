package contactmanagementsoftware;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class CategoryState extends State {

    public CategoryState(MUI context) {
        super(context);
    }
    
    @Override
    public void jButton1ActionPerformed(ActionEvent evt) {
        getContext().proceedToAdd();
    }

    @Override
    public void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(getContext(), "Select an entry!");
    }

    @Override
    public void jButton5ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(getContext(), "Select an entry!");
    }

    @Override
    public void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(getContext(), "Select an entry!");
    }
    
}
