package Classes;

import javax.swing.ImageIcon;

public class FuelCarModel extends CarModel
{
	private String engineName;
	private double enginePower;
	
	public FuelCarModel(String a, int b, double c, String d, ImageIcon e, double f, double g, String h, double i) 
	{
		super(a,b,c,d,e,f,g);
		engineName = h;
		enginePower = i;
	}
	
	public FuelCarModel(String a, int b, double c, String d, double f, double g, String h, double i) 
	{
		super(a,b,c,d,f,g);
		engineName = h;
		enginePower = i;
	}
	
	public FuelCarModel(String a, int b, double c, double d, String e, String f, double g) 
	{
		super(a,b,c,d,e);
		engineName = f;
		enginePower = g;
	}
	
	public FuelCarModel(String a, int b, double c, String d, ImageIcon i) 
	{
		super(a,b,c,d,i);
	}
	
	public FuelCarModel(String a, int b, double c, String d) 
	{
		super(a,b,c,d);
	}
	
	public void setEngineName(String a)
	{
		engineName = a;
	}
	
	public String getEngineName() 
	{
		return engineName;
	}
	
	public void setEnginePower(double a)
	{
		enginePower = a;
	}
	
	public double getEnginePower() 
	{
		return enginePower;
	}
}
