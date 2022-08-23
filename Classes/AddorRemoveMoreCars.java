package Classes;

import Interfaces.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class AddorRemoveMoreCars implements ActionListener, IFindingCar, IFindCarModels  
{
	JFrame f;
	
	JLabel l1,l2,l3,l4,l5,l6;
	
	JButton b1,b2,b3,b4,b5,back;
	
	JTextField tf;
	
	JComboBox<?> combo;
	
	ArrayList<String> models = new ArrayList<String>();
	
	JTable table;
	DefaultTableModel model;
	JScrollPane scroll;
	
	double price, cost;
	int count, remainder;
	
	String carName;
	
	User u;
	
	ArrayList<Car> cars;
	
	public AddorRemoveMoreCars(User a, ArrayList<Car> cars1, String name)
	{
		u = a;
		
		cars = cars1;
		
		carName = name;
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color(0, 252, 29);
		Font font = new Font("Segoe Ui Black",Font.BOLD,14);
		
		f = new JFrame("Add more "+name+" cars");
		
		l1 = new JLabel("Balance: "+String.format("%.2f", u.getBalance())+"$");
		l1.setBounds(200,30,300,20);
		l1.setForeground(new Color(13, 247, 255));
		l1.setFont(font);
		
		l2 = new JLabel("Brand name: "+name);
		l2.setBounds(200,65,300,20);
		l2.setForeground(col);
		l2.setFont(font);
		
		l3 = new JLabel();
		l3.setBounds(140,160,315,20);
		l3.setForeground(col1);
		l3.setFont(font);
		l3.setVisible(false);
		
	    l4 = new JLabel();
		l4.setBounds(145,190,300,20);
		l4.setForeground(col1);
		l4.setFont(font);
		
		l5 = new JLabel();
		l5.setBounds(120,220,400,20);
		l5.setFont(font);
		l5.setForeground(col1);
		
		l6 = new JLabel("Enter quantity: ");
		l6.setBounds(170,125,300,20);
		l6.setFont(font);
		l6.setForeground(col);
		
		b1 = new JButton("Check");
		b1.setBounds(330,126,80,27);
		b1.setForeground(col);
		b1.setBackground(new Color (31, 29, 29));
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		b1.addActionListener(this);
		
		b2 = new JButton("Reload");
		b2.setForeground(col);
		b2.setBackground(new Color (31, 29, 29));
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		b2.setBounds(250,285,80,27);
		b2.addActionListener(this);
		
		b3 = new JButton("Add");
		b3.setBounds(120,255,80,27);
		b3.setForeground(col);
		b3.setBackground(new Color (31, 29, 29));
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		b3.setVisible(false);
		b3.addActionListener(this);
		
		b4 = new JButton("Remove Cars");
		b4.setBounds(380,255,115,27);
		b4.setForeground(col);
		b4.setBackground(new Color (31, 29, 29));
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		b4.setVisible(false);
		b4.addActionListener(this);
		
		b5 = new JButton("Remove Model");
		b5.setBounds(230,255,120,27);
		b5.setForeground(col);
		b5.setBackground(new Color (31, 29, 29));
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		b5.addActionListener(this);
		
		back = new JButton("Back");
		back.setForeground(col);
		back.setBackground(new Color (31, 29, 29));
		back.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		back.setBounds(250,520,80,27);
		back.addActionListener(this);
		
		tf = new JTextField();
		tf.setBounds(290,128, 30, 20);
		tf.setForeground(col);
		tf.setBackground(new Color (31, 29, 29));
		tf.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		tf.setText("1");
				
		this.getModels();
		
		combo = new JComboBox<>(models.toArray());
		combo.setForeground(col);
		combo.setBackground(new Color (31, 29, 29));
		combo.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		combo.setBounds(220,90,150,25);
		
		model = new DefaultTableModel() 
		{
			public boolean isCellEditable(int row, int column) 
			{
			       return false;
			}
		};
		
		model.addColumn("Brand");
		model.addColumn("Model");
		model.addColumn("Quantity");
		//model.addRow(new Object[] {"Brand","Model","Quantity"});
		
		for(int i=0; i<getCar(name).getModels().size();i++)
		{
			model.addRow(new Object[] {name,getCar(name).getModels().get(i).getModelName(),getCar(name).getModels().get(i).getQuantity()});
		}
		
		table = new JTable(model);
		
		table.setBounds(0,0,500,200);
		table.setFont(new Font("Tahoma",Font.BOLD,16));
		table.setRowHeight(25);
		table.setForeground(col);
		table.setBackground(new Color (31, 29, 29));
		
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setBackground(new Color (31, 29, 29));
		tableHeader.setForeground(new Color(13, 247, 255));
		Font headerFont = new Font("Comic Sans MS",Font.BOLD,15);
		tableHeader.setFont(headerFont);

		scroll = new JScrollPane(table);
		scroll.setBounds(40,315,500,200);
		scroll.setFont(new Font("Tahoma",Font.BOLD,16));
		scroll.setForeground(col);
		scroll.getViewport().setBackground(new Color (31, 29, 29));

		f.add(scroll);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(back);
		f.add(tf);
		f.add(combo);
		
		f.setSize(600,600);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		
		try
		{
			f.setIconImage(getCar(carName).gettingImage().getImage());
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null pointer Exception caught");
		}
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setResizable(false);
		f.setVisible(true);
	}

	public CarModel findCarModel(String a)
	{
		CarModel test = null;
		
		for(int i=0;i<getCar(carName).getModels().size();i++)
		{
			if(getCar(carName).getModels().get(i).getModelName().equals(a))
			{
				test = getCar(carName).getModels().get(i);
				break;
			}
		}
		return test;
	}
	
	public Car getCar(String a)
	{
		Car test = null;
		
		for(int i=0; i<cars.size(); i++)
		{
			if(cars.get(i).getBrandName().equals(a))
			{
				test = cars.get(i);
				break;
			}
		}
		return test;
	}
	
	public void getModels()
	{
		for(int i=0; i<getCar(carName).getModels().size(); i++)
		{
			models.add(getCar(carName).getModels().get(i).getModelName());
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			if(tf.getText().isEmpty()==false) 
			{
				try
				{
					count = Integer.parseInt(tf.getText());
				}
				catch(NumberFormatException nfe)
				{
					JOptionPane.showMessageDialog(null, "Enter numeric value");
					System.out.println("Number Format Exception caught");
				}
				
				if(count>0)
				{
					b3.setVisible(true);
					b4.setVisible(true);
					l3.setVisible(true);
					l4.setVisible(true);
					l5.setVisible(true);
			
					String b = null;
				
					try
					{
						b = combo.getSelectedItem().toString();
					}
					catch(NullPointerException npe)
					{
						JOptionPane.showMessageDialog(null, "Select a value in the combo box");
						System.out.println("Null pointer Exception caught");
					}
				
					CarModel c = this.findCarModel(b);
			
					if(c!=null)
					{
						price = c.getPrice();
						cost = price*count*0.85;
					
						l3.setText("Price of 1 "+" "+c.getModelName()+": "+String.format("%.2f", (c.getPrice()*0.85))+" $ (-15%)");
					
						l4.setText("Total cost: "+(price*0.85)+" x "+count+" = "+String.format("%.2f", cost)+" $");
						l5.setText("Your balance after Addition: "+String.format("%.2f",(u.getBalance()-cost))+" $");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No cars available");
					}
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"Invalid amount");
				}	
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Insert a value first");
			}
		}
		
		if(e.getSource()==b2)
		{
			new AddorRemoveMoreCars(u,cars,carName);
			f.dispose();
		}
		
		if(e.getSource()==b3)
		{
			try
			{
				if(tf.getText().isEmpty()==false) {count = Integer.parseInt(tf.getText());}
				else {JOptionPane.showMessageDialog(null, "Enter a value.");}
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null, "Enter numeric value");
				System.out.println("Number Format Exception caught");
			}
			
			String b = null;
			
			try
			{
				b = combo.getSelectedItem().toString();
			}
			catch(NullPointerException npe)
			{
				JOptionPane.showMessageDialog(null, "Select a value in the combo box");
				System.out.println("Null pointer Exception caught");
			}
			
			CarModel c = this.findCarModel(b);
			
			if(c != null)
			{
				price = c.getPrice();
				cost = price*count;
				
				if(count>0) 
				{
					if(cost<u.getBalance())
					{
						c.addQuantity(count);
						JOptionPane.showMessageDialog(null, count+" "+carName+" "+b+" cars have been added to collection. Total cost: "+String.format("%.2f", cost)+" $ (-15%)");
						u.setBalance(u.getBalance()-(cost*0.85));
						
						new AddorRemoveMoreCars(u,cars,carName);
						f.dispose();
					}	
					else
					{
						JOptionPane.showMessageDialog(null, "Get some for balance, then return :)");
					}
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "No car models are available");
			}
		}
		
		if(e.getSource()==b4)
		{
			try
			{
				if(tf.getText().isEmpty()==false) {count = Integer.parseInt(tf.getText());}
				else {JOptionPane.showMessageDialog(null, "Enter a value.");}
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null, "Enter numeric value");
				System.out.println("Number Format Exception caught");
			}
			
			String b = null;
			
			try
			{
				b = combo.getSelectedItem().toString();
			}
			catch(NullPointerException npe)
			{
				JOptionPane.showMessageDialog(null, "Select a value in the combo box");
				System.out.println("Null pointer Exception caught");
			}
			
			CarModel c = this.findCarModel(b);
			
			if(c != null)
			{
				remainder = c.getQuantity()-count;
				
				price = c.getPrice();
				cost = price*count;
				
				if(count>0) 
				{
					if(remainder>=0)
					{
						c.sellQuantity(count);
						JOptionPane.showMessageDialog(null, count+" "+carName+" cars worth "+String.format("%.2f", cost)+" $ have been removed from collection");
						
						new AddorRemoveMoreCars(u,cars,carName);
						f.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "We don't have that many in stock :)");
					}
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "No car models available");
			}
		}
		
		if(e.getSource()==b5)
		{
			String b = null;
			
			try
			{
				b = combo.getSelectedItem().toString();
			}
			catch(NullPointerException npe)
			{
				JOptionPane.showMessageDialog(null, "Select a value in the combo box");
				System.out.println("Null pointer Exception caught");
			}
			
			CarModel cm = this.findCarModel(b);
			
			if(cm!=null)
			{
				Car c = getCar(carName);
				
				if(c != null && cm != null)
				{
					c.removeModel(b);
					JOptionPane.showMessageDialog(null, "Car Model "+b+" removed successfully");
					new AddorRemoveMoreCars(u,cars,carName);
					f.dispose();
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "No car models are available");
			}
		}
		
		if(e.getSource()==back)
		{
			new AddorRemoveCars(u,cars);
			f.dispose();
		}
	}
}
