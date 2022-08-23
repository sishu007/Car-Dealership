package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Money implements ActionListener
{
	JFrame f;
	
	JLabel l1,l2,l3,l4;
	
	JButton b1,b2,b3,b4;
	
	JTextField tf1,tf2;
	
	JPasswordField pf;
	
	ArrayList<Car>cars;
	
	User u;
	
	String x = null;
	String y = null;
	double d = 0;
	
	public Money(User a, ArrayList<Car>cars1)
	{
		u = a;
		
		cars = cars1;
		
		Color col = new Color(214, 21, 63);
		Font font = new Font("Segoe Ui Black",Font.BOLD,14);
		
		f = new JFrame("Add Money to account");
		
		l1 = new JLabel("Your chosen bank: "+u.getBankName());
		l1.setBounds(80,50,300,30);
		l1.setForeground(col);
		l1.setFont(font);
		
		l2 = new JLabel("Enter your Bank Account Number:");
		l2.setBounds(80,85,300,30);
		l2.setForeground(col);
		l2.setFont(font);
		
		l3 = new JLabel("Enter your Bank Account Password:");
		l3.setBounds(80,120,300,30);
		l3.setForeground(col);
		l3.setFont(font);
		
		l4 = new JLabel("Enter Balance you want to use for purchasing:");
		l4.setBounds(80,85,350,30);
		l4.setForeground(col);
		l4.setFont(font);
		l4.setVisible(false);
		
		tf1 = new JTextField();
		tf1.setForeground(col);
		tf1.setBackground(new Color (31, 29, 29));
		tf1.setFont(font);
		tf1.setBounds(350,85,100,30);
		
		tf2 = new JTextField();
		tf2.setBounds(230,125,120,30);
		tf2.setForeground(col);
		tf2.setBackground(new Color (31, 29, 29));
		tf2.setFont(font);
		tf2.setVisible(false);
		
		pf = new JPasswordField();
		pf.setForeground(col);
		pf.setBackground(new Color (31, 29, 29));
		pf.setFont(font);
		pf.setBounds(350,120,150,30);
		
		b1 = new JButton("Confirm");
		b1.setBounds(240,165,120,30);
		b1.setForeground(col);
		b1.setBackground(new Color (31, 29, 29));
		b1.setFont(font);
		b1.addActionListener(this);
		
		b2 = new JButton("Confirm");
		b2.setBounds(230,160,120,30);
		b2.setForeground(col);
		b2.setBackground(new Color (31, 29, 29));
		b2.setFont(font);
		b2.addActionListener(this);
		b2.setVisible(false);
		
		b3 = new JButton("Quit Registration");
		b3.setBounds(230,205,140,30);
		b3.setForeground(col);
		b3.setBackground(new Color (31, 29, 29));
		b3.setFont(font);
		b3.addActionListener(this);
		
		b4 = new JButton("Do it later");
		b4.setBounds(230,225,120,30);
		b4.setForeground(col);
		b4.setBackground(new Color (31, 29, 29));
		b4.setFont(font);
		b4.addActionListener(this);
		b4.setVisible(false);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(tf1);
		f.add(tf2);
		f.add(pf);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		ImageIcon i = new ImageIcon("Images/dollar.png");
		
		f.setIconImage(i.getImage());
		f.setSize(600,400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		x = tf1.getText();
		y = String.valueOf(pf.getPassword());
		
		u.setBankAccNo(x);
		u.setBankAccPass(y);
		
		if(e.getSource()==b1)
		{
			b3.setVisible(false);
			
			
			if(x.isEmpty()==false && y.isEmpty()==false)
			{
				JOptionPane.showMessageDialog(null, "Bank account No. "+x+" added to RRAM Car Dealers");
				Login.add(u);
				l2.setVisible(false);
				l3.setVisible(false);
				l4.setVisible(true);
				tf1.setVisible(false);
				tf2.setVisible(true);
				pf.setVisible(false);
				b1.setVisible(false);
				b2.setVisible(true);
				b3.setVisible(false);
				b4.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Fill all the fields accordingly.");
			}
		}
		
		if(e.getSource()==b2)
		{
			String test = tf2.getText();

			if(test.isEmpty()==false)
			{
				try
				{
					d = Double.parseDouble(test);
				}
				catch(NumberFormatException nfe)
				{	
					System.out.println("Number Format Exception caught");
					JOptionPane.showMessageDialog(null,"Enter a numeric value");
				}
			}
			
			if(d>0)
			{
				u.setBalance(d);
				JOptionPane.showMessageDialog(null, "Your account balance has been set to: "+String.format("%.2f", u.getBalance())+" $");
				new Login(cars);
				f.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid amount.Try again.");
			}
		}
		
		if(e.getSource()==b3)
		{
			JOptionPane.showMessageDialog(null, "You can register later by clicking \"Regsiter\"");
			new Login(cars);
			f.setVisible(false);
		}
		
		if(e.getSource()==b4)
		{
			new Login(cars);
			f.setVisible(false);
		}
	}
}