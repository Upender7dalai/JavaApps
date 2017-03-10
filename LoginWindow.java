
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class LoginWindow implements ActionListener {

    // adding attributes
    JFrame f1;
    JPanel p, p1, p2;
    JLabel l, l1, l2, l3;
    JTextField t1;
    JPasswordField pwd;
    JButton b1, b2;
    JLayeredPane lp;

    // adding constructor
    public LoginWindow() {
        f1 = new JFrame("Login Window");
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        l = new JLabel();
        l1 = new JLabel("User Id");
        l2 = new JLabel("Password");
        l3 = new JLabel();
        t1 = new JTextField(15);
        pwd = new JPasswordField(15);
        b1 = new JButton("Login");
        b1.addActionListener(this);
        b2 = new JButton("New User");
        b2.addActionListener(this);
        lp = new JLayeredPane();
        f1.setSize(830, 650);
        f1.add(lp);

        l.setIcon(new ImageIcon("bg.png"));
        l3.setIcon(new ImageIcon("bg2.gif"));
        p.add(l);
        p2.add(l3);

        p.setBounds(0, 0, 830, 650);
        p1.setBounds(400, 70, 500, 500);
        p1.setOpaque(false);
        p2.setBounds(20, 170, 450, 350);
        p2.setOpaque(false);
        lp.add(p, new Integer(1));
        lp.add(p1, new Integer(2));
        lp.add(p2, new Integer(3));

        p1.setLayout(new GridBagLayout());

        GridBagConstraints obj = new GridBagConstraints();
        obj.fill = GridBagConstraints.HORIZONTAL;
        obj.gridx = 1;
        obj.gridy = 1;
        obj.insets = new Insets(10, 10, 10, 10);
        p1.add(l1, obj);
        obj.fill = GridBagConstraints.HORIZONTAL;
        obj.gridx = 2;
        obj.gridy = 1;
        p1.add(t1, obj);
        obj.fill = GridBagConstraints.HORIZONTAL;
        obj.gridx = 1;
        obj.gridy = 2;
        obj.insets = new Insets(10, 10, 10, 10);
        p1.add(l2, obj);
        obj.fill = GridBagConstraints.HORIZONTAL;
        obj.gridx = 2;
        obj.gridy = 2;
        p1.add(pwd, obj);
        obj.fill = GridBagConstraints.HORIZONTAL;
        obj.gridx = 1;
        obj.gridy = 3;
        obj.insets = new Insets(10, 10, 10, 10);
        p1.add(b1, obj);
        obj.fill = GridBagConstraints.HORIZONTAL;
        obj.gridx = 2;
        obj.gridy = 3;
        p1.add(b2, obj);

        f1.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = pwd.getText();

        if (e.getSource() == b1) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "Niit123");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select user_id,new_pwd from register");
                while (rs.next()) {
                    String u_id = rs.getString(1);
                    String n_pwd = rs.getString(2);

                    if(u_id.equals(s1) && n_pwd.equals(s2)){
						f1.setVisible(false);
						System.out.println(s1+"\tConnected to the Database!!" );
                        JOptionPane.showMessageDialog(null, new String("Welcome" + s1));

                        new Chat();
					}

                }
                con.close();
            } catch (Exception ex) {
                System.err.println(ex);
            }

            }

            if (e.getSource() == b2){
				new Register();
				}

    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}
