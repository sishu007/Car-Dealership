package Classes;

import javax.swing.*;

public class CarModel 
{
	private String modelName;
	private int quantity;
	private double topSpeed;
	private double mileage;
	private double price;
	private String category;
	private ImageIcon image;
	
	public CarModel (String a, int b, double d, String e, ImageIcon i)
	{
		modelName = a;
		quantity = b;
		price = d;
		category = e;
		image = i;
	}
	
	public CarModel (String a, int b, double d, String e, ImageIcon i,double f,double g)
	{
		modelName = a;
		quantity = b;
		topSpeed = f;
		mileage = g;
		price = d;
		category = e;
		image = i;
	}
	
	public CarModel (String a, int b, double d, String e,double f,double g)
	{
		modelName = a;
		quantity = b;
		topSpeed = f;
		mileage = g;
		price = d;
		category = e;
	}
	
	public CarModel (String a, int b, double c, double d, String e)
	{
		modelName = a;
		quantity = b;
		topSpeed = c;
		price = d;
		category = e;
	}
	
	public CarModel (String a, int b,double c, String d)
	{
		modelName = a;
		quantity = b;
		price = c;
		category = d;
	}
	
	public CarModel (String a, int b, double c)
	{
		modelName = a;
		quantity = b;
		price = c;
	}
	
	public CarModel (String a, int b)
	{
		modelName = a;
		quantity = b;
	}
	
	public void setModelName(String a)
	{
		modelName = a;
	}
	
	public void setQuantity(int c)
	{
		quantity = c;
	}
	
	public void setTopsSpeed(double d)
	{
		topSpeed = d;
	}
	
	
	public void setMileage(double d)
	{
		mileage = d;
	}
	
	
	public void setCategory(String a)
	{
		category = a;
	}
	
	public void setterImage(ImageIcon i)
	{
		image = i;
	}
	
	public String getModelName() 
	{
		return modelName;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getTopSpeed()
	{
		return topSpeed;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public ImageIcon getterImage()
	{
		return image;
	}
	
	
	public double getMileage()
	{
		return mileage;
	}
	
	public String getEngineName(CarModel c) 
	{
	    if(c instanceof FuelCarModel) {return ((FuelCarModel)c).getEngineName();}
	    if(c instanceof HybridCarModel) {return ((HybridCarModel)c).getEngineName();}
		return null;
	}
	
	public double getEnginePower(CarModel c) 
	{
	    if(c instanceof FuelCarModel) {return ((FuelCarModel)c).getEnginePower();}
	    if(c instanceof HybridCarModel) {return ((HybridCarModel)c).getEnginePower();}
		return 0;
	}
	
	public String getMotorName(CarModel c) 
	{
	    if(c instanceof ElectricCarModel) {return ((ElectricCarModel)c).getMotorName();}
	    if(c instanceof HybridCarModel) {return ((HybridCarModel)c).getMotorName();}
		return null;
	}
	
	public double getMotorPower(CarModel c) 
	{
	    if(c instanceof ElectricCarModel) {return ((ElectricCarModel)c).getMotorPower();}
	    if(c instanceof HybridCarModel) {return ((HybridCarModel)c).getMotorPower();}
		return 0;
	}
	
	public void addQuantity(int a)
	{
		quantity += a;
	}
	
	public void sellQuantity(int a)
	{
		quantity -= a;
	}
}
