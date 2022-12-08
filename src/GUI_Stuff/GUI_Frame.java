package GUI_Stuff;
import javax.swing.*;
import java.awt.*;

public class GUI_Frame extends JFrame{
    private JButton firstButton;
    private JCheckBox happyCheckbox;
    private JRadioButton morningRB, afternoonRB, eveningRB;
    private JTextField nameField;
    private JTextArea commentArea;
    private JComboBox dwarfPicker;
    private JSlider temperatureSlider;

    public GUI_Frame(){
        super("GUI Demo");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        box_GUI();
        setVisible(true);
    }

    // gui guide
    public void build_GUI(){
        // labels and label with image
//        JLabel greetingLabel = new JLabel("Help me!");
//        getContentPane().add(greetingLabel);
        ImageIcon thingIcon = new ImageIcon("thing2.png");
//        JLabel thingLabel = new JLabel("Mao Zedong", thingIcon, JLabel.LEFT);
//        getContentPane().add(thingLabel);

        // button
        firstButton = new JButton("Please help!", thingIcon);
        getContentPane().add(firstButton);

        // checkbox
        happyCheckbox = new JCheckBox("I'm happy");
        happyCheckbox.setSelected(true);
        getContentPane().add(happyCheckbox);

        // radio buttons
        morningRB = new JRadioButton("Morning");
        afternoonRB = new JRadioButton("Afternoon");
        eveningRB = new JRadioButton("Evening");

        ButtonGroup timeBG = new ButtonGroup();
        timeBG.add(morningRB);
        timeBG.add(afternoonRB);
        timeBG.add(eveningRB);

        morningRB.setSelected(true);
        getContentPane().add(morningRB);
        getContentPane().add(afternoonRB);
        getContentPane().add(eveningRB);

        // text fields
        nameField = new JTextField("What is your name?", 30);
        getContentPane().add(nameField);

        // text area
        commentArea = new JTextArea(10, 30); // rows, cols
        commentArea.setText("This is a comment. \nNifty, huh?");
//        getContentPane().add(commentArea);
        JScrollPane commentScroller = new JScrollPane(commentArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        getContentPane().add(commentScroller);

        // combo box (popup menu)
        String[] dwarfNames =
                {"Happy", "Sleepy", "Bashful", "Sneezy", "Grouchy", "Dopey", "Doc", "Gimli"};
        dwarfPicker = new JComboBox(dwarfNames);
        dwarfPicker.setSelectedIndex(4);
        getContentPane().add(dwarfPicker);

        // slider
        temperatureSlider = new JSlider(JSlider.VERTICAL, 0, 105, 74);
        getContentPane().add(temperatureSlider);
    }

    public void arranged_GUI(){
        JButton button0 = new JButton("Button 0");
        button0.setForeground(Color.LIGHT_GRAY);
        JButton button1 = new JButton("Button 1");
        button1.setForeground(Color.PINK);
        JButton button2 = new JButton("Button 2");
        button2.setForeground(new Color(73,47,146));
        JButton button3 = new JButton("Button 3");
        button3.setForeground(new Color(255,196, 37));

//        getContentPane().add(button0, BorderLayout.NORTH);
//        getContentPane().add(button1, BorderLayout.WEST);
//        getContentPane().add(button2, BorderLayout.CENTER);
//        getContentPane().add(button3, BorderLayout.EAST);

        JPanel toolbarPanel = new JPanel();
        toolbarPanel.setLayout(new FlowLayout());

        toolbarPanel.add(button0);
        toolbarPanel.add(button1);
        toolbarPanel.add(button2);

        getContentPane().add(toolbarPanel,BorderLayout.NORTH);
        getContentPane().add(button3,BorderLayout.CENTER);
    }

    public void box_GUI(){
        JButton button0 = new JButton("Button 0");
        button0.setForeground(Color.LIGHT_GRAY);
        JButton button1 = new JButton("Button 1");
        button1.setForeground(Color.PINK);
        JButton button2 = new JButton("Button 2");
        button2.setForeground(new Color(73,47,146));
        JButton button3 = new JButton("Button 3");
        button3.setForeground(new Color(255,196, 37));

        JCheckBox pointsCB = new JCheckBox("Show Points");
        JCheckBox linesCB = new JCheckBox("Show Lines");

        JRadioButton originalRB = new JRadioButton("Original");
        originalRB.setSelected(true);
        JRadioButton zoomedRB = new JRadioButton("Zoomed in");
        ButtonGroup scaleButtons = new ButtonGroup();
        scaleButtons.add(originalRB);
        scaleButtons.add(zoomedRB);

        Box bottomTools = Box.createHorizontalBox();
        bottomTools.add(Box.createHorizontalGlue());
        bottomTools.add(button0);
        bottomTools.add(button1);
        bottomTools.add(button2);
        bottomTools.add(Box.createHorizontalStrut(75));

        Box linesAndPoints = Box.createVerticalBox();
        linesAndPoints.add(pointsCB);
        linesAndPoints.add(linesCB);

        bottomTools.add(linesAndPoints);

        Box scales = Box.createVerticalBox();
        scales.add(originalRB);
        scales.add(Box.createVerticalStrut(30));
        scales.add(zoomedRB);

        bottomTools.add(scales);
        bottomTools.add(Box.createHorizontalGlue());

        getContentPane().add(bottomTools, BorderLayout.SOUTH);
        getContentPane().add(button3, BorderLayout.CENTER);
    }

}
