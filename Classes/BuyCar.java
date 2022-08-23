package Classes;

import Interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BuyCar implements ActionListener, IFindingCar 
{
	JFrame f;
	
	JButton b1, b2, b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,right,left,home,search;
	
	ImageIcon i,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,icon,searchIcon;
	
	JTextField tf;
	
	JLabel l1,l2,bg;
	
	JComboBox<?> combo;
	
	ArrayList<Car> lessCars;
	
	ArrayList<String> carNames;
	
	User u;
	
	ArrayList<Car> cars;
	
	ArrayList<Car> allCars;
	
	public BuyCar(User a, ArrayList<Car>cars1)
	{
		u = a;
		
		cars = cars1;
		
		ImageIcon i1 = new ImageIcon("Images/nice car.jpg");
		
		lessCars = new ArrayList<Car>(cars);
	
		lessCars.remove(getCar("Lamborghini"));
		lessCars.remove(getCar("Ferrari"));
		lessCars.remove(getCar("Mercedes"));
		lessCars.remove(getCar("Aston Martin"));
		lessCars.remove(getCar("Audi"));
		lessCars.remove(getCar("Bentley"));
		lessCars.remove(getCar("BMW"));
		lessCars.remove(getCar("Bugatti"));
		lessCars.remove(getCar("Rolls Royce"));
		lessCars.remove(getCar("Ford"));
		lessCars.remove(getCar("Mitsubishi"));
		lessCars.remove(getCar("Nissan"));
		lessCars.remove(getCar("Porsche"));
		lessCars.remove(getCar("Tesla"));
		lessCars.remove(getCar("Koenigsegg"));
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		Font font = new Font("Comic Sans MS", Font.BOLD, 26);
		
		f = new JFrame("Choose a brand");
		
		l1 = new JLabel("Choose a brand:");
		l1.setBounds(490,75,300,40);
		l1.setForeground(col);
		l1.setFont(font);
		
		l2 = new JLabel("Search Brand:");
		l2.setBounds(835,20,120,30);
		l2.setForeground(col);
		l2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		
		bg = new JLabel(i1);
		bg.setBounds(0,0,1200,750);
		
		i = new ImageIcon("Images/lambo.png");
		i2 = new ImageIcon("Images/ferrari crop.png");
		i3 = new ImageIcon("Images/mercedes.png");
		i4 = new ImageIcon("Images/aston martin.png");
		i5 = new ImageIcon("Images/audi.png");
		i6 = new ImageIcon("Images/bentley.png");
		i7 = new ImageIcon("Images/bmw crop.png");
		i8 = new ImageIcon("Images/bugatti.png");
		i9 = new ImageIcon("Images/rolls royce.png");
		i10 = new ImageIcon("Images/ford.png");
		i11 = new ImageIcon("Images/mitsubishi.png");
		i12 = new ImageIcon("Images/nissan.png");
		i13 = new ImageIcon("Images/porsche.png");
		i14 = new ImageIcon("Images/tesla.png");
		i15 = new ImageIcon("Images/koenigsegg.png");
		
		searchIcon = new ImageIcon("Images/searchicon.png");
		
		Icon iRight = new ImageIcon("Images/arrow right.png");
		Icon iLeft = new ImageIcon("Images/arrow left.png");
		
		tf = new JTextField();
		tf.setBounds(950,20,150,30);
		tf.setForeground(col);
		tf.setBackground(col1);
		tf.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		
		b1 = new JButton("Proceed");
		b2 = new JButton(i2);
		b3 = new JButton(i3);
		b4 = new JButton("New Collection");
		b5 = new JButton(i);
		b6 = new JButton(i5);
		b7 = new JButton(i4);
		b8 = new JButton(i6);
		b9 = new JButton(i7);
		b10 = new JButton(i8);
		b11 = new JButton(i9);
		b12 = new JButton(i10);
		b13 = new JButton(i11);
		b14 = new JButton(i12);
		b15 = new JButton(i13);
		b16 = new JButton(i14);
		b17 = new JButton(i15);
		
		right = new JButton(iRight);
		left = new JButton(iLeft);
		
		home = new JButton("Home");
		
		search = new JButton(searchIcon);
		
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		
		b5.setOpaque(false);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		
		b6.setOpaque(false);
		b6.setContentAreaFilled(false);
		b6.setBorderPainted(false);
		
		b7.setOpaque(false);
		b7.setContentAreaFilled(false);
		b7.setBorderPainted(false);
		
		b8.setOpaque(false);
		b8.setContentAreaFilled(false);
		b8.setBorderPainted(false);
		
		b9.setOpaque(false);
		b9.setContentAreaFilled(false);
		b9.setBorderPainted(false);
		
		b10.setOpaque(false);
		b10.setContentAreaFilled(false);
		b10.setBorderPainted(false);
		
		b11.setOpaque(false);
		b11.setContentAreaFilled(false);
		b11.setBorderPainted(false);
	
		b12.setOpaque(false);
		b12.setContentAreaFilled(false);
		b12.setBorderPainted(false);
		
		b13.setOpaque(false);
		b13.setContentAreaFilled(false);
		b13.setBorderPainted(false);
		
		b14.setOpaque(false);
		b14.setContentAreaFilled(false);
		b14.setBorderPainted(false);
		
		b15.setOpaque(false);
		b15.setContentAreaFilled(false);
		b15.setBorderPainted(false);
		
		b16.setOpaque(false);
		b16.setContentAreaFilled(false);
		b16.setBorderPainted(false);
		
		b17.setOpaque(false);
		b17.setContentAreaFilled(false);
		b17.setBorderPainted(false);
		
		left.setOpaque(false);
		left.setContentAreaFilled(false);
		left.setBorderPainted(false);
		
		right.setOpaque(false);
		right.setContentAreaFilled(false);
		right.setBorderPainted(false);
		
		search.setBackground(col1);
		
		b1.setBounds(110,100,80,20);
		b2.setBounds(710,135,160,170);
		b3.setBounds(110,385,160,170);
		b4.setBounds(490,595,200,40);
		b5.setBounds(910,135,160,170);
		b6.setBounds(310,129,160,160);
		b7.setBounds(110,168,160,72);
		b8.setBounds(510,165,160,99);
		b9.setBounds(305,385,160,170);
		b10.setBounds(510,385,165,175);
		b11.setBounds(740,385,103,175);
		b12.setBounds(905,400,180,135);
		b13.setBounds(103,200,160,170);
		b14.setBounds(307,210,160,137);
		b15.setBounds(510,200,160,170);
		b16.setBounds(730,203,133,170);
		b17.setBounds(920,205,160,170);
		left.setBounds(10,320,60,80);
		right.setBounds(1115,320,60,80);
		home.setBounds(550,20,80,30);
		search.setBounds(1100,20,30,30);
		
		b4.setForeground(col);
		b4.setBackground(new Color (31, 29, 29));
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		right.addActionListener(this);
		left.addActionListener(this);
		home.addActionListener(this);
		search.addActionListener(this);
		
		left.setVisible(false);
		b13.setVisible(false);
		b14.setVisible(false);
		b15.setVisible(false);
		b16.setVisible(false);
		b17.setVisible(false);
		
		home.setBackground(col1);
		home.setForeground(col);
		home.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		ArrayList<String>test = new ArrayList<String>();
		
		for(int i=0; i<cars1.size();i++)
		{
			test.add(cars1.get(i).getBrandName());
		}
		
		
		this.carNames = test;
		
		combo = new JComboBox<>(carNames.toArray());
		combo.setBounds(100,200,100,20);
		
		icon = new ImageIcon("Images/icon circle.png");
		
		f.setSize(1200,750);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		
		f.add(l2);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		f.add(b17);
		f.add(l1);
		f.add(left);
		f.add(right);
		f.add(home);
		f.add(search);
		f.add(tf);
		f.add(bg);
		
		if(lessCars.size()==0)
		{
			b4.setVisible(false);
		}
		else
		{
			b4.setVisible(true);
		}
		
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setIconImage(icon.getImage());
		f.setVisible(true);
	}
	
	public boolean isEmpty(Car c)
	{
		boolean test = false;
		
		if(c.getModels().size()==0)
		{
			test = true;
		}
		return test;
	}
	
	public void setCars()
	{
		for(int i=0; i<cars.size();i++)
		{
			carNames.add(cars.get(i).getBrandName());
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			String a = combo.getSelectedItem().toString();
			
			Car c = getCar(a);
			
			if(c!=null)
			{
				//do nothing
			}
			else
			{
				JOptionPane.showMessageDialog(null, "error");
			}
		}
		
		if(e.getSource()==b2)
		{
			Car c = getCar("Ferrari");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i2);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Ferrari");
			}
		}
		
		if(e.getSource()==b3)
		{
			Car c = getCar("Mercedes");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i3);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Mercedes");
			}
		}
		
		if(e.getSource()==b4)
		{
			new SelectNewCollectionCar(u,lessCars,cars);
			f.dispose();
		}
		
		if(e.getSource()==b5)
		{
			Car c = getCar("Lamborghini");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Lamborghini");
			}
		}
		
		if(e.getSource()==b6)
		{
			Car c = getCar("Audi");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i5);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Audi");
			}
		}
		
		if(e.getSource()==b7)
		{
			Car c = getCar("Aston Martin");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i4);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Aston Martin");
			}
		}
		
		if(e.getSource()==b8)
		{
			Car c = getCar("Bentley");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i6);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Bentley");
			}
		}
		
		if(e.getSource()==b9)
		{
			Car c = getCar("BMW");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i7);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for BMW");
			}
		}
		
		if(e.getSource()==b10)
		{
			Car c = getCar("Bugatti");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i8);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Bugatti");
			}
		}
		
		if(e.getSource()==b11)
		{
			Car c = getCar("Rolls Royce");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i9);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Rolls Royce");
			}
		}
		

		if(e.getSource()==b12)
		{
			Car c = getCar("Ford");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i10);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Ford");
			}
		}
		
		if(e.getSource()==b13)
		{
			Car c = getCar("Mitsubishi");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i11);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Mitsubishi");
			}
		}
		
		if(e.getSource()==b14)
		{
			Car c = getCar("Nissan");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i12);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Nissan");
			}
		}
		
		if(e.getSource()==b15)
		{
			Car c = getCar("Porsche");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i13);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Porsche");
			}
		}
		
		if(e.getSource()==b16)
		{
			Car c = getCar("Tesla");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i14);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Tesla");
			}
		}
		
		if(e.getSource()==b17)
		{
			Car c = getCar("Koenigsegg");
			
			if(isEmpty(c)==false)
			{
				new SelectCar(u,c,cars,i15);
				f.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry no cars are available for Koenigsegg");
			}
		}
		
		if(e.getSource()==left)
		{
			right.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(true);
			b5.setVisible(true);
			b6.setVisible(true);
			b7.setVisible(true);
			b8.setVisible(true);
			b9.setVisible(true);
			b10.setVisible(true);
			b11.setVisible(true);
			b12.setVisible(true);
			
			left.setVisible(false);
			b13.setVisible(false);
			b14.setVisible(false);
			b15.setVisible(false);
			b16.setVisible(false);
			b17.setVisible(false);
		}
		
		if(e.getSource()==right)
		{
			right.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(false);
			b5.setVisible(false);
			b6.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			b9.setVisible(false);
			b10.setVisible(false);
			b11.setVisible(false);
			b12.setVisible(false);
			
			left.setVisible(true);
			b13.setVisible(true);
			b14.setVisible(true);
			b15.setVisible(true);
			b16.setVisible(true);
			b17.setVisible(true);
		}
		
		if(e.getSource()==home)
		{
			f.dispose();
			new Home(u,cars);
		}
		
		if(e.getSource()==search)
		{
			String test = tf.getText();
			
			if(test.isEmpty()==false)
			{
				Car c = getCar(test);
				
				if(c!=null)
				{
					new SelectCar(u,c,cars,c.gettingImage());
					f.dispose();
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null, "Sorry no cars are available for \""+tf.getText()+"\"");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Enter a word first");
			}
		}
	}
	
	public Car getCar(String name)
	{
		Car c = null;
		
		name = name.toLowerCase();
		
		for(int i=0; i<cars.size(); i++)
		{
			if(cars.get(i).getBrandName().toLowerCase().equals(name))
			{
				c = cars.get(i);
				break;
			}
		}
		return c;
	}
}
