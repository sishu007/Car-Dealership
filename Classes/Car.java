package Classes;

import java.util.ArrayList;
import javax.swing.*;

public class Car 
{
	private String brandName;
	private ArrayList<CarModel> models;
	private String color;
	private ImageIcon logo;
	
	public Car()
	{
		models = new ArrayList<CarModel>();
	}
	
	public Car(String a)
	{
		brandName = a;
		
		models = new ArrayList<CarModel>();
	}
	
	public Car(String a, ImageIcon i)
	{
		brandName = a;
		
		logo = i;
		
		models = new ArrayList<CarModel>();
	}
	
	public void setBrandName(String a)
	{
		brandName = a;
	}
	
	public String getBrandName()
	{
		return brandName;
	}
	
	public void settingImage(ImageIcon i)
	{
		logo = i;
	}
	
	public ImageIcon gettingImage()
	{
		return logo;
	}
	
	public void setColor(String a)
	{
		color = a;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public ArrayList<CarModel> getModels()
	{
		return models;
	}
	
	public void addModel (CarModel c)
	{
		models.add(c);
	}
	
	public boolean removeModel (String name)
	{
		boolean test = false;
		
		for (int i = 0; i<models.size(); i++)
		{
			if(models.get(i).getModelName().equals(name))
			{
				models.remove(i);
				test = true;
				break;
			}
		}
		return test;
	}
}
