import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.util.concurrent.Flow;

public class Lab2Part4 extends JFrame {

  JLabel screenRdioLbl = new JLabel("Would you like to hear more about us");
  JPanel screenRadioPnl = new JPanel();
  JPanel wlcomePanel = new JPanel();
  JPanel btnPanelLeftSide = new JPanel();
  JPanel btnPanelRightSide = new JPanel();
  JPanel asidePanel = new JPanel();
  JPanel ftrPanel = new JPanel();

  //Fonts
  Font regFont = new Font("Helvetica", Font.BOLD, 18);
  Font btnFont = new Font("Helvetica", Font.BOLD, 14);
  Font logOutFont = new Font("Helvetica", Font.BOLD, 25);

  //Icons
  Icon companyLogo = new ImageIcon("./images/tony.jpg");
  

  //editing UI Manager to set Font globally
    Lab2Part4() {
        super("Lab2 Part4");
        Container contentPane = getContentPane();
        
        

        //welcome panel components
        wlcomePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 200,2));
        wlcomePanel.setBackground(Color.ORANGE);
        JLabel logoLbl = new JLabel("ATM", companyLogo, JLabel.LEADING);
        
        logoLbl.setFont(regFont);
        JLabel bannerLbl = new JLabel("<html>Bank of Trust! &#169 </html>");
        bannerLbl.setFont(regFont);
        

        wlcomePanel.add(logoLbl);
        wlcomePanel.add(bannerLbl);

        //button panel right side components
        btnPanelLeftSide.setLayout(new GridLayout(3,1,30,30));
        btnPanelLeftSide.setBackground(Color.DARK_GRAY);
        JButton button1 = new JButton("Get Cash");
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setFont(btnFont);
        JButton button2 = new JButton("Deposit");
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setFont(btnFont);
        JButton button3 = new JButton("Payments");
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setFont(btnFont);
  
        btnPanelLeftSide.add(button1);
        btnPanelLeftSide.add(button2);
        btnPanelLeftSide.add(button3);

        //buttonPanel right side
        btnPanelRightSide.setLayout(new GridLayout(3,1,30,30));
        btnPanelRightSide.setBackground(Color.DARK_GRAY);
        JButton button4 = new JButton("<html>Credit <br />  Card</html>");
        button4.setBackground(Color.LIGHT_GRAY);
        button4.setPreferredSize(new Dimension(100,30));
        button4.setFont(btnFont);
        JButton button5 = new JButton("<html>Account<br /> Settings</html>");
        button5.setBackground(Color.LIGHT_GRAY);
        button5.setPreferredSize(new Dimension(100,30));
        button5.setFont(btnFont);
        JButton button6 = new JButton("Help");
        button6.setPreferredSize(new Dimension(100,30));
        button6.setBackground(Color.LIGHT_GRAY);
        button6.setFont(btnFont);
        btnPanelRightSide.add(button4);
        btnPanelRightSide.add(button5);
        btnPanelRightSide.add(button6);
        
        //aside panel components
        LineBorder asideBorder = new LineBorder(Color.LIGHT_GRAY, 4, true); 
        asidePanel.setLayout(new BoxLayout(asidePanel, BoxLayout.Y_AXIS));
        asidePanel.setBorder(asideBorder);
        asidePanel.setBackground(Color.darkGray);  
        JLabel aSideLbl01 = new JLabel("Welcome to this virtual ATM Machine");
        aSideLbl01.setAlignmentX(CENTER_ALIGNMENT);
        aSideLbl01.setForeground(Color.white);

        //screen radio label
        screenRdioLbl.setForeground(Color.LIGHT_GRAY);
        screenRdioLbl.setAlignmentX(CENTER_ALIGNMENT);
        screenRdioLbl.setFont(regFont);

        //screen radio panel 

        JRadioButton aSideRadio01 = new JRadioButton("Yes");
        aSideRadio01.setAlignmentY(CENTER_ALIGNMENT);

        JRadioButton aSideRadio02 = new JRadioButton("No");
        
        //aside radio paneL
        screenRadioPnl.setBackground(Color.DARK_GRAY);
        aSideRadio01.setBackground(Color.DARK_GRAY);
        aSideRadio01.setForeground(Color.LIGHT_GRAY);
        aSideRadio02.setBackground(Color.DARK_GRAY);
        aSideRadio02.setForeground(Color.LIGHT_GRAY);
        screenRadioPnl.add(aSideRadio01);
        screenRadioPnl.add(aSideRadio02);

        asidePanel.add(aSideLbl01);
        asidePanel.add(screenRdioLbl);
        asidePanel.add(screenRadioPnl);
        
        //footer Panel
        ftrPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30,5));
        JLabel footerLbl = new JLabel("Thank you for Banking with us");
        footerLbl.setForeground(Color.LIGHT_GRAY);
        JButton footerBtn01 = new JButton("<html>Quick Cash &#x20AC;20</html>");
        footerBtn01.setBackground(Color.LIGHT_GRAY);
        footerBtn01.setFont(btnFont);

        JButton footerBtn02 = new JButton("Log Out");
        footerBtn02.setBackground(Color.DARK_GRAY);
        footerBtn02.setForeground(Color.RED);
        footerBtn02.setFont(logOutFont);

        ftrPanel.setBackground(Color.DARK_GRAY);
        ftrPanel.setForeground(Color.LIGHT_GRAY);
        
        ftrPanel.add(footerLbl);
        ftrPanel.add(footerBtn01);
        ftrPanel.add(footerBtn02);
        
      //add panels to content Pane
        contentPane.add(wlcomePanel, BorderLayout.NORTH);
        contentPane.add(btnPanelLeftSide, BorderLayout.LINE_START);
        contentPane.add(btnPanelRightSide, BorderLayout.LINE_END);
        contentPane.add(asidePanel, BorderLayout.CENTER);
        contentPane.add(ftrPanel, BorderLayout.SOUTH);

        //frame config
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(500,50);
    }
}
