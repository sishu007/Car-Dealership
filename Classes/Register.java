package Classes;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class Register implements ActionListener 
{
	static User u;
	
	ArrayList<Car>cars;
	
	JFrame f;
	
	ImageIcon i1,i2;
	
	JLabel l1,l2,l3,l4,l5,l6,l7;
	
	JTextField tf1, tf2, tf3;
	
	JPasswordField pf1;
	
	JButton b1, b2, b3;
	
	JComboBox<?> combo;
	
	Register(User a, ArrayList<Car>cars1)
	{
		u=a;
		
		cars = cars1;
		
		f = new JFrame();
		
		i1 = new ImageIcon("Images/more cars.jpg");
		i2 = new ImageIcon("Images/Images/icon circle.png");
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		Font font = new Font("Comic Sans MS", Font.BOLD, 14);
		
		l1 = new JLabel();
		l1.setIcon(i1);
		l1.setBounds(0,0,1124,633);
		
		l2 = new JLabel("Please fill up all the fields accordingly:");
		l2.setBounds(380, 50, 400, 30);
		l2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		l2.setForeground(new Color (255,254,237));
		
		l3 = new JLabel("Full name:");
		l3.setBounds(410, 90, 200, 20);
		l3.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l3.setForeground(col);
		
		l4 = new JLabel("New user name:");
		l4.setBounds(410, 120, 200, 20);
		l4.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l4.setForeground(col);
		
		l5 = new JLabel("New Password:");
		l5.setBounds(410, 150, 200, 20);
		l5.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l5.setForeground(col);
		
		l6 = new JLabel("Select Bank:");
		l6.setBounds(410, 210, 200, 20);
		l6.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l6.setForeground(col);
		
		l7 = new JLabel("Delivery Address:");
		l7.setBounds(410, 180, 200, 20);
		l7.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l7.setForeground(col);
		
		tf1 = new JTextField();
		tf1.setBounds(553,93,150,20);
		tf1.setForeground(col);
        tf1.setFont(font);
        tf1.setBackground(col1);
		
		tf2 = new JTextField();
		tf2.setBounds(553,123,150,20);
		tf2.setForeground(col);
        tf2.setFont(font);
        tf2.setBackground(col1);
		
		tf3 = new JTextField();
		tf3.setForeground(col);
        tf3.setFont(font);
        tf3.setBackground(col1);
		tf3.setBounds(553,183,150,20);
		
		pf1 = new JPasswordField();
		pf1.setForeground(col);
        pf1.setFont(font);
        pf1.setBackground(col1);
		pf1.setBounds(553,153,150,20);
		
		b1 = new JButton("Pervious");  
        b1.setBounds(17,15,85,25);  
        b1.setForeground(col);
        b1.setFont(font);
        b1.setBackground(col1);
        b1.addActionListener(this);
        
        b2 = new JButton("Exit");  
        b2.setBounds(1000,15,85,25);  
        b2.setForeground(col);
        b2.setFont(font);
        b2.setBackground(col1);
        b2.addActionListener(this);
        
        b3 = new JButton("Register");  
        b3.setBounds(520,244,95,25);  
        b3.setForeground(col);
        b3.setFont(font);
        b3.setBackground(col1);
        b3.addActionListener(this);
        
        String banks[] = {"BRAC Bank", "Dhaka Bank", "DBB", "Sonali Bank"};
        combo = new JComboBox<>(banks);
        combo.setForeground(col);
        combo.setFont(font);
        combo.setBackground(col1);
        combo.setBounds(553,212, 150, 20);
		
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(pf1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(combo);
		f.add(l1);
		
		f.setSize(1124,633);
		f.setTitle("Want to make an account?");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(i2.getImage());
		f.getContentPane().setBackground(new Color (0,10,20));
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			new Login(cars);
			f.setVisible(false);
		}
		
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		
		if(e.getSource()==b3)
		{
			String a = tf1.getText();
			String b = tf2.getText();
			String c = String.valueOf(pf1.getPassword());
			String e1 = combo.getSelectedItem().toString();
			String d = tf3.getText();
			
			User u=null;
			
			if((a.isEmpty()!=true) && (b.isEmpty()!=true) && (c.isEmpty()!=true) && (d.isEmpty()!=true))
			{
				u = new User(a,b,c,"Regular",e1,d);
				
				if(Login.searchUser(u)!=null)
				{
					JOptionPane.showMessageDialog(null,"an user already exists with that username");
				}
				else
				{
					new Money(u,cars);
					f.setVisible(false);
				}
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Please fill all the fields properly");
			}
		}
	}
}
