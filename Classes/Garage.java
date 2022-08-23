package Classes;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

public class Garage implements ActionListener
{
	JFrame f;
	
	JLabel l1;
	
	JButton b1,b2;
	
	ArrayList<Car> cars;
	
	JTable table;
	
	DefaultTableModel model;
	
	JScrollPane sp;
	
	User u;
	
	public Garage(User a, ArrayList<Car>cars1)
	{
		u = a;
		
		cars = cars1;
		
		f = new JFrame("My Garage");
		
		Color col = new Color(214, 21, 63);
		
		ImageIcon i1 = new ImageIcon("Images/garage.jpg");

		model = new DefaultTableModel() 
		{
			public boolean isCellEditable(int row, int column) 
			{
			       //false or all cells
			       return false;
			}
		};
		
		model.addColumn("Brand");
		model.addColumn("Model");
		model.addColumn("Quantity");
		model.addColumn("Total Cost($)");
		
		for(int i=0; i<u.getGarageCars().size(); i++)
		{
			for (int j=0; j<u.getGarageCars().get(i).getModels().size();j++)
			{
				model.addRow(new Object[] {u.getGarageCars().get(i).getBrandName(),u.getGarageCars().get(i).getModels().get(j).getModelName(),u.getGarageCars().get(i).getModels().get(j).getQuantity(),String.format("%.2f", u.getGarageCars().get(i).getModels().get(j).getQuantity()*u.getGarageCars().get(i).getModels().get(j).getPrice())});
			}
		}
		
		table = new JTable(model);
		
		table.setBounds(0,0,600,200);
		table.setFont(new Font("Tahoma",Font.BOLD,16));
		table.setRowHeight(25);
		table.setForeground(col);
		table.setBackground(new Color (31, 29, 29));
		table.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setBackground(new Color (31, 29, 29));
		tableHeader.setForeground(new Color(13, 247, 255));
		Font headerFont = new Font("Comic Sans MS",Font.BOLD,15);
		tableHeader.setFont(headerFont);

		sp = new JScrollPane(table);
		sp.setBounds(47,170,600,200);
		sp.setFont(new Font("Tahoma",Font.BOLD,16));
		sp.setForeground(col);
		sp.getViewport().setBackground(new Color (31, 29, 29));

		l1 = new JLabel("Total Owned: "+u.getCarCount()+" vehicle/s");
		l1.setBounds(230,120,300,30);
		l1.setForeground(new Color(13, 247, 255));
		l1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		b1 = new JButton("Refresh");
		b1.setBounds(290,390,100,30);
		b1.setForeground(col);
		b1.setBackground(new Color (31, 29, 29));
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.addActionListener(this);
		
		b2 = new JButton("Go Back");
		b2.setBounds(290,430,100,30);
		b2.setForeground(col);
		b2.setBackground(new Color (31, 29, 29));
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.addActionListener(this);
		
		f.add(sp);
		f.add(b1);
		f.add(b2);
		f.add(l1);
		
		f.setSize(700,700);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setIconImage(i1.getImage());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			new Garage(u,cars);
			f.setVisible(false);
		}
		
		if(e.getSource()==b2)
		{
			new Home(u,cars);
			f.setVisible(false);
		}
	}
}
