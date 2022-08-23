package Classes;

import Interfaces.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class AddNewCollection implements ActionListener, IFindingCar 
{
	JFrame f;
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	
	JButton b1,b2,b3,back;
	
	JTextField tf1,tf2, tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
	
	JComboBox<?> combo;
	
	User u;
	
	Car c2= new Car();
	
	ArrayList<Car> cars;
	
	public AddNewCollection(User a, ArrayList<Car> cars1)
	{
		u = a;
		
		cars = cars1;
		
		Color col = new Color(214, 21, 63);
		Font font = new Font("Segoe Ui Black",Font.BOLD,13);
		
		f = new JFrame("Adding new Brands");
		
		l1 = new JLabel("Enter new Brand: ");
		l1.setBounds(100,100,130,20);
		l1.setFont(font);
		l1.setForeground(col);
		
		tf1 = new JTextField();
		tf1.setForeground(col);
		tf1.setBackground(new Color (31, 29, 29));
		tf1.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf1.setBounds(220, 100, 90, 20);
		
		l2 = new JLabel("Enter new Car Model: ");
		l2.setBounds(100,130,150,20);
		l2.setForeground(col);
		l2.setFont(font);
		l2.setVisible(false);
		
		l3 = new JLabel("Enter Quantity: ");
		l3.setBounds(100,160,130,20);
		l3.setForeground(col);
		l3.setFont(font);
		l3.setVisible(false);
		
		l4 = new JLabel("Enter Retail Price: ");
		l4.setBounds(100,190,130,20);
		l4.setForeground(col);
		l4.setFont(font);
		l4.setVisible(false);
		
		l5 = new JLabel("Enter Top Speed (MPH): ");
		l5.setBounds(100,220,170,20);
		l5.setForeground(col);
		l5.setFont(font);
		l5.setVisible(false);
		
		l6 = new JLabel();
		l6.setBounds(100,280,250,20);
		l6.setForeground(col);
		l6.setFont(font);
		l6.setVisible(false);
		
		l7 = new JLabel();
		l7.setBounds(100,310,200,20);
		l7.setForeground(col);
		l7.setFont(font);
		l7.setVisible(false);
		
		l8 = new JLabel();
		l8.setBounds(100,340,200,20);
		l8.setForeground(col);
		l8.setFont(font);
		l8.setVisible(false);
		
		l9 = new JLabel();
		l9.setBounds(100,370,200,20);
		l9.setForeground(col);
		l9.setFont(font);
		l9.setVisible(false);
		
		l10 = new JLabel();
		l10.setBounds(100,400,200,20);
		l10.setForeground(col);
		l10.setFont(font);
		l10.setVisible(false);
		
		l11 = new JLabel("Choose Car Type: ");
		l11.setBounds(100,250,200,20);
		l11.setForeground(col);
		l11.setFont(font);
		l11.setVisible(false);
		
		tf2 = new JTextField();
		tf2.setForeground(col);
		tf2.setBackground(new Color (31, 29, 29));
		tf2.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf2.setBounds(300, 131, 90, 20);
		tf2.setVisible(false);
		
		tf3 = new JTextField();
		tf3.setForeground(col);
		tf3.setBackground(new Color (31, 29, 29));
		tf3.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf3.setBounds(300, 161, 90, 20);
		tf3.setVisible(false);
		
		tf4 = new JTextField();
		tf4.setForeground(col);
		tf4.setBackground(new Color (31, 29, 29));
		tf4.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf4.setBounds(300, 191, 90, 20);
		tf4.setVisible(false);
		
		tf5 = new JTextField();
		tf5.setForeground(col);
		tf5.setBackground(new Color (31, 29, 29));
		tf5.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf5.setBounds(300, 221, 90, 20);
		tf5.setVisible(false);
		
		tf6 = new JTextField();
		tf6.setForeground(col);
		tf6.setBackground(new Color (31, 29, 29));
		tf6.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf6.setBounds(310, 281, 90, 20);
		tf6.setVisible(false);
		
		tf7 = new JTextField();
		tf7.setForeground(col);
		tf7.setBackground(new Color (31, 29, 29));
		tf7.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf7.setBounds(300, 311, 90, 20);
		tf7.setVisible(false);
		
		tf8 = new JTextField();
		tf8.setForeground(col);
		tf8.setBackground(new Color (31, 29, 29));
		tf8.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf8.setBounds(300, 341, 90, 20);
		tf8.setVisible(false);
		
		tf9 = new JTextField();
		tf9.setForeground(col);
		tf9.setBackground(new Color (31, 29, 29));
		tf9.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf9.setBounds(300, 371, 90, 20);
		tf9.setVisible(false);
		
		tf10 = new JTextField();
		tf10.setForeground(col);
		tf10.setBackground(new Color (31, 29, 29));
		tf10.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		tf10.setBounds(300, 401, 90, 20);
		tf10.setVisible(false);
		
		b1 = new JButton("Add Brand");
		b1.setBounds(320,98,130,25);
		b1.setForeground(col);
		b1.setBackground(new Color (31, 29, 29));
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		b1.addActionListener(this);
		
		b2 = new JButton("Add Car Model");
		b2.setBounds(230,430,130,20);
		b2.setForeground(col);
		b2.setBackground(new Color (31, 29, 29));
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		b2.addActionListener(this);
		b2.setVisible(false);
		
		b3 = new JButton("Add Another Brand");
		b3.setBounds(230,460,130,20);
		b3.setForeground(col);
		b3.setBackground(new Color (31, 29, 29));
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		b3.setVisible(false);
		b3.addActionListener(this);
		
		back = new JButton("Back");
		back.setBounds(260,490,80,20);
		back.setForeground(col);
		back.setBackground(new Color (31, 29, 29));
		back.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		//back.setVisible(false);
		back.addActionListener(this);
		
		String categories[] = {"Fuel","Electric","Hybrid"};
		combo = new JComboBox<String>(categories);
		combo.setBounds(300,251,100,20);
		combo.setForeground(col);
		combo.setBackground(new Color (31, 29, 29));
		combo.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		combo.setVisible(false);
		combo.setSelectedIndex(-1);
		combo.addActionListener(this);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(tf5);
		f.add(tf6);
		f.add(tf7);
		f.add(tf8);
		f.add(tf9);
		f.add(tf10);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(back);
		f.add(combo);
		
		ImageIcon i = new ImageIcon("Images/icon circle.png");
		
		f.setSize(600,600);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setIconImage(i.getImage());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setVisible(true);
	}

	public boolean searchCar(String a)
	{
		boolean test = false;
		
		String b = a.toLowerCase();
		
		for(int i = 0; i<cars.size();i++)
		{
			if(cars.get(i).getBrandName().toLowerCase().equals(b))
			{
				test = true;
				break;
			}
		}
		return test;
	}
	
	public Car getCar(String a)
	{
		Car c = null;
		
		String b = a.toLowerCase();
		
		for(int i = 0; i<cars.size();i++)
		{
			if(cars.get(i).getBrandName().toLowerCase().equals(b))
			{
				c = cars.get(i);
			}
		}
		return c;
	}
	
	public boolean searchCarModel(String a)
	{
		boolean test = false;
		
		for(int i = 0; i<cars.size();i++)
		{
			for (int j = 0; j<cars.get(i).getModels().size();j++)
			{
				if(cars.get(i).getModels().get(j).getModelName().equals(a))
				{
					test = true;
					break;
				}
			}
		}
		return test;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			String a = tf1.getText();
			
			if(a.isEmpty()==false)
			{
				if(searchCar(a)==false)
				{
					this.c2 = new Car(a);
					cars.add(this.c2);
					JOptionPane.showMessageDialog(null, "Car brand: "+a+" successfully added");
					
					tf1.setEditable(false);
					b1.setEnabled(false);

					l2.setVisible(true);
					l3.setVisible(true);
					l4.setVisible(true);
					l5.setVisible(true);
					l6.setVisible(true);
					l7.setVisible(true);
					l8.setVisible(true);
					l9.setVisible(true);
					l10.setVisible(true);
					l11.setVisible(true);
					tf2.setVisible(true);
					tf3.setVisible(true);
					tf4.setVisible(true);
					tf5.setVisible(true);
					b2.setVisible(true);
					combo.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "That car brand is in our collection. Proceed to enter a new model.");
					this.c2 = getCar(a);
					tf1.setEditable(false);

					b1.setEnabled(false);

					l2.setVisible(true);
					l3.setVisible(true);
					l4.setVisible(true);
					l5.setVisible(true);
					l6.setVisible(true);
					l7.setVisible(true);
					l8.setVisible(true);
					l9.setVisible(true);
					l10.setVisible(true);
					l11.setVisible(true);
					tf2.setVisible(true);
					tf3.setVisible(true);
					tf4.setVisible(true);
					tf5.setVisible(true);
					b2.setVisible(true);
					combo.setVisible(true);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Enter a name");
			}
		}
		
		if(e.getSource()==b2)
		{
			String a = tf2.getText();
			String b = tf3.getText();
			String c = tf4.getText();
			String speed = tf5.getText();
			String mileage = tf6.getText();
			String eName = tf7.getText();
			String ePower = tf8.getText();
			String hName = tf9.getText();
			String hPower = tf10.getText();
			
			int q = 0;
			double d = 0;
			double doubleSpeed = 0;
			double doubleMileage = 0;
			double Epower = 0;
			double Hpower = 0;
			
			String f = null;
			try
			{
				f = combo.getSelectedItem().toString();
			}
			catch(NullPointerException exp)
			{
				JOptionPane.showMessageDialog(null, "Select a value within the Drop Down menu");
				System.out.println("Null pointer exception caught");
			}
			
			try
			{
				if(b.isEmpty()==false) 
				{
					q = Integer.parseInt(b);
				}
				
				if(speed.isEmpty()==false) 
				{
					doubleSpeed = Double.parseDouble(speed);
				}
				
				if(mileage.isEmpty()==false) 
				{
					doubleMileage = Double.parseDouble(mileage);
				}
				
				if(c.isEmpty()==false) 
				{
					d = Double.parseDouble(c);
				}
				
				if(ePower.isEmpty()==false) 
				{
					Epower = Double.parseDouble(ePower);
				}
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null, "Enter values according to its data type");
				System.out.println("Number Format Exception caught");
			}
			
			try
			{
				if(f.equals("Fuel"))
				{
					if(a.isEmpty()==false && b.isEmpty()==false && c.isEmpty()==false && speed.isEmpty()==false && mileage.isEmpty()==false && eName.isEmpty()==false && ePower.isEmpty()==false)
					{
						if(searchCarModel(a)==false)
						{
							tf2.setText(null);
							tf3.setText(null);
							tf4.setText(null);
							tf5.setText(null);
							tf6.setText(null);
							tf7.setText(null);
							tf8.setText(null);
							tf9.setText(null);
							tf10.setText(null);
							
							ImageIcon i = new ImageIcon("Images/k.png");
							CarModel c1 = new FuelCarModel(a,q,d,f,i,doubleSpeed,doubleMileage,eName,Epower);
							this.c2.getModels().add(c1);
							u.setBalance(u.getBalance()-(q*d*0.85));
							JOptionPane.showMessageDialog(null, "Fuel car model added successfully");
							b3.setVisible(true);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "That car brand is already in our collection.");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Enter all fields");
					}
				}
			}
			catch(NullPointerException npe)
			{
				System.out.println("Null pointer exception caught");
			}
			
			try
			{
				if(f.equals("Electric"))
				{
					if(a.isEmpty()==false && b.isEmpty()==false && c.isEmpty()==false && speed.isEmpty()==false && mileage.isEmpty()==false && eName.isEmpty()==false && ePower.isEmpty()==false)
					{
						if(searchCarModel(a)==false)
						{
							tf2.setText(null);
							tf3.setText(null);
							tf4.setText(null);
							tf5.setText(null);
							tf6.setText(null);
							tf7.setText(null);
							tf8.setText(null);
							tf9.setText(null);
							tf10.setText(null);
							
							ImageIcon i = new ImageIcon("Images/k.png");
							
							CarModel c1 = new ElectricCarModel(a,q,d,f,i,doubleSpeed,doubleMileage,eName,Epower);
							this.c2.getModels().add(c1);
							u.setBalance(u.getBalance()-(q*d*0.85));
							JOptionPane.showMessageDialog(null, "Electric Car model added successfully");
							b3.setVisible(true);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "That car brand is already in our collection.");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Enter all fields");
					}
				}
			}
			catch(NullPointerException npe)
			{
				System.out.println("Null pointer exception caught");
			}
			
			try
			{
				if(f.equals("Hybrid"))
				{
					if(a.isEmpty()==false && b.isEmpty()==false && c.isEmpty()==false && speed.isEmpty()==false && mileage.isEmpty()==false && eName.isEmpty()==false && ePower.isEmpty()==false && hName.isEmpty()==false && hPower.isEmpty()==false)
					{
						if(searchCarModel(a)==false)
						{
							tf2.setText(null);
							tf3.setText(null);
							tf4.setText(null);
							tf5.setText(null);
							tf6.setText(null);
							tf7.setText(null);
							tf8.setText(null);
							tf9.setText(null);
							tf10.setText(null);
							
							ImageIcon i = new ImageIcon("Images/k.png");
							
							CarModel c1 = new HybridCarModel(a,q,d,f,i,doubleSpeed,doubleMileage,eName,Epower,hName,Hpower);
							this.c2.getModels().add(c1);
							u.setBalance(u.getBalance()-(q*d*0.85));
							JOptionPane.showMessageDialog(null, "Hybrid car model added successfully");
							
							b3.setVisible(true);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "That car brand is already in our collection.");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Enter all fields");
					}
				}
			}
			catch(NullPointerException npe)
			{
				System.out.println("Null pointer exception caught");
			}
		}
		
		if(e.getSource()==b3)
		{
			new AddNewCollection(u,cars);
		}
		
		if(e.getSource()==combo)
		{
			String a = null;
			try
			{
				a = combo.getSelectedItem().toString();
			}
			catch(NullPointerException exp)
			{
				System.out.println("Null pointer exception caught");
			}
			
			try
			{
				if(a.equals("Fuel"))
				{
					l6.setText("Enter Mileage (KM per Litre): ");
					l7.setText("Enter Engine Name: ");
					l8.setText("Enter Engine Power: ");
					l9.setText(null);
					l10.setText(null);
					tf6.setBounds(310, 281, 90, 20);
					tf5.setVisible(true);
					tf6.setVisible(true);
					tf7.setVisible(true);
					tf8.setVisible(true);
					tf9.setVisible(false);
					tf10.setVisible(false);
				}
				
				if(a.equals("Electric"))
				{
					l6.setText("Enter Mileage (KM per Charge): ");
					l7.setText("Enter Motor Name: ");
					l8.setText("Enter Motor Power: ");
					l9.setText(null);
					l10.setText(null);
					tf6.setBounds(310, 281, 90, 20);
					tf5.setVisible(true);
					tf6.setVisible(true);
					tf7.setVisible(true);
					tf8.setVisible(true);
					tf9.setVisible(false);
					tf10.setVisible(false);
				}
				
				if(a.equals("Hybrid"))
				{
					l6.setText("Enter Mileage (KM per Charge/Litre): ");
					l7.setText("Enter Hybrid Engine Name: ");
					l8.setText("Enter Hybrid Engine Power: ");
					l9.setText("Enter Hybrid Motor Name: ");
					l10.setText("Enter Hybrid Motor Power: ");
					tf6.setBounds(350, 281, 90, 20);
					tf5.setVisible(true);
					tf6.setVisible(true);
					tf7.setVisible(true);
					tf8.setVisible(true);
					tf9.setVisible(true);
					tf10.setVisible(true);
				}
			}
			catch(NullPointerException npe)
			{
				System.out.println("Null pointer exception caught");
			}
		}
		
		if(e.getSource()==back)
		{
			new AddorRemoveCars(u,cars);
			f.dispose();
		}
	}
}
