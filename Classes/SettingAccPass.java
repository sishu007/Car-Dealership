package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SettingAccPass implements ActionListener
{
	JFrame f;
	
	JLabel l1,l2,l3,l4;
	
	JTextField tf;
	
	JPasswordField pf;
	
	JButton b1,b2,b3,b4;
	
	User u;
	
	ArrayList<Car>cars;
	
	SettingAccPass(User a, ArrayList<Car>cars1)
	{
		u = a;
		
		cars = cars1;
		
		f = new JFrame("Get Money");
		
		ImageIcon i = new ImageIcon("Images/icon circle.png");
		
		Color col = new Color(214, 21, 63);
		Font font = new Font("Segoe Ui Black",Font.BOLD,14);
		
		l1 = new JLabel("Your chosen bank: "+u.getBankName());
		l1.setBounds(100,20,400,30);
		l1.setForeground(col);
		l1.setFont(font);
		
		l2 = new JLabel("Bank Account Password:");
		l2.setBounds(100,85,200,30);
		l2.setForeground(new Color(214, 21, 63));
		l2.setFont(font);
		
		l3 = new JLabel("Enter Balance you want to use for purchasing:");
		l3.setBounds(100,85,400,30);
		l3.setForeground(new Color(214, 21, 63));
		l3.setFont(font);
		l3.setVisible(false);
		
		l4 = new JLabel("Your Back Acc No.: "+u.getBankAccNo());
		l4.setBounds(100,55,400,30);
		l4.setForeground(new Color(214, 21, 63));
		l4.setFont(font);
		
		tf = new JTextField();
		tf.setBounds(230,125,120,30);
		tf.setForeground(col);
		tf.setBackground(new Color (31, 29, 29));
		tf.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		tf.setVisible(false);
		
		pf = new JPasswordField();
		pf.setBounds(300,85,100,30);
		pf.setForeground(col);
		pf.setBackground(new Color (31, 29, 29));
		pf.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		
		b1 = new JButton("Confirm");
		b1.setBounds(240,165,120,30);
		b1.setForeground(col);
		b1.setBackground(new Color (31, 29, 29));
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		b1.addActionListener(this);
		
		b2 = new JButton("Cancel");
		b2.setBounds(240,205,120,30);
		b2.setForeground(col);
		b2.setBackground(new Color (31, 29, 29));
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		b2.addActionListener(this);
		
		b3 = new JButton("Do it Later");
		b3.setBounds(230,215,120,30);
		b3.setForeground(col);
		b3.setBackground(new Color (31, 29, 29));
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.addActionListener(this);
		b3.setVisible(false);
		
		b4 = new JButton("Confirm");
		b4.setBounds(230,170,120,30);
		b4.setForeground(col);
		b4.setBackground(new Color (31, 29, 29));
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		b4.addActionListener(this);
		b4.setVisible(false);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(tf);
		f.add(pf);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setSize(600,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setIconImage(i.getImage());
		f.setResizable(false);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String a = String.valueOf(pf.getPassword());
			
			if(a.isEmpty()==false) 
			{
				u.setBankAccPass(a);
				
				l2.setVisible(false);
				pf.setVisible(false);
				b1.setVisible(false);
				b2.setVisible(false);
				
				l3.setVisible(true);
				tf.setVisible(true);
				b3.setVisible(true);
				b4.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Enter password first");
			}
		}
		
		if(e.getSource()==b2)
		{
			new Home(u,cars);
			f.dispose();
		}
		
		if(e.getSource()==b3)
		{
			new Home(u,cars);
			f.dispose();
		}
		
		if(e.getSource()==b4)
		{
			double d = 0;
			try
			{
				d = Double.parseDouble(tf.getText());
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Number Format Exception caught");
				JOptionPane.showMessageDialog(null,"Enter a numeric value");
			}
			
			if(d>=0)
			{
				u.setBalance(u.getBalance()+d);
				JOptionPane.showMessageDialog(null, ((String.format("%.2f", d)+" $ has been added to your account.")));
				new Home(u,cars);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid amount.Try again.");
			}
		}
	}
}
