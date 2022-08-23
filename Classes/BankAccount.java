package Classes;

public class BankAccount 
{
	private String bankName;
	private String bankAccNo;
	private String bankAccPass;
	private double balance;
	
	BankAccount()
	{
		
	}
	
	BankAccount(String a, String b, String c, double d)
	{
		bankName = a;
		bankAccNo = b;
		bankAccPass = c;
		balance = d;
	}
	
	public void setBankName(String a)
	{
		bankName = a;
	}
	
	public void setBankAccNo(String a)
	{
		bankAccNo = a;
	}
	
	public void setBankAccPass(String a)
	{
		bankAccPass = a;
	}
	
	public void setBalance(double a)
	{
		balance = a;
	}
	
	public String getBankName()
	{
		return bankName;
	}
	
	public String getBankAccNo()
	{
		return bankAccNo;
	}
	
	public String getBankAccPass()
	{
		return bankAccPass;
	}
	
	public double getBalance()
	{
		return balance;
	}
}
