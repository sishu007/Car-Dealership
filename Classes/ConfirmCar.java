package Classes;

import Interfaces.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

public class ConfirmCar implements ActionListener, IFindCarModels 
{
	Car c;
	User u;
	
	ArrayList<Car> cars;
	
	double remainder,price,cost;
	
	int count,remainingCount;
	
	String modelName;
	
	JFrame f;
	
	JButton b1,b2,back;
	
	ImageIcon i;
	
	JTextField tf;
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	
	public ConfirmCar(User u, Car a, String name, String color, ArrayList<Car> cars1, ImageIcon image)
	{
		this.u = u;
		
		this.cars = cars1;
		
		c = a;
		
		i = image;
		
		modelName = name;
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color(5, 247, 70);
		Color col2 = new Color(255, 0, 55);
		
		Font font = new Font("Segoe Ui Black",Font.BOLD,15);
		Font font1 = new Font("Segoe Ui Black",Font.BOLD,17);
		
		int availableQuantity = this.findCarModel(name).getQuantity();
		
		f = new JFrame("Confirm Purchase of your "+c.getBrandName()+" "+name);
		
		b1 = new JButton("Confirm");
		b1.setBounds(320,680,100,30);
		b1.setForeground(col);
		b1.setBackground(new Color (31, 29, 29));
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		b1.addActionListener(this);
		b1.setVisible(false);
		
		b2 = new JButton("Check");
		b2.setBounds(460,500,80,30);
		b2.setForeground(col);
		b2.setBackground(new Color (31, 29, 29));
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		b2.addActionListener(this);
		
		back = new JButton("Back");
		back.setBounds(10,20,70,30);
		back.setForeground(col);
		back.setBackground(new Color (31, 29, 29));
		back.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		back.addActionListener(this);
		
		l1 = new JLabel("Available Quantity: "+availableQuantity);
		l1.setBounds(250,465,220,30);
		l1.setForeground(col1);
		l1.setFont(font);
		l1.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l2 = new JLabel("Selected Color: "+color);
		l2.setBounds(240,590,220,30);
		l2.setForeground(col1);
		l2.setFont(font);
		l2.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l3 = new JLabel("Enter number of cars you want: ");
		l3.setBounds(170,500,280,30);
		l3.setForeground(col1);
		l3.setFont(font);
		l3.setVisible(true);
		
		l4 = new JLabel();
		l4.setBounds(250,530,220,30);
		l4.setForeground(col1);
		l4.setFont(font);
		l4.setVisible(false);
		l4.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l5 = new JLabel();
		l5.setBounds(135,560,450,30);
		l5.setForeground(col1);
		l5.setFont(font);
		l5.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		l5.setVisible(false);
		
		l6 = new JLabel("Your Balance: "+String.format("%.2f", u.getBalance())+" $");
		l6.setBounds(230,625,300,20);
		l6.setFont(new Font("Tahoma",Font.BOLD,16));
		l6.setForeground(new Color(13, 247, 255));
		
		l7 = new JLabel();
		l7.setBounds(110,655,500,20);
		l7.setForeground(new Color(13, 247, 255));
		l7.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		l7.setFont(font);
		l7.setVisible(false);
		
		l8 = new JLabel(findCarModel(name).getterImage());
		l8.setBounds(115,20,500,150);
		
		l9 = new JLabel("Model: "+c.getBrandName()+" "+findCarModel(name).getModelName());
		l9.setBounds(160,175,400,30);
		l9.setForeground(col);
		l9.setFont(new Font("Brush Script MT",Font.BOLD,28));
		l9.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l10 = new JLabel("Type: "+findCarModel(name).getCategory()+" car");
		l10.setBounds(240,210,250,30);
		l10.setForeground(col2);
		l10.setFont(font1);
		l10.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l11 = new JLabel("Top Speed: "+findCarModel(name).getTopSpeed()+" MPH");
		l11.setBounds(240,240,250,30);
		l11.setForeground(col2);
		l11.setFont(font1);
		l11.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
	
		l12 = new JLabel("Mileage: "+findCarModel(name).getMileage()+" KM Per Litre");
		l12.setBounds(240,270,250,30);
		l12.setForeground(col2);
		l12.setFont(font1);
		l12.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		if(findCarModel(name).getCategory().equals("Electric")==false)
		{
			l12.setText("Mileage: "+findCarModel(name).getMileage()+" KM Per Litre");
		}
		else
		{
			l12.setText("Mileage: "+findCarModel(name).getMileage()+" KM Per Charge");
		}
		
		l13 = new JLabel();
		l13.setBounds(220,300,280,30);
		l13.setForeground(col2);
		l13.setFont(font1);
		l13.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l14 = new JLabel();
		l14.setBounds(210,330,300,30);
		l14.setForeground(col2);
		l14.setFont(font1);
		l14.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l15 = new JLabel();
		l15.setBounds(210,360,300,30);
		l15.setForeground(col2);
		l15.setFont(font1);
		l15.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l16 = new JLabel();
		l16.setBounds(210,390,300,30);
		l16.setForeground(col2);
		l16.setFont(font1);
		l16.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l17 = new JLabel();
		l17.setBounds(210,360,300,30);
		l17.setForeground(col2);
		l17.setFont(font1);
		l17.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		l18 = new JLabel();
		l18.setBounds(210,420,300,30);
		l18.setForeground(col2);
		l18.setFont(font1);
		l18.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		
		if(findCarModel(name).getCategory().equals("Hybrid")==false)
		{
			l17.setText("Price: "+findCarModel(name).getPrice()+"$ each");
		}
		else
		{
			l18.setText("Price: "+findCarModel(name).getPrice()+"$ each");
		}
		
		if(findCarModel(name).getCategory().equals("Electric")==false)
		{
			l13.setText("Engine Model: "+findCarModel(name).getEngineName(findCarModel(name)));
			l14.setText("Engine Power: "+findCarModel(name).getEnginePower(findCarModel(name))+" HP");
		}
		else
		{
			l13.setText("Motor Model: "+findCarModel(name).getMotorName(findCarModel(name)));
			l14.setText("Motor Power: "+findCarModel(name).getMotorPower(findCarModel(name))+" Watt");
		}
		
		if(findCarModel(name).getCategory().equals("Hybrid"))
		{
			l15.setText("Motor Model: "+findCarModel(name).getMotorName(findCarModel(name)));
			l16.setText("Motor Power: "+findCarModel(name).getMotorPower(findCarModel(name))+" Watt");
		}
		
		remainingCount = availableQuantity - count;
		
		this.findCarModel(name).setQuantity(remainingCount);
		
		tf = new JTextField();
		tf.setText("1");
		tf.setForeground(col);
		tf.setBackground(new Color (31, 29, 29));
		tf.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		tf.setBounds(423,500,30,30);
		
		f.add(b1);
		f.add(b2);
		f.add(back);
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
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(l15);
		f.add(l16);
		f.add(l17);
		f.add(l18);
		f.add(tf);
		
		f.setSize(750,850);
		f.setLayout(null);
		f.setLocationRelativeTo(null);

		try 
		{
			f.setIconImage(image.getImage());
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null Pointer Exception caught");
		}
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setResizable(false);
		f.setVisible(true);
	}
	
	public CarModel findCarModel(ArrayList<Car>cars, String a)
	{
		CarModel c = null;
		
		for(int i=0; i<cars.size(); i++)
		{
			for(int j=0; j<cars.get(i).getModels().size(); j++)
			{
				if(cars.get(i).getModels().get(j).getModelName().equals(a))
				{
					c = cars.get(i).getModels().get(j);
					break;
				}
			}
		}
		return c;
	}
	
	public boolean searchModel(ArrayList<Car>cars, String a)
	{
		boolean test = false;
		
		for(int i=0; i<cars.size(); i++)
		{
			for(int j=0; j<cars.get(i).getModels().size(); j++)
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
	
	public boolean searchCar(ArrayList<Car> cars,String a)
	{
		boolean test = false;
		
		for(int i=0; i<cars.size();i++)
		{
			if(cars.get(i).getBrandName().equals(a))
			{
				test = true;
				break;
			}
		}
		return test;
	}
	
	public Car getCar(ArrayList<Car> cars,String a)
	{
		Car test = null;
		
		for(int i=0; i<cars.size();i++)
		{
			if(cars.get(i).getBrandName().equals(a))
			{
				test = cars.get(i);
				break;
			}
		}
		return test;
	}
	
	public void addMoreCarsToGarage(ArrayList<Car> a, String brand, String model, int count)
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).getBrandName().equals(brand))
			{
				for(int j=0; j<a.get(i).getModels().size();j++)
				{
					if(a.get(i).getModels().get(j).getModelName().equals(model))
					{
						a.get(i).getModels().get(j).setQuantity(a.get(i).getModels().get(j).getQuantity()+count);
					}
				}
			}
		}
	}
	
	public CarModel findCarModel(String a)
	{
		CarModel test = null;
		
		for(int i=0; i<c.getModels().size(); i++)
		{
			if(c.getModels().get(i).getModelName().equals(a))
			{
				test = c.getModels().get(i);
				break;
			}
		}
		return test;
	}

	public void addProfit(double d, User a)
	{
		try
		{
			if(a.getType().equals("Regular"))
			{
				getAdmin("rono").setBalance(getAdmin("rono").getBalance()+(d/4));
				getAdmin("meraz").setBalance(getAdmin("meraz").getBalance()+(d/4));
				getAdmin("rafsan").setBalance(getAdmin("rafsan").getBalance()+(d/4));
				getAdmin("apurba").setBalance(getAdmin("apurba").getBalance()+(d/4));
			}
			else
			{
				if(a.getUserName().equals("rono"))
				{
					getAdmin("meraz").setBalance(getAdmin("meraz").getBalance()+(d/3));
					getAdmin("rafsan").setBalance(getAdmin("rafsan").getBalance()+(d/3));
					getAdmin("apurba").setBalance(getAdmin("apurba").getBalance()+(d/3));
				}
				
				if(a.getUserName().equals("meraz"))
				{
					getAdmin("rono").setBalance(getAdmin("rono").getBalance()+(d/3));
					getAdmin("rafsan").setBalance(getAdmin("rafsan").getBalance()+(d/3));
					getAdmin("apurba").setBalance(getAdmin("apurba").getBalance()+(d/3));
				}
				
				if(a.getUserName().equals("rafsan"))
				{
					getAdmin("meraz").setBalance(getAdmin("meraz").getBalance()+(d/3));
					getAdmin("rono").setBalance(getAdmin("rono").getBalance()+(d/3));
					getAdmin("apurba").setBalance(getAdmin("apurba").getBalance()+(d/3));
				}
				
				if(a.getUserName().equals("apurba"))
				{
					getAdmin("meraz").setBalance(getAdmin("meraz").getBalance()+(d/3));
					getAdmin("rafsan").setBalance(getAdmin("rafsan").getBalance()+(d/3));
					getAdmin("rono").setBalance(getAdmin("rono").getBalance()+(d/3));
				}
			}
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null Pointer Exception caught");
		}
	}

	public User getAdmin(String a)
	{
		User test = null;
		
		for(int i=0; i<Login.users.length;i++)
		{
			if(Login.users[i]!=null)
			{
				if(Login.users[i].getUserName().equals(a))
				{
					test = Login.users[i];
					break;
				}
			}
		}
		
		return test;
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==b1)
		{
			if(remainder>0)
			{
				if(searchCar(u.getGarageCars(),(c.getBrandName()+" "))==true)
				{
					if(searchModel(u.getGarageCars(), modelName+" ")==true)
					{
						addMoreCarsToGarage(u.getGarageCars(), (c.getBrandName()+" "), (modelName+" "), count);//just increases count of a model
						u.addCarCount(count);
					}
					else
					{
						CarModel test1 = new CarModel(modelName+" ",count,this.findCarModel(modelName).getPrice());
						u.getCarfromGarage(c.getBrandName()+" ").addModel(test1);
						u.addCarCount(count);
					}
				}
				else
				{
					Car test = new Car(c.getBrandName()+" ");
					
					CarModel test1 = new CarModel(modelName+" ",count,this.findCarModel(modelName).getPrice());
					
					test.addModel(test1);
					u.addCarsToGarage(test);
					u.addCarCount(count);
				}
						
				new Thanks(u,cars);
				u.setBalance(remainder);
				this.findCarModel(modelName).sellQuantity(count);

				double testBalance = this.findCarModel(modelName).getPrice();
				
				this.addProfit(testBalance, u);

				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry. You don't have enough balance.");
			}
		}
		
		if(e.getSource()==b2)
		{
			int d = 0;
			
			try
			{
				d = Integer.parseInt(tf.getText());
			}
			catch(NullPointerException npe)
			{
				System.out.println("Null Pointer Exception caught");
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Number Format Exception caught");
			}
			
			int availableQuantity = findCarModel(modelName).getQuantity();
			
			if(d>0)
			{
				this.count = d;
				
				price = this.findCarModel(modelName).getPrice();
				
				cost = price*count;
				
				remainder = u.getBalance() - cost;
				
				if(d>availableQuantity)
				{
					JOptionPane.showMessageDialog(null, "Oops, We have "+availableQuantity+" in stock for "+c.getBrandName()+" "+modelName+" . Please try again");
				}
				
				else
				{
					double testRemainder = u.getBalance() - cost;

					l4.setText("Number of cars: "+count);
					l5.setText("Your total cost: "+count+" x "+price+" = "+String.format("%.2f", cost)+" $");
					l7.setText("Your balance after purchase: "+String.format("%.2f", testRemainder)+" $");
					
					b1.setVisible(true);
					l4.setVisible(true);
					l5.setVisible(true);
					l7.setVisible(true);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid amount.");
			}
		}
		
		if(e.getSource()==back)
		{
			new SelectCar(u,c,cars,i);
			f.dispose();
		}
	}
}
