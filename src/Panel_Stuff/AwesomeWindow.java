package Panel_Stuff;

import javax.swing.*;
import java.awt.*;

public class AwesomeWindow extends JFrame {
    private AwesomePanel myPanel;
    public AwesomeWindow(){
        super("Awesome!");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(1,1));
        myPanel = new AwesomePanel();
        getContentPane().add(myPanel);
    }
}
