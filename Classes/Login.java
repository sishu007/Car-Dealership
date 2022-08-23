package Classes;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Login implements ActionListener
{
	static User users[] = new User [100000];
	
	static User u;
	
	ArrayList<Car> cars;
	
	JFrame f;
	
	ImageIcon i1, i2;
	
	JLabel l1, l2, l3;
	
	JTextField tf;
	
	JPasswordField pf;
	
	JButton b1, b2, b3, b4;
	
	Login(ArrayList<Car>cars1)
	{
		cars = cars1;
		
		Color col = new Color(214, 21, 63);
		Color col1 = new Color (31, 29, 29);
		Font font = new Font("Comic Sans MS", Font.BOLD, 16);
		
		f= new JFrame(); 
        
        i1 = new ImageIcon("Images/icon circle.png");
        i2 = new ImageIcon("Images/rram wow.png");
        
		l1 = new JLabel("Username:");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD, 17));
		l1.setForeground(col);
		l1.setBounds(240,360,100,30);

		l2 = new JLabel("Password:");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD, 17));
		l2.setForeground(col);
		l2.setBounds(246,390,100,30); 		
		
		l3 = new JLabel();
		l3.setIcon(i2);
		l3.setBounds(50,00,655,381);	
		
        tf = new JTextField();  
        tf.setForeground(col);
        tf.setFont(font);
        tf.setBackground(col1);
        tf.setBounds(326,363,160,27);  
		
		pf = new JPasswordField();  
		pf.setForeground(col);
        pf.setFont(font);
        pf.setBackground(col1);
        pf.setBounds(326,394,160,27); 
          
        b1 = new JButton("Login");  
        b1.setBounds(249,440,100,35);  
        b1.setForeground(col);
        b1.setFont(font);
        b1.setBackground(col1);
        b1.addActionListener(this);
        
        b2 = new JButton("Exit");  
        b2.setBounds(410,482,70,35);  
        b2.setForeground(col);
        b2.setFont(font);
        b2.setBackground(col1);
        b2.addActionListener(this);
        
        b3 = new JButton("Forgot Password?");
        b3.setBounds(249,482,156,35);
        b3.setForeground(col);
        b3.setFont(font);
        b3.setBackground(col1);
        b3.addActionListener(this);
       
        b4 = new JButton("Sign up");
        b4.setBounds(354,440,126,35);
        b4.setForeground(col);
        b4.setFont(font);
        b4.setBackground(col1);
        b4.addActionListener(this);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
        f.add(tf);
        f.add(pf);
		f.add(b1); 
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
        f.setSize(750,650);  
        f.setLayout(null);  
        f.setTitle("Login");
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setIconImage( i1.getImage() );
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(new Color(43, 44, 48)); 
        f.setVisible(true);             
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{  
			String user = tf.getText();
			String pass = String.valueOf(pf.getPassword());
			
			int counter = 0;
			
			for(int j=0; j<users.length; j++)
			{
				if(users[j]!=null)
				{
					if( user.equals(users[j].getUserName()))
					{
						if( pass.equals(users[j].getPassword()))
						{
							u = users[j];
							counter = 1;
							break;
						}
					}
				}
			}
			
			if(counter!=0)
			{
				new Home(u,cars);
				f.setVisible(false);
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid username and password");
			}
        }
		
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new ForgotPass(cars);
		}
		
		if(e.getSource()==b4)
		{
			f.setVisible(false);
			new Register(u,cars);
		}
	}
	
	public static String forgetPass(String a)
	{
		String b = null;
		
		for(int i = 0; i<users.length; i++)
		{
			if(users[i]!=null)
			{
				if( a.equals(users[i].getUserName()))
				{
					b = users[i].getPassword();
					break;
				}
			}	
		}
		return b;
	}
	
	public static void addUser(User a)
	{
		int count = 0;
		
		for(int i = 0; i<users.length; i++)
		{
			if(users[i] == null)
			{
				users[i] = a;
				count++;
				break;
			}
		}
		
		if(count != 0)
		{
			JOptionPane.showMessageDialog(null, "User added successully.");
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry. User can not be added.");
		}
	}
	
	public static User searchUser(User a)
	{
		User test = null;
		
		for (int i=0;i<users.length;i++)
		{
			if(users[i]!=null)
			{
				if(a.getUserName().equals(users[i].getUserName()))
				{
					test = users[i];
					break;
				}
		   }
		}
		return test;
	}

	public static void add(User a)
		{
			for(int i = 0; i<users.length; i++)
			{
				if(users[i] == null)
				{
					users[i] = a;
					break;
				}
			}
		}
}
