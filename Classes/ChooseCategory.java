package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ChooseCategory implements ActionListener
{
	JFrame f;
	
	JLabel l1;
	
	JButton b1,b2,b3;
	
	JComboBox<?> combo;
	
	User u;
	
	ArrayList <Car> cars;
	
	
	ArrayList<Car> allCars;
	
	ChooseCategory(User a, ArrayList<Car> cars1)
	{
		u = a;
		
		cars = cars1;
		
		allCars = new ArrayList<Car>(cars);
		
		f = new JFrame("Choose car type");
		
		String carTypes[] = {"Fuel","Electric","Hybrid"};
		
		combo = new JComboBox<>(carTypes);
		combo.setBounds(100,100,100,20);
		
		Icon i1 = new ImageIcon("Images/button_fuel.png");
		Icon i2 = new ImageIcon("Images/button_electric.png");
		Icon i3 = new ImageIcon("Images/button_hybrid.png");
		
		b1 = new JButton(i1);
		b1.setBounds(97,50,150,250);
		b1.addActionListener(this);
		
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		
		b2 = new JButton(i2);
		b2.setBounds(253,50,150,250);
		b2.addActionListener(this);
		
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		
		b3 = new JButton(i3);
		b3.setBounds(97,306,306,80);
		b3.addActionListener(this);
		
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setSize(500,500);
		f.getContentPane().setBackground(new Color (10,20,30));
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setVisible(true);
	}

	public ArrayList<Car> getCarsOfCategory(ArrayList<Car>a, String b,int count)
	{
		ArrayList<Car> ok = new ArrayList<>(a);
		
		for(int k = 0; k<count; k++)
		{
			int justBreak = 0;
			
			for(int i=0; i<ok.size(); i++)
			{
				if(justBreak == 0)
				{
					for(int j =0; j<ok.get(i).getModels().size();j++)
					{
						if(ok.get(i).getModels().get(j).getCategory().equals(b)==false)
						{
							CarModel c;
							c = ok.get(i).getModels().get(j);
							ok.get(i).getModels().remove(c);
							justBreak++;
							break;
						}
					}
				}
				else
				{
					break;
				}
			}
		}
		return ok;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			
		}
		
		if(e.getSource()==b2)
		{
			
		}
		
		if(e.getSource()==b3)
		{
			
		}
	}
}
