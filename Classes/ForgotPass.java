package Classes;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ForgotPass implements ActionListener
{
	User u;
	
	JFrame f;
	
	ImageIcon i1;
	
	JLabel l1,l2;
	
	JButton b1, b2, b3;
	
	JTextField tf1;
	
	ArrayList<Car> cars;
	
	ForgotPass(ArrayList<Car>a)
	{
		cars = a;
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		Font font = new Font("Comic Sans MS", Font.BOLD, 15);
		
		f = new JFrame();
		
		i1 = new ImageIcon("Images/forgotPass.jpg");
		
		l1 = new JLabel();
		l1.setIcon(i1);
		l1.setBounds(0,0,1124,633);
		
		l2 = new JLabel("Enter existing user name:");
		l2.setBounds(340,170,270,30);
		l2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		l2.setForeground(col);
		
		tf1 = new JTextField();
		tf1.setForeground(col);
        tf1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        tf1.setBackground(col1);
		tf1.setBounds(605,174,180,30);
		
		b1 = new JButton("Check");
		b1.setBounds(530,230,100,30);
		b1.setForeground(col);
        b1.setFont(font);
        b1.setBackground(col1);
		b1.addActionListener(this);
		
		b2 = new JButton("Pervious");  
        b2.setBounds(17,15,85,25);  
        b2.setForeground(col);
        b2.setFont(font);
        b2.setBackground(col1);
        b2.addActionListener(this);
        
        b3 = new JButton("Exit");  
        b3.setBounds(1000,15,85,25);  
        b3.setForeground(col);
        b3.setFont(font);
        b3.setBackground(col1);
        b3.addActionListener(this);
		
		f.add(tf1);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		
		f.setSize(1124,633);
		f.setResizable(false);
		f.setTitle("Forgot Password?");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==b1)
		{
			String a = tf1.getText();
			
			String oldPass = Login.forgetPass(a);
			
			if(oldPass != null)
			{
				JOptionPane.showMessageDialog(null, "Your password is: "+oldPass);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your username was not found.");
			}
		}
		
		if (e.getSource()==b2)
		{
			new Login(cars);
			f.setVisible(false);
		}
		
		if (e.getSource()==b3)
		{
			System.exit(0);
		}
	}
}
