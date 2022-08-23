package Classes;

import javax.swing.ImageIcon;

public class ElectricCarModel extends CarModel
{
	private String motorName;
	private double motorPower;
	
	public ElectricCarModel(String a, int b, double c, String d, ImageIcon e, double f, double g, String h, double i) 
	{
		super(a,b,c,d,e,f,g);
		motorName = h;
		motorPower = i;
	}
	
	public ElectricCarModel(String a, int b, double c, String d, double f, double g, String h, double i) 
	{
		super(a,b,c,d,f,g);
		motorName = h;
		motorPower = i;
	}
	
	public ElectricCarModel(String a, int b, double c, String d, ImageIcon i) 
	{
		super(a,b,c,d,i);
	}
	
	public ElectricCarModel(String a, int b, double c, String d) 
	{
		super(a,b,c,d);
	}
	
	public ElectricCarModel(String a, int b, double c, String d, String e, double f) 
	{
		super(a,b,c,d);
		motorName = e;
		motorPower = f;
	}
	
	public void setMotorName(String a)
	{
		motorName = a;
	}
	
	public void setMotorPower(double d)
	{
		motorPower = d;
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
