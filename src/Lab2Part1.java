import javax.swing.*;
import java.awt.*;

public class Lab2Part1 extends JFrame {

    Font formFont = new Font("Helvetica", Font.PLAIN, 15);

    String cityChoices[] = {"Dublin", "Galway", "Cork", "Cavan"};
    Lab2Part1() {
        super("Lab2Part1");
        Container contentPane = getContentPane();

        JPanel lblPanel = new JPanel();
        lblPanel.setPreferredSize(new Dimension(100,500));
        lblPanel.setMaximumSize(new Dimension(100,500));
        JPanel infoPanel = new JPanel();
        JPanel verifyPanel = new JPanel();
        

        lblPanel.setLayout(new BoxLayout(lblPanel, BoxLayout.Y_AXIS));
        //info pane
        JLabel infoLbl1 = new JLabel("D & D Entry Club!");
        infoPanel.add(infoLbl1);
        infoPanel.setBackground(Color.ORANGE);
        infoLbl1.setFont(formFont);
        //input form labels
        JLabel lbl1 = new JLabel("Name: ");
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbl1.setFont(formFont);
        JLabel lbl2 = new JLabel("Address: ");
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbl2.setFont(formFont);
        JLabel lbl3 = new JLabel("Email: ");
        lbl3.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbl3.setFont(formFont);
        JLabel lbl4 = new JLabel("PhoneNo: ");
        lbl4.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbl4.setFont(formFont);
        JLabel lbl5 = new JLabel("City: ");
        lbl5.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbl5.setFont(formFont);
        JLabel passWdLbl = new JLabel("Create Password: ");
        passWdLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        passWdLbl.setFont(formFont);

        JTextField nameTextField = new JTextField();
        nameTextField.setMaximumSize(new Dimension(300,30));
        nameTextField.setPreferredSize(new Dimension(500,25));
        
        JTextField addrTextField = new JTextField();
        addrTextField.setPreferredSize(new Dimension(500,30));
        addrTextField.setMaximumSize(new Dimension(500,30));
        JTextField emailTextField = new JTextField();
        emailTextField.setPreferredSize(new Dimension(100,30));
        emailTextField.setMaximumSize(new Dimension(500,30));
        JTextField phoneNoTextField = new JTextField();
        phoneNoTextField.setPreferredSize(new Dimension(50,30));
        phoneNoTextField.setMaximumSize(new Dimension(400,30)); //
        //password input
        JPasswordField passWdField = new JPasswordField(20);
        passWdField.setEchoChar('*');
        passWdField.setPreferredSize(new Dimension(50,30));
        passWdField.setMaximumSize(new Dimension(400,30));

        JList<String> cityList = new JList<>(cityChoices);
        JScrollPane scrollPane = new JScrollPane(cityList);
        scrollPane.setPreferredSize(new Dimension(300,80));
        scrollPane.setMaximumSize(new Dimension(300,80));
        scrollPane.setFont(formFont);

        lblPanel.setBackground(Color.LIGHT_GRAY);
        //input Label panel
        lblPanel.add(lbl1);
        lblPanel.add(nameTextField);
        lblPanel.add(lbl2);
        lblPanel.add(addrTextField);
        lblPanel.add(lbl3);
        lblPanel.add(emailTextField);
        lblPanel.add(lbl4);
        lblPanel.add(phoneNoTextField);
        lblPanel.add(lbl5);
        lblPanel.add(scrollPane);
        lblPanel.add(passWdLbl);
        lblPanel.add(passWdField);

        //verify panel
        verifyPanel.setBackground(Color.DARK_GRAY);
        JButton confirmBtn = new JButton("Confirm");
        confirmBtn.setBackground(Color.lightGray);
        confirmBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        confirmBtn.setFont(formFont);
        JLabel verifyLbl = new JLabel("Do you agree to our terms");
        verifyLbl.setFont(formFont);
        verifyLbl.setForeground(Color.lightGray);
        JCheckBox confirmChoices = new JCheckBox("Yes");
        confirmChoices.setBackground(Color.DARK_GRAY);
        confirmChoices.setForeground(Color.LIGHT_GRAY);
        confirmChoices.setFont(formFont);
        

        verifyPanel.add(verifyLbl);
        verifyPanel.add(confirmChoices);
        verifyPanel.add(confirmBtn);
        //contentPane
        contentPane.add(infoPanel, BorderLayout.NORTH);
        contentPane.add(lblPanel, BorderLayout.CENTER);
        contentPane.add(verifyPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setLocation(300,100);
        setVisible(true);
    }
}
