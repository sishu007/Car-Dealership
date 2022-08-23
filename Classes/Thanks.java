package Classes;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Thanks implements ActionListener
{
	JFrame f;
	
	JLabel l,l1,l2;
	
	JButton b1,b2;
	
	User u;
	
	ArrayList<Car> cars;
	
	Thanks(User a, ArrayList<Car> cars1)
	{
		u = a;
		
		cars = cars1;
		
		ImageIcon i = new ImageIcon("Images/logocircle.png");
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		Color col2 = new Color(13, 247, 255);
		
		f = new JFrame("Thank You");
		
		l = new JLabel();
		l.setIcon(i);
		l.setBounds(66,10,250,250);
		
		l1 = new JLabel("Thank you for your purchase");
		l1.setForeground(col);
		l1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l1.setBounds(80,270,300,30);
		
		l2 = new JLabel("Your car/s will be delivered in a week");
		l2.setForeground(col);
		l2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		l2.setBounds(45,310,330,30);
		
		b1 = new JButton("Buy another car");
		b1.setBounds(120,370,145,30);
		b1.setForeground(col2);
		b1.setBackground(col1);
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		b1.addActionListener(this);
		
		b2 = new JButton("Go to home");
		b2.setBounds(120,415,145,30);
		b2.setForeground(col2);
		b2.setBackground(col1);
		b2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		b2.addActionListener(this);
		
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		
		f.setSize(400,550);
		f.getContentPane().setBackground(new Color(48, 47, 47));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(i.getImage());
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			new BuyCar(u,cars);
			f.dispose();
		}
		
		if(e.getSource()==b2)
		{
			new Home(u,cars);
			f.dispose();
		}
	}
}
