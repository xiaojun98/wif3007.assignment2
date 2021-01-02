package contactmanagementsoftware;

import java.awt.event.ActionEvent;

public abstract class State {

    private MUI context;
    
    public State(MUI context) {
        setContext(context);
    }

    public MUI getContext() {
        return context;
    }

    public void setContext(MUI context) {
        this.context = context;
    }
    
    public abstract void jButton1ActionPerformed(ActionEvent evt);
    
    public abstract void jButton2ActionPerformed(ActionEvent evt);
    
    public abstract void jButton5ActionPerformed(ActionEvent evt);
    
    public abstract void jButton6ActionPerformed(ActionEvent evt);
    
    public void categorySelected() {
        context.setState(new CategoryState(context));
    }
    
    public void entrySelected() {
        context.setState(new EntryState(context));
    }
    
    public static State InitialState(MUI context) {
        return new InitialState(context);
    }
    
}
