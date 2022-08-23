package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.util.*;

public class ShowUsers implements ActionListener
{
	JFrame f;
	
	JTable table;
	
	DefaultTableModel model;
	
	JScrollPane sp;
	
	JButton b1,b2,b3;
	
	User u;
	
	ArrayList<Car>cars;
	
	ShowUsers(User a, ArrayList<Car>cars1)
	{
		u = a;
		
		cars = cars1;
		
		ImageIcon i1 = new ImageIcon("Images/icon circle.png");
		
		f = new JFrame("View Regular Users");
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		
		model = new DefaultTableModel() 
		{
			public boolean isCellEditable(int row, int column) 
			{
			       //false for all cells
			       return false;
			}
		};
		
		model.addColumn("Name");
		model.addColumn("Username");
		model.addColumn("Password");
		model.addColumn("Bank");
		model.addColumn("Bank Acc No.");
		model.addColumn("Balance");
		model.addColumn("Purchased cars");
		
		try
		{
			for(int i=0; i<Login.users.length; i++)
			{
				if(Login.users[i] != null)
				{
					if (Login.users[i].getType().equals("Regular"))
					{
						model.addRow(new Object[] {Login.users[i].getName(),Login.users[i].getUserName(),Login.users[i].getPassword(),Login.users[i].getBankName(),Login.users[i].getBankAccNo(),String.format("%.2f", Login.users[i].getBalance()),Login.users[i].getCarCount()});
					}
				}
			}
		}
		catch(NullPointerException npe) 
		{
			System.out.println("Null pointer Excepyion caught");
			System.out.println(Login.users.length);
			npe.printStackTrace();
		}
		
		table = new JTable(model);
		
		table.setBounds(0,0,700,300);
		table.setRowHeight(25);
		table.setForeground(col);
		table.setBackground(new Color (31, 29, 29));
		table.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setBackground(new Color (31, 29, 29));
		tableHeader.setForeground(new Color(13, 247, 255));
		Font headerFont = new Font("Comic Sans MS",Font.BOLD,15);
		tableHeader.setFont(headerFont);

		sp = new JScrollPane(table);
		sp.setBounds(47,50,700,300);
		sp.setFont(new Font("Tahoma",Font.BOLD,16));
		sp.setForeground(col);
		sp.getViewport().setBackground(new Color (31, 29, 29));
		
		b1 = new JButton("Delete User");
		b1.setBounds(250,400,130,30);
		b1.setForeground(col);
		b1.setBackground(col1);
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.addActionListener(this);
		
		b2 = new JButton("Add New User");
		b2.setBounds(400,400,150,30);
		b2.setForeground(col);
		b2.setBackground(col1);
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.addActionListener(this);
		
		b3 = new JButton("Go Back");
		b3.setBounds(325,440,150,30);
		b3.setForeground(col);
		b3.setBackground(col1);
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.addActionListener(this);
		
		f.add(sp);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setSize(800,600);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(i1.getImage());
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			int col = 1;
			int row = table.getSelectedRow();
			String test = null;
			
			if(row>=0) 
			{
				test = table.getModel().getValueAt(row, col).toString();
				this.deleteUser(test);
				JOptionPane.showMessageDialog(null,"Account deleted from the server successfully");
				new ShowUsers(u,cars);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Select a proper row");
			}
		}
		
		if(e.getSource()==b2)
		{
			new AddNewUser(u,cars);
			f.dispose();
		}
		
		if(e.getSource()==b3)
		{
			new Home(u,cars);
			f.dispose();
		}
	}
	
	public void deleteUser(String a)
	{
		for(int i = 0; i<Login.users.length;i++)
		{
			if(Login.users[i] != null)
			{
				if(Login.users[i].getUserName().equals(a)) 
				{
					Login.users[i] = null;
				}
			}
		}
	}
}
