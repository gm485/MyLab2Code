import javax.swing.*;
import java.awt.*;

public class Lab2Part3 extends JFrame {

    private Font bigFont;
    private ButtonGroup radioGroup;
    String[] choices = {"Elton John", "Queen", "Snow Patrol", "Led Zeppelin", "Rory Gallagher"};
    String[] choices1 = {"Dog", "Cat", "Fish", "Monkey", "Bunny"};

    //two Combo boxes
    JComboBox<String> combo1 = new JComboBox<String>(choices);
    JComboBox<String> combo2 = new JComboBox<String>(choices1);

    Lab2Part3() {
        super("lab 2 part 3 ");
        Container contentPane = getContentPane();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        //CONTENT PANE LAYOUT MANAGER
        contentPane.setLayout(new GridLayout(2,3));
        //panel1 layout manager
        panel1.setLayout(new GridLayout(1,2));

        //create font objects
        bigFont = new Font("serif", Font.ITALIC, 20);

        

        //comboBox config and populate list
        loopListItems(choices,combo1);
        loopListItems(choices1,combo2);

        combo1.setEditable(false);
        combo1.setMaximumRowCount(4);
        combo2.setEditable(false);
        combo2.setMaximumRowCount(4);

        //panel 2 components
        JLabel radioBtnLbl = new JLabel("Please select which ComboBox you like the most from the two");
        radioBtnLbl.setFont(bigFont);

        //radio buttons
        JRadioButton topCombo = new JRadioButton("Top Combo");
        JRadioButton btmCombo = new JRadioButton("Bottom Combo");

        //set logical realationship between radio buttons
        radioGroup = new ButtonGroup();
        radioGroup.add(topCombo);
        radioGroup.add(btmCombo);

        //add components to panel 1
        panel1.add(combo1);
        panel1.add(combo2);

        //add components to panel 2
        panel2.add(radioBtnLbl);
        panel2.add(topCombo);
        panel2.add(btmCombo);

        contentPane.add(panel2);
        contentPane.add(panel1);


        setSize(400,400);
        setLocation(500,50);
        setVisible(true);
    }

    //loop constructor for JList
    public void loopListItems(String choices[], JComboBox jCombo) {
        for (int i = 0; i < choices.length; i++) {
            jCombo.addItem(choices[i]);
        }
    }
}
