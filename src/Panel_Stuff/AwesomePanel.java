package Panel_Stuff;

import javax.swing.*;
import java.awt.*;

public class AwesomePanel extends JPanel{
    private Image thing;
    public AwesomePanel() {
        super();
        ImageIcon thingIcon = new ImageIcon("thing.png");
        thing = thingIcon.getImage();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(20, 40, 10, 30);
        g.drawImage(thing, 100, 50, this);
    }
}
