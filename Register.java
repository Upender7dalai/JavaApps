
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Register implements ActionListener {

    JFrame f;
    JPanel p, p0, p1, p2, p3, p4;
    JLabel l, img, l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JTextField t1, t2, t3, t6, t7;
    JPasswordField t4, t5;
    JComboBox dd, mm, yy;
    JRadioButton rb1, rb2;
    JButton b1, b2, b3;
    JLayeredPane lp;
    String[] day = {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    String[] month = {"Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    String[] year = {"Year", "1975", "1976", "1977", "1978", "1979", "1980",
        "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988",
        "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996",
        "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
        "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012",
        "2013", "2014", "2015"};

    Register() {

        f = new JFrame();
        p = new JPanel();
        p0 = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        l = new JLabel();
        img = new JLabel();
        l1 = new JLabel("First Name");
        l2 = new JLabel("Last Name");
        l3 = new JLabel("UserID");
        l4 = new JLabel("New Password");
        l5 = new JLabel("Confirm Password");
        l6 = new JLabel("Age");
        l7 = new JLabel("Mobile No.");
        l8 = new JLabel("Date Of Birth");
        l9 = new JLabel("Gender");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JPasswordField(20);
        t5 = new JPasswordField(20);
        t6 = new JTextField(20);
        t7 = new JTextField(20);
        dd = new JComboBox(day);
        mm = new JComboBox(month);
        yy = new JComboBox(year);
        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");
        b1 = new JButton("Submit");
        b1.addActionListener(this);
        b2 = new JButton("Reset");
        b2.addActionListener(this);
        b3 = new JButton("Back");
        b3.addActionListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        lp = new JLayeredPane();


        p1.add(dd);
        p1.add(mm);
        p1.add(yy);
        p2.add(rb1);
        p2.add(rb2);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);

        l.setIcon(new ImageIcon("bg.png"));
        img.setIcon(new ImageIcon("bg1.jpg"));
        p.add(l);
        p4.add(img);

        p0.setLayout(new GridBagLayout());
        GridBagConstraints o = new GridBagConstraints();

	        //p0.setBackground(new Color(135, 121, 177));
        o.insets = new Insets(10, 10, 10, 10);
        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 1;
        o.gridy = 2;
        p0.add(l1, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 2;
        o.gridy = 2;
        p0.add(t1, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 1;
        o.gridy = 3;
        p0.add(l2, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 2;
        o.gridy = 3;
        p0.add(t2, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 1;
        o.gridy = 4;
        p0.add(l3, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 2;
        o.gridy = 4;
        p0.add(t3, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 1;
        o.gridy = 5;
        p0.add(l4, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 2;
        o.gridy = 5;
        p0.add(t4, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 1;
        o.gridy = 6;
        p0.add(l5, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 2;
        o.gridy = 6;
        p0.add(t5, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 1;
        o.gridy = 7;
        p0.add(l6, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 2;
        o.gridy = 7;
        p0.add(t6, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 1;
        o.gridy = 8;
        p0.add(l7, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 2;
        o.gridy = 8;
        p0.add(t7, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 1;
        o.gridy = 9;
        p0.add(l8, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 2;
        o.gridy = 9;
        p0.add(p1, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 1;
        o.gridy = 10;
        p0.add(l9, o);

        o.fill = GridBagConstraints.HORIZONTAL;
        o.gridx = 2;
        o.gridy = 10;
        p0.add(p2, o);

        f.add(lp);
        p1.setBounds(50, 50, 500, 500);
        p2.setBounds(100, 150, 400, 400);

        p.setBounds(0, 0, 830, 650);
        p0.setBounds(350, 70, 500, 500);
        p3.setBounds(250, 550, 300, 50);
        p4.setBounds(20, 170, 350, 256);
        p0.setOpaque(false);
        p1.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        p4.setOpaque(false);

        lp.add(p, new Integer(0));
        lp.add(p0, new Integer(1));
        lp.add(p3, new Integer(2));
        lp.add(p4, new Integer(3));
        f.add(lp);

        f.setSize(830, 650);
        f.setResizable(false);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
        String s4 = t4.getText();
        String s5 = t5.getText();
        String s6 = t6.getText();
        String s7 = t7.getText();
        String d=(String) dd.getSelectedItem();
        String m=(String) mm.getSelectedItem();
        String y=(String) yy.getSelectedItem();
        String s8=d+"-"+m+"-"+y;
        String s9;
        if(rb1.isSelected())
        {  s9=rb1.getText();
        }else
        {  s9=rb2.getText();}


        if (e.getSource() == b1) {

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Niit123");
                PreparedStatement rs = con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?)");

                rs.setString(1, s1);
                rs.setString(2, s2);
                rs.setString(3, s3);
                rs.setString(4, s4);
                rs.setString(5, s5);
                rs.setString(6, s6);
                rs.setString(7, s7);
				rs.setString(8,s8);
                rs.setString(9,s9);

                int i = rs.executeUpdate();

                System.out.println("Data inserted successfully");

                con.close();
            } catch (Exception ex) {
                System.err.println(ex);
            }

        }

        if (e.getSource() == b2) {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            t4.setText(" ");
            t5.setText(" ");
            t6.setText(" ");
            t7.setText(" ");

        }

        if(e.getSource()== b3){
			f.setVisible(false);
            new LoginWindow();
        }

    }

    public static void main(String s[]) {

        new Register();
    }

}
