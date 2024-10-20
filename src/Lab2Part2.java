import javax.swing.*;
import java.awt.*;

public class Lab2Part2 extends JFrame {

    String firstChoices[] = {"Connaught", "Munster", "Leinster","Ulster"};
    String secondChoices[] = {"Galway", "Limerick", "Dublin", "Cavan"};
    Lab2Part2(){
        super("Lab2Part2");
        Container contentPane = getContentPane();
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2,2));
        //labels
        JLabel provinceLbl = new JLabel("Choose Province:");
        provinceLbl.setHorizontalAlignment(JLabel.CENTER);
        provinceLbl.setVerticalAlignment(JLabel.BOTTOM);
        JLabel cityLbl = new JLabel("Choose City/Town:");
        cityLbl.setHorizontalAlignment(JLabel.CENTER);
        cityLbl.setVerticalAlignment(JLabel.BOTTOM);
        //two JLists
        JList<String> provincesList = new JList<String>(firstChoices);
        JList<String> cityList = new JList<String>(secondChoices);

        JScrollPane provincesScrollPane = new JScrollPane(provincesList);
        JScrollPane cityScrollPane = new JScrollPane(cityList);

        //provinces list settings
        provincesScrollPane.setPreferredSize(new Dimension(1000,200));
        provincesScrollPane.setMaximumSize(new Dimension(1000,200));

        //city list settings
        cityScrollPane.setPreferredSize(new Dimension(500,100));
        cityScrollPane.setMaximumSize(new Dimension(500,100));
        //add components to panel
        panel1.add(provinceLbl);
        panel1.add(cityLbl);
        panel1.add(provincesScrollPane);
        panel1.add(cityScrollPane);

        contentPane.add(panel1, BorderLayout.SOUTH);





        //frame setup

        setLocation(500,500);
        setSize(500,250);
        setVisible(true);

    }
}
