package Classes;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

public class SelectCar implements ActionListener
{
	JFrame f;
	
	JButton b1,back;
	
	JLabel l1,l2,l3,l4;
	
	JComboBox<?> comboModels;
	JComboBox<?> comboColor;
	
	ArrayList <String> modelNames = new ArrayList<String>();
	
	ArrayList<Car> cars;
	
	ImageIcon i;
	
	Car c;
	
	User u;
	
	public SelectCar(User u,Car a,ArrayList<Car> cars1, ImageIcon image)
	{
		this.u = u;
		
		cars = cars1;
		
		c = a;
		
		i = image;
		
		setModelNames();
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		
		comboModels = new JComboBox<>(modelNames.toArray());
		comboModels.setForeground(col);
		comboModels.setBackground(new Color (31, 29, 29));
		comboModels.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		comboModels.setBounds(300, 290, 120, 30);
		
		String[] colors = {"Red", "Blue", "Green", "Yellow", "Sky Blue", "Grey", "Black", "Silver", "White", "Orange", "Lime Green"}; 
		
		comboColor = new JComboBox<>(colors);
		comboColor.setForeground(col);
		comboColor.setBackground(new Color (31, 29, 29));
		comboColor.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		comboColor.setBounds(300, 330, 120, 30);
		
		Font font = new Font("Comic Sans MS", Font.BOLD, 16);
		
		f = new JFrame("Buy a car manufactured by "+c.getBrandName()) ;
		
		b1 = new JButton("Proceed");
		b1.setBounds(245,440,100,30);
		b1.setForeground(col);
		b1.setBackground(col1);
		b1.setFont(font);
		b1.addActionListener(this);
		
		back = new JButton("Return");
		back.setBounds(245,480,100,30);
		back.setForeground(col);
		back.setBackground(col1);
		back.setFont(font);
		back.addActionListener(this);
		
		l1 = new JLabel("Your choice: "+c.getBrandName());
		l1.setBounds(180,200,300,40);
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
		l1.setForeground(new Color(214, 21, 63));
		
		l2 = new JLabel(image);
		l2.setBounds(210,25,165,175);
		
		l3 = new JLabel("Choose a model:");
		l3.setBounds(154,289,160,30);
		l3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		l3.setForeground(col);
		
		l4 = new JLabel("Choose a color:");
		l4.setBounds(154,329,160,30);
		l4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		l4.setForeground(col);
		
		f.add(b1);
		f.add(back);
		f.add(l1);
		f.add(l3);
		f.add(l4);
		f.add(comboModels);
		f.add(comboColor);
		f.add(l2);
		
		f.setSize(600,600);
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
		f.setResizable(false);
		f.getContentPane().setBackground(new Color (51, 47, 48));
		f.setVisible(true);
	}
	
	public void setModelNames()
	{
		for(int i =0; i<c.getModels().size(); i++)
		{
			modelNames.add(c.getModels().get(i).getModelName());
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			String a = null;
			
			try
			{
				a = comboModels.getSelectedItem().toString();
			}
			catch(NullPointerException npe)
			{
				System.out.println("Null Pointer Exception caught");
				JOptionPane.showMessageDialog(null, "Choose an item from the drop down menu (if there is any");
			}
			
			String b = comboColor.getSelectedItem().toString();
			
			new ConfirmCar(u,c,a,b,cars,i);
			f.dispose();
		}
		
		if(e.getSource()==back)
		{
			new BuyCar(u,cars);
			f.dispose();
		}
	}
}
