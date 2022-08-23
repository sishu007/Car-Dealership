package Classes;

import javax.swing.ImageIcon;

public class HybridCarModel extends CarModel 
{
	private String motorName, engineName;
	private double motorPower, enginePower;
	
	public HybridCarModel(String a, int b, double c, String d, ImageIcon e, double f, double g, String h, double i, String j, double k) 
	{
		super(a,b,c,d,e,f,g);
		engineName = h;
		enginePower = i;
		motorName = j;
		motorPower = k;
	}
	
	public HybridCarModel(String a, int b, double c, String d, double f, double g, String h, double i, String j, double k) 
	{
		super(a,b,c,d,f,g);
		engineName = h;
		enginePower = i;
		motorName = j;
		motorPower = k;
	}
	
	public HybridCarModel(String a, int b, double c, String d, ImageIcon i) 
	{
		super(a,b,c,d,i);
	}
	
	public HybridCarModel(String a, int b, double c, String d) 
	{
		super(a,b,c,d);
	}
	
	public void setEngineName(String a)
	{
		engineName = a;
	}
	
	public void setEnginePower(double d)
	{
		enginePower = d;
	}
	
	public void setMotorName(String a)
	{
		motorName = a;
	}
	
	public void setMotorPower(double d)
	{
		motorPower = d;
	}
	
	public String getEngineName() 
	{
		return engineName;
	}
	
	public double getEnginePower()
	{
		return enginePower;
	}
	
	public String getMotorName()
	{
		return motorName;
	}
	
	public double getMotorPower()
	{
		return motorPower;
	}
}

