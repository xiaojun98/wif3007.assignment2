package contactmanagementsoftware;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class InitialState extends State {
    
    public InitialState(MUI context) {
        super(context);
    }

    @Override
    public void jButton1ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(getContext(), "Select a category!");
    }

    @Override
    public void jButton2ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(getContext(), "Select a category!");
    }

    @Override
    public void jButton5ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(getContext(), "Select a category!");
    }

    @Override
    public void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(getContext(), "Select a category!");
    }
    
}
