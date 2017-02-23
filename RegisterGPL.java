import javax.swing.*;
import java.awt.*;


class RegisterGPL{

	JFrame f;
	JPanel p,p1,p2,p3;
	JLabel l,l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3;
	JPasswordField t4,t5;
	JComboBox dd,mm,yy;
	JRadioButton rb1,rb2;
	JButton b1,b2,b3;
	//JLayeredPane lp;


	RegisterGPL(){

	f=new JFrame();
	p=new JPanel();
	p1=new JPanel();
	p2=new JPanel();
	p3=new JPanel();
	l=new JLabel("Create New Account");
	l1=new JLabel("First Name");
	l2=new JLabel("Last Name");
	l3=new JLabel("Mobile no.");
	l4=new JLabel("New Password");
	l5=new JLabel("Confirm Password");
	l6=new JLabel("Date Of Birth(D/O/B)");
	l7=new JLabel("Gender");
	t1=new JTextField(10);
	t2=new JTextField(10);
	t3=new JTextField(10);
	t4=new JPasswordField(10);
	t5=new JPasswordField(10);
	dd=new JComboBox();
	mm=new JComboBox();
	yy=new JComboBox();
	rb1=new JRadioButton("Male");
	rb2=new JRadioButton("Female");
	b1=new JButton("Submit");
	b2=new JButton("Reset");
	b3=new JButton("Cancel");

	Font fonts=new Font("TimesNewRoman",Font.BOLD,24);
	l.setFont(fonts);
	p1.add(dd);
	p1.add(mm);
	p1.add(yy);
	p2.add(rb1);
	p2.add(rb2);
	p3.add(b1);
	p3.add(b2);
	p3.add(b3);

	//f.add(l);
	f.add(p);
	//p.setLayout(new GridLayout(8,2));
	p.setLayout(new GridBagLayout());
	GridBagConstraints o=new GridBagConstraints();
	p.setBackground(new Color(135,121,177));

	o.insets=new Insets(10,10,10,10);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=1;
			o.gridy=1;
			p.add(l,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=1;
			o.gridy=2;
			p.add(l1,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=2;
			o.gridy=2;
			p.add(t1,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=1;
			o.gridy=3;
			p.add(l2,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=2;
			o.gridy=3;
			p.add(t2,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=1;
			o.gridy=4;
			p.add(l3,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=2;
			o.gridy=4;
			p.add(t3,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=1;
			o.gridy=5;
			p.add(l4,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=2;
			o.gridy=5;
			p.add(t4,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=1;
			o.gridy=6;
			p.add(l5,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=2;
			o.gridy=6;
			p.add(t5,o);
			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=1;
			o.gridy=7;
			p.add(l6,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=2;
			o.gridy=7;
			p.add(p1,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=1;
			o.gridy=8;
			p.add(l7,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=2;
			o.gridy=8;
			p.add(p2,o);

			o.fill=GridBagConstraints.HORIZONTAL;
			o.gridx=1;
			o.gridy=9;
			p.add(p3,o);



	/*p.add(l1);p.add(t1);
	p.add(l2);p.add(t2);
	p.add(l3);p.add(t3);
	p.add(l4);p.add(t4);
	p.add(l5);p.add(t5);
	p.add(l6);p.add(p1);
	p.add(l7);p.add(p2);
	p.add(p3);*/

	f.setSize(700,700);
	f.setVisible(true);

	}

	public static void main(String args[]){
		new RegisterGPL();
	}
}