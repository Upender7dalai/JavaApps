

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Chat implements ActionListener{

	JFrame f;
	JPanel p,p1,p2;
	JLabel l,l1,l2;
	JButton b1,b2;
	JLayeredPane lp;

	Chat(){

	f=new JFrame();
	p=new JPanel();
	p1=new JPanel();
	p2=new JPanel();
	l=new JLabel();
	l1=new JLabel();
	l2=new JLabel();
	b1=new JButton("GroupChat");
	b1.addActionListener(this);
	b2=new JButton("PersonalChat");
	b2.addActionListener(this);
	lp = new JLayeredPane();
	f.setSize(830, 650);
    f.add(lp);

		l.setIcon(new ImageIcon("bg.png"));
        l1.setIcon(new ImageIcon("G_Chat.jpg"));
        l2.setIcon(new ImageIcon("P_Chat.jpg"));
        p.add(l);
        p1.add(l1);
        p2.add(l2);

        p.setBounds(0, 0, 830, 650);
        p1.setBounds(30, 150, 400, 300);
        p1.setOpaque(false);
        p2.setBounds(450, 150, 400, 300);
        p2.setOpaque(false);
        b1.setBounds(150, 450, 150, 30);
        b2.setBounds(600, 450, 150, 30);


		lp.add(p, new Integer(1));
        lp.add(p1, new Integer(2));
        lp.add(p2, new Integer(3));
        lp.add(b1, new Integer(4));
        lp.add(b2, new Integer(5));

        f.setResizable(false);
        f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				new G_Chat();
			}

			if (e.getSource() == b2) {
							new P_Chat();
			}

		}

	public static void main(String []args){
		new Chat();
	}
}