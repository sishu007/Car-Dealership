package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AddNewUser implements ActionListener
{
	JFrame f;
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	
	JTextField tf1,tf2,tf3,tf4;
	
	JPasswordField pf;
	
	JComboBox<?> combo;
	
	JButton b1,back;
	
	User u;
	
	ArrayList<Car> cars;
	
	AddNewUser(User a, ArrayList<Car>cars1)
	{
		u = a;

		cars = cars1;
		
		ImageIcon i = new ImageIcon("Images/logocircle.png");
		ImageIcon i1 = new ImageIcon("Images/icon circle.png");
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		Font font = new Font("Comic Sans MS",Font.BOLD,16);
		
		f = new JFrame("Add an User");
		
		l1 = new JLabel(i);
		l1.setBounds(113,10,250,250);
		
		l2 = new JLabel("Add a new User");
		l2.setForeground(new Color(13, 247, 255));
		l2.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		l2.setBounds(149,270,300,30);
		
		l3 = new JLabel("Full name:");
		l3.setBounds(100, 310, 200, 20);
		l3.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l3.setForeground(col);
		
		l4 = new JLabel("New user name:");
		l4.setBounds(100, 340, 200, 20);
		l4.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l4.setForeground(col);
		
		l5 = new JLabel("New Password:");
		l5.setBounds(100, 370, 200, 20);
		l5.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l5.setForeground(col);
		
		l6 = new JLabel("Select Bank:");
		l6.setBounds(100, 400, 200, 20);
		l6.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l6.setForeground(col);
		
		l7 = new JLabel("Delivery Address:");
		l7.setBounds(100, 430, 200, 20);
		l7.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l7.setForeground(col);
		
		l8 = new JLabel("Bank Account No.:");
		l8.setBounds(100, 460, 200, 20);
		l8.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l8.setForeground(col);
		
		tf1 = new JTextField();
		tf1.setBounds(240,313,150,20);
		tf1.setForeground(col);
        tf1.setFont(font);
        tf1.setBackground(col1);
		
		tf2 = new JTextField();
		tf2.setBounds(240,343,150,20);
		tf2.setForeground(col);
        tf2.setFont(font);
        tf2.setBackground(col1);
		
		tf3 = new JTextField();
		tf3.setForeground(col);
        tf3.setFont(font);
        tf3.setBackground(col1);
		tf3.setBounds(240,433,150,20);
		
		tf4 = new JTextField();
		tf4.setForeground(col);
        tf4.setFont(font);
        tf4.setBackground(col1);
		tf4.setBounds(240,463,150,20);
		
		pf = new JPasswordField();
		pf.setForeground(col);
        pf.setFont(font);
        pf.setBackground(col1);
		pf.setBounds(240,373,150,20);
		
		String banks[] = {"BRAC Bank", "Dhaka Bank", "DBB", "Sonali Bank"};
        combo = new JComboBox<>(banks);
        combo.setForeground(col);
        combo.setFont(font);
        combo.setBackground(col1);
        combo.setBounds(240,403, 150, 20);
        
        b1 = new JButton("Add User");
		b1.setBounds(175,510,130,30);
		b1.setForeground(col);
		b1.setBackground(col1);
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.addActionListener(this);
		
		back = new JButton("Back");
		back.setBounds(10,10,90,30);
		back.setForeground(col);
		back.setBackground(col1);
		back.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		back.addActionListener(this);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(tf1);
		f.add(tf2);
		f.add(tf2);
		f.add(pf);
		f.add(tf3);
		f.add(tf4);
		f.add(combo);
		f.add(b1);
		f.add(back);
		
		f.setSize(500,630);
		f.getContentPane().setBackground(new Color(48, 47, 47));
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(i1.getImage());
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			String a = tf1.getText();
			String b = tf2.getText();
			String c = String.valueOf(pf.getPassword());
			String d = combo.getSelectedItem().toString();
			String e1 = tf3.getText();
			String f1 = tf4.getText();
			
			User u1 = null;
			
			if((a.isEmpty()!=true) && (b.isEmpty()!=true) && (c.isEmpty()!=true) && (d.isEmpty()!=true) && (f1.isEmpty()!=true))
			{
				u1 = new User(a,b,c,"Regular",d,e1,f1);
				
				if(Login.searchUser(u1)!=null)
				{
					JOptionPane.showMessageDialog(null,"an user already exists with that username");
				}
				else
				{
					Login.addUser(u1);
					new ShowUsers(u,cars);
					f.setVisible(false);
				}
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Please fill all the fields properly");
			}
		}
		
		if(e.getSource()==back)
		{
			new ShowUsers(u,cars);
			f.dispose();
		}
	}
}
