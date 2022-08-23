package Classes;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AddorRemoveCars implements ActionListener
{
	JFrame f;
	
	JLabel l1,l2,l3,l4;
	
	JButton b1,b2,b3,b4,back;
	
	JScrollPane scroll;
	
	JTable table;
	
	DefaultTableModel model;
	
	JComboBox<?> combo;
	
	User u;
	
	ArrayList<String>carNames;
	
	ArrayList<Car> cars;
	
	public AddorRemoveCars(User a, ArrayList<Car> cars1)
	{
		u = a;
		
		cars = cars1;
		
		carNames = new ArrayList<String>();
		
		ArrayList<String>test = new ArrayList<String>();
		
		for(int i=0; i<cars1.size();i++)
		{
			test.add(cars1.get(i).getBrandName());
		}
		
		this.carNames = test;
		
		Color col = new Color(214, 21, 63);
		Font font = new Font("Segoe Ui Black",Font.BOLD,13);
		
		combo = new JComboBox<>(carNames.toArray());
		combo.setForeground(col);
		combo.setBackground(new Color (31, 29, 29));
		combo.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		combo.setBounds(270,140,120,30);
		
		f = new JFrame("Add cars");
		
		l1 = new JLabel("Balance: "+String.format("%.2f", u.getBalance())+" $");
		l1.setBounds(150,40,200,20);
		l1.setForeground(new Color(13, 247, 255));
		l1.setFont(font);
		
		l2 = new JLabel("Choose an existing brand: ");
		l2.setBounds(90,140,200,20);
		l2.setForeground(col);
		l2.setFont(font);
		
		l3 = new JLabel("OR");
		l3.setBounds(230,230,200,20);
		l3.setForeground(col);

		b1 = new JButton("Check");
		b2 = new JButton("Ferrari");
		b3 = new JButton("Marcedes");
		b4 = new JButton("Add new Collection");
		back = new JButton("Back");
		
		b1.setForeground(col);
		b1.setBackground(new Color (31, 29, 29));
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		
		b4.setForeground(col);
		b4.setBackground(new Color (31, 29, 29));
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		
		back.setForeground(col);
		back.setBackground(new Color (31, 29, 29));
		back.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		
		b1.setBounds(200,180, 80, 30);
		b2.setBounds(200,120, 80, 30);
		b3.setBounds(300,140, 80, 20);
		b4.setBounds(160,270,165,30);
		back.setBounds(200,330,80,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		back.addActionListener(this);
		
		f.add(b1);
		f.add(b4);
		f.add(back);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(combo);
		
		ImageIcon i = new ImageIcon("Images/icon circle.png");
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setIconImage(i.getImage());
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			String a = combo.getSelectedItem().toString();
			
			if(a.isEmpty()==false)
			{
				new AddorRemoveMoreCars(u,cars,a);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Choose a brand first.");
			}
		}
		
		if(e.getSource()==b2)
		{
			new AddorRemoveMoreCars(u,cars,"Ferrari");
		}
		
		if(e.getSource()==b3)
		{
			new AddorRemoveMoreCars(u,cars,"Mercedes");
		}
		
		if(e.getSource()==b4)
		{
			new AddNewCollection(u,cars);
			f.dispose();
		}
		
		if(e.getSource()==back)
		{
			new Home(u,cars);
			f.dispose();
		}
	}
}
