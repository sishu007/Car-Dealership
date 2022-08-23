package Classes;

import Interfaces.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SelectNewCollectionCar implements ActionListener, IFindingCar 
{
	JFrame f;
	
	JLabel l1,l2,l3,l4,l5;
	
	JButton b1,b2,back;
	
	JComboBox<?> comboCars, comboModels, colors;
	
	User u;
	
	ArrayList<Car> cars;
	
	ArrayList<Car> allCars;
	
	ArrayList<String>carNames = new ArrayList<String>();
	
	ArrayList<String>modelNames = new ArrayList<String>();
	
	public SelectNewCollectionCar(User a, ArrayList<Car> cars1, ArrayList<Car> cars2)
	{
		u = a;
		
		cars = cars1;
		
		allCars = cars2;
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		
		f = new JFrame("Select a car from our new collection");
		
		ImageIcon i = new ImageIcon("Images/rram wow.png");
		ImageIcon i1 = new ImageIcon("Images/icon circle.png");
		
		l1 = new JLabel();
		l1.setText(cars1.get(0).getBrandName());
		l1.setForeground(col);
		l1.setBackground(col1);
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		l1.setBounds(100,2150,400,20);
		
		l2 = new JLabel(i);
		l2.setBounds(-20,-30,635,351);
		
		l3 = new JLabel("Choose Brand:");
		l3.setBounds(160,280,150,30);
		l3.setForeground(col);
		l3.setBackground(col1);
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		
		l4 = new JLabel("Choose Model:");
		l4.setBounds(160,320,150,30);
		l4.setForeground(col);
		l4.setBackground(col1);
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		l4.setVisible(false);
		
		l5 = new JLabel("Choose Color:");
		l5.setBounds(160,360,150,30);
		l5.setForeground(col);
		l5.setBackground(col1);
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		l5.setVisible(false);
		
		this.addCarsToArray();
		
		comboCars = new JComboBox<>(carNames.toArray());
		comboCars.setForeground(col);
		comboCars.setBackground(col1);
		comboCars.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		comboCars.setBounds(290, 280, 120, 30);
		
		b1 = new JButton("Check");
		b1.setBounds(240,400,90,30);
		b1.setForeground(col);
		b1.setBackground(col1);
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		b1.addActionListener(this);
		
		b2 = new JButton ("Confirm");
		b2.setBounds(240,435,90,30);
		b2.setForeground(col);
		b2.setBackground(col1);
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		b2.addActionListener(this);
		b2.setVisible(false);
		
		back = new JButton ("Back");
		back.setBounds(10,10,90,30);
		back.setForeground(col);
		back.setBackground(col1);
		back.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		back.addActionListener(this);
		
		String[] colors1 = {"Red", "Blue", "Green", "Yellow", "Sky Blue", "Grey", "Black", "Silver", "White", "Orange", "Lime Green"}; 
		
		colors = new JComboBox<>(colors1);
		colors.setBounds(290,360,100,30);
		colors.setForeground(col);
		colors.setBackground(col1);
		colors.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		colors.setVisible(false);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(comboCars);
		f.add(colors);
		f.add(b1);
		f.add(b2);
		f.add(back);
		
		f.setSize(600,600);
		f.setLayout(null);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setIconImage(i1.getImage());
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	
	public void addCarsToArray()
	{
		for(int i=0; i<cars.size();i++)
		{
			this.carNames.add(cars.get(i).getBrandName());
		}
	}
	
	public void addModelsToArray(Car c)
	{
		for(int i=0; i<c.getModels().size();i++)
		{
			this.modelNames.add(c.getModels().get(i).getModelName());
		}
	}
	
	public Car getCar(String a)
	{
		Car c = null;
		
		for(int i = 0; i<cars.size();i++)
		{
			if(cars.get(i).getBrandName().equals(a))
			{
				c = cars.get(i);
			}
		}
		return c;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==b1)
		{
			colors.setVisible(true);
			b2.setVisible(true);
			
			String a = comboCars.getSelectedItem().toString();
			
			Car c = this.getCar(a);
			
			this.addModelsToArray(c);
			
			Color col = new Color(214, 21, 63);
			
			l4.setVisible(true);
			l5.setVisible(true);
			
			comboModels = new JComboBox<>(modelNames.toArray());
			comboModels.setForeground(col);
			comboModels.setBackground(new Color (31, 29, 29));
			comboModels.setFont(new Font("Comic Sans MS",Font.BOLD,14));
			comboModels.setBounds(290, 320, 100, 30);
			
			f.add(comboModels);
			f.setVisible(true);
		}
		
		if(e.getSource()==b2)
		{
			String a = comboCars.getSelectedItem().toString();
			String b = comboModels.getSelectedItem().toString();
			String c = colors.getSelectedItem().toString();
			
			Car car = getCar(a);
			
			ImageIcon i = new ImageIcon("Images/icon circle.png");
			
			new ConfirmCar(u,car,b,c,allCars,i);
			f.dispose();
		}
		
		if(e.getSource()==back)
		{
			new BuyCar(u,allCars);
			f.dispose();
		}
	}

}
