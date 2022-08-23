package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GetMoney implements ActionListener
{
	JFrame f;
	
	JLabel l1,l2,l3,l4;
	
	JButton b1,b2,b3,b4;
	
	JTextField tf1,tf2;
	
	JPasswordField pf;
	
	User u;
	
	ArrayList<Car>cars;
	
	String x = null;
	String y = null;
	double d = 0;
	
	public GetMoney(User a, ArrayList<Car>cars1)
	{
		u = a;
		
		cars = cars1;
		
		f = new JFrame("Add Balance");
		
		Color col = new Color(214, 21, 63);
		Font font = new Font("Segoe Ui Black",Font.BOLD,14);
		
		l1 = new JLabel("Your chosen bank: "+u.getBankName());
		l1.setBounds(100,50,400,30);
		l1.setForeground(new Color(214, 21, 63));
		l1.setFont(font);
		
		l2 = new JLabel("Your Bank Account Number: "+u.getBankAccNo());
		l2.setBounds(100,85,300,30);
		l2.setForeground(new Color(214, 21, 63));
		l2.setFont(font);
		
		l3 = new JLabel("Bank Account Password:");
		l3.setBounds(100,120,200,30);
		l3.setForeground(new Color(214, 21, 63));
		l3.setFont(font);
		
		l4 = new JLabel("Enter Balance you want to use for purchasing:");
		l4.setBounds(100,85,400,30);
		l4.setForeground(new Color(214, 21, 63));
		l4.setFont(font);
		l4.setVisible(false);
		
		tf2 = new JTextField();
		tf2.setBounds(230,125,120,30);
		tf2.setForeground(col);
		tf2.setBackground(new Color (31, 29, 29));
		tf2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		tf2.setVisible(false);
		
		pf = new JPasswordField();
		pf.setForeground(col);
		pf.setBackground(new Color (31, 29, 29));
		pf.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		pf.setBounds(300,120,150,30);
		
		b1 = new JButton("Confirm");
		b1.setBounds(240,165,120,30);
		b1.setForeground(col);
		b1.setBackground(new Color (31, 29, 29));
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		b1.addActionListener(this);
		
		b2 = new JButton("Confirm");
		b2.setBounds(230,160,120,30);
		b2.setForeground(col);
		b2.setBackground(new Color (31, 29, 29));
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		b2.addActionListener(this);
		b2.setVisible(false);
		
		b3 = new JButton("Do it Later");
		b3.setBounds(240,205,120,30);
		b3.setForeground(col);
		b3.setBackground(new Color (31, 29, 29));
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.addActionListener(this);
		
		b4 = new JButton("Cancel");
		b4.setBounds(230,245,120,30);
		b4.setForeground(col);
		b4.setBackground(new Color (31, 29, 29));
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		b4.addActionListener(this);
		b4.setVisible(false);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(tf2);
		f.add(pf);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		ImageIcon i = new ImageIcon("Images/dollar.png");
		
		f.setSize(600,400);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setResizable(false);
		f.setIconImage(i.getImage());
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			y = String.valueOf(pf.getPassword());
			
			if(y.isEmpty()==false)
			{
				if(u.getBankAccPass().equals(y))
				{
					l2.setVisible(false);
					l3.setVisible(false);
					l4.setVisible(true);
					tf2.setVisible(true);
					pf.setVisible(false);
					b1.setVisible(false);
					b2.setVisible(true);
					b3.setVisible(false);
					b4.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Your Pass does NOT match. Try again");
				}
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
				u.setBalance(u.getBalance()+d);
				JOptionPane.showMessageDialog(null, ((String.format("%.2f", d)+" $ has been added to your account.")));
				new Home(u,cars);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid amount.Try again.");
			}
		}
		
		if(e.getSource()==b3)
		{
			new Home(u,cars);
			f.setVisible(false);
		}
		
		if(e.getSource()==b4)
		{
			new Home(u,cars);
			f.setVisible(false);
		}
	}
}
