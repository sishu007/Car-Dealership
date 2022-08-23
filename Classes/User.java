package Classes;

import java.util.*;

public class User
{
	private String userName, password, fullName, gender, contactNum, type, address;
	private int carCount;
	
	private ArrayList<Car> carsOwned = new ArrayList<Car>();
	
	private BankAccount acc = new BankAccount();
	
	public void setName(String a)
	{
		fullName = a;
	}
	
	public void setUserName(String a)
	{
		userName = a;
	}
	
	public void setPassword(String a)
	{
		password = a;
	}
	
	public void setGender(String a)
	{
		gender = a;
	}
	
	public void setContactNum(String a)
	{
		contactNum = a;
	}
	
	public void setType(String a)
	{
		type = a;
	}
	
	public void setAddress(String a)
	{
		address = a;
	}
	
	public String getName()
	{
		return fullName;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getContactNum()
	{
		return contactNum;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	User(String a, String b, String c)
	{
		fullName = a;
		userName = b;
		password = c;
		
		carCount = 0;
	}
	
	User(String a, String b, String c, String d)
	{
		fullName = a;
		userName = b;
		password = c;
		type = d;
		
		carCount = 0;
	}
	
	User(String a, String b, String c, String d, String e)
	{
		fullName = a;
		userName = b;
		password = c;
		type = d;
		acc.setBankName(e);
		
		carCount = 0;
	}
	
	User(String a, String b, String c, String d, String e, String f)
	{
		fullName = a;
		userName = b;
		password = c;
		type = d;
		acc.setBankName(e);
		address = f;
		
		carCount = 0;
	}
	
	User(String a, String b, String c, String d, String e, String f, String g)
	{
		fullName = a;
		userName = b;
		password = c;
		type = d;
		acc.setBankName(e);
		address = f;
		acc.setBankAccNo(g);
		
		carCount = 0;
	}
	
	User(String a, String b, String c, String d, String e, double f)
	{
		fullName = a;
		userName = b;
		password = c;
		type = d;
		acc.setBankName(e);
		acc.setBalance(f);
		
		carCount = 0;
	}
	
	User(String a, String b, String c, String d, String e, String f, String g, double h)
	{
		fullName = a;
		userName = b;
		password = c;
		type = d;
		acc.setBankName(e);
		acc.setBankAccNo(f);
		acc.setBankAccPass(g);
		acc.setBalance(h);
		
		carCount = 0;
	}
	
	public void setBankName(String a)
	{
		acc.setBankName(a);
	}
	
	public void setBankAccNo(String a)
	{
		acc.setBankAccNo(a);
	}
	
	public void setBankAccPass(String a)
	{
		acc.setBankAccPass(a);
	}
	
	public void setBalance(double d)
	{
		acc.setBalance(d);
	}
	
	public String getBankName()
	{
		return acc.getBankName();
	}
	
	public String getBankAccNo()
	{
		return acc.getBankAccNo();
	}
	
	public String getBankAccPass()
	{
		return acc.getBankAccPass();
	}
	
	public double getBalance()
	{
		return acc.getBalance();
	}
	
	public int getCarCount()
	{
		return carCount;
	}
	
	public void addCarsToGarage(Car c)
	{
		carsOwned.add(c);
	}
	
	public ArrayList<Car> getGarageCars()
	{
		return carsOwned;
	}
	
	public Car getCarfromGarage(String a)
	{
		Car c = null;
		
		for(int i = 0; i< carsOwned.size(); i++)
		{
			if(carsOwned.get(i).getBrandName().equals(a))
			{
				c = carsOwned.get(i);
			}
		}
		return c;
	}
	
	public void addOwnedModels(Car c, CarModel m)
	{
		c.addModel(m);
	}
	
	public void addCarCount(int a)
	{
		carCount += a;
	}
}
