package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Home implements ActionListener
{
	ArrayList<Car> cars;
	
	static User u;
	
	JFrame f;
	
	ImageIcon i1,i2;
	
	JLabel l1,l2,l3,l4,l5;
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	Home(User a, ArrayList<Car>cars1)
	{
		u = a;
		
		cars = cars1;
		
		f = new JFrame();
		
		i1 = new ImageIcon ("Images/cars.jpg");
		i2 = new ImageIcon("Images/icon circle.png");
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		Color col2 = new Color(13, 247, 255);
		Font font = new Font("Comic Sans MS", Font.BOLD, 15);
		
		l1 = new JLabel();
		l1.setIcon(i1);
		l1.setBounds(0,0,1124,633);
		
		l2 = new JLabel("Welcome, "+u.getName());
		l2.setBounds(430,60,400,30);
		l2.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		l2.setBackground(col1);
		l2.setForeground(col);
		
		l4 = new JLabel("Balance: "+String.format("%.2f", u.getBalance())+" $");
		l4.setBounds(450,110,270,30);
		l4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		l4.setForeground(new Color(13, 247, 255));
		
		l5 = new JLabel(i1);
		l5.setBounds(0,0,1124,633);
        
        b2 = new JButton("Exit");  
        b2.setBounds(1000,15,100,30);  
        b2.setForeground(col);
        b2.setFont(font);
        b2.setBackground(col1);
        b2.addActionListener(this);
        
        b3 = new JButton("Buy cars");  
        b3.setBounds(523,460,100,35); 
        b3.setForeground(col2);
        b3.setFont(font);
        b3.setBackground(col1);
        b3.addActionListener(this);
        
        b4 = new JButton("Logout");  
        b4.setBounds(17,15,100,30); 
        b4.setForeground(col);
        b4.setFont(font);
        b4.setBackground(col1);
        b4.addActionListener(this);
        
        b5 = new JButton("Add/remove cars");  
        b5.setBounds(490,510,160,35);  
        b5.setForeground(new Color(10, 255, 92));
        b5.setFont(font);
        b5.setBackground(col1);
        b5.addActionListener(this);
        b5.setVisible(false);
        
        b6 = new JButton("Financials");  
        b6.setBounds(330,460,125,35);
        b6.setForeground(col2);
        b6.setFont(font);
        b6.setBackground(col1);
        b6.addActionListener(this);
        b6.setVisible(false);
        
        b7 = new JButton("My Garage");  
        b7.setBounds(680,460,125,35);  
        b7.setForeground(col2);
        b7.setFont(font);
        b7.setBackground(col1);
        b7.addActionListener(this);
        
        b8 = new JButton("Manage users");  
        b8.setBounds(500,160,135,35);  
        b8.setForeground(new Color(10, 255, 92));
        b8.setFont(font);
        b8.setBackground(col1);
        b8.addActionListener(this);
        b8.setVisible(false);
        
        b9 = new JButton("Financials");  
        b9.setBounds(330,460,125,35);
        b9.setForeground(col2);
        b9.setFont(font);
        b9.setBackground(col1);
        b9.addActionListener(this);
        b9.setVisible(false);
        
        if(u.getBankAccPass()!=null)
        {
        	b6.setVisible(true);
        }
        else
        {
        	b9.setVisible(true);
        }
        
        if(u.getType().equals("Admin"))
        {
        	b5.setVisible(true);
        	b8.setVisible(true);
        }
        else
        {
        	b5.setVisible(false);
        	b8.setVisible(false);
        }
		
		//f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(l2);
		f.add(l4);
		f.add(l1);
		
		f.setSize(1124,633);
		f.setTitle("Home");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(i2.getImage());
		f.getContentPane().setBackground(new Color (31, 29, 29));
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		
		if(e.getSource()==b3)
		{
			new BuyCar(u,cars);
			f.setVisible(false);
		}
		
		if(e.getSource()==b4)
		{
			new Login(cars);
			f.dispose();
		}
		
		if(e.getSource()==b5)
		{
			new AddorRemoveCars(u,cars);
			f.setVisible(false);
		}
		
		if(e.getSource()==b6)
		{
			new GetMoney(u,cars);
			f.setVisible(false);
		}
		
		if(e.getSource()==b7)
		{
			new Garage(u,cars);
			f.setVisible(false);
		}
		
		if(e.getSource()==b8)
		{	
			new ShowUsers(u,cars);
			f.setVisible(false);
		}
		
		if(e.getSource()==b9)
		{
			new SettingAccPass(u,cars);
			f.setVisible(false);
		}
	}
}
