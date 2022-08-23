package Classes;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Front implements ActionListener
{
	JFrame f;
	
	JLabel l1;
	
	ImageIcon i1,i2,i3;
	
	ImageIcon icm1,icm2,icm3,icm4,icm5,icm6,icm7,icm8,icm9,icm10,icm11,icm12,icm13,icm14,icm15,icm16,icm17,icm18,icm19,icm20,icm21,icm22,icm23,icm24,icm25,icm26,icm27,icm28,icm29,icm30,icm31,icm32,icm33,icm34,icm35,icm36,icm37,icm38,icm39,icm40,icm41,icm42,icm43,icm44,icm45,icm46,icm47,icm48,icm49,icm50,icm51,icm52;
	ImageIcon lambo,ferrari,aston,audi,bentley,mercedes,bmw,bugatti,royce,ford,mitsu,nissan,porsche,tesla,koe;
	
	JButton b1,b2,b3;
	
	User u;
	
	ArrayList<Car> cars;
	
	public Front()
	{
		cars = new ArrayList<Car>();
		
		lambo = new ImageIcon("Images/lambo.png"); 
		ferrari = new ImageIcon("Images/ferrari crop.png"); 
		aston = new ImageIcon("Images/aston martin.png"); 
		audi = new ImageIcon("Images/audi.png"); 
		bentley = new ImageIcon("Images/bentley.png"); 
		mercedes = new ImageIcon("Images/mercedes.png"); 
		bmw = new ImageIcon("Images/bmw crop.png"); 
		bugatti = new ImageIcon("Images/bugatti.png"); 
		royce = new ImageIcon("Images/rolls royce.png"); 
		ford = new ImageIcon("Images/ford.png"); 
		mitsu = new ImageIcon("Images/mitsubishi.png"); 
		nissan = new ImageIcon("Images/nissan.png"); 
		porsche = new ImageIcon("Images/porche.png"); 
		tesla = new ImageIcon("Images/tesla.png"); 
		koe = new ImageIcon("Images/koenigsegg.png"); 
		
		
		icm1 = new ImageIcon("Images/aventador.png"); 
		icm2 = new ImageIcon("Images/sesto elemento.png"); 
		icm3 = new ImageIcon("Images/murchi.png");
		icm4 = new ImageIcon("Images/laferrari.png");
		icm5 = new ImageIcon("Images/enzo.png");
		icm6 = new ImageIcon("Images/812.png");
		icm7 = new ImageIcon("Images/monza.png");
		icm8 = new ImageIcon("Images/slr.png");
		icm9 = new ImageIcon("Images/amg.png");
		icm10 = new ImageIcon("Images/r8.png");
		icm11 = new ImageIcon("Images/rs5.png");
		icm12 = new ImageIcon("Images/etron.png");
		icm13 = new ImageIcon("Images/a7.png");
		icm14 = new ImageIcon("Images/db9.png");
		icm15 = new ImageIcon("Images/db11.png");
		icm16 = new ImageIcon("Images/valhalla.png");
		icm17 = new ImageIcon("Images/vantage.png");
		icm18 = new ImageIcon("Images/bentaya.png");
		icm19 = new ImageIcon("Images/continental.png");
		icm20 = new ImageIcon("Images/flyingspur.png");
		icm21 = new ImageIcon("Images/bmw3.png");
		icm22 = new ImageIcon("Images/bmw5.png");
		icm23 = new ImageIcon("Images/m8.png");
		icm24 = new ImageIcon("Images/m3gtr.png");
		icm25 = new ImageIcon("Images/i4.png");
		icm26 = new ImageIcon("Images/i8.png");
		icm27 = new ImageIcon("Images/veyron16.png");
		icm28 = new ImageIcon("Images/veyronsuper.png");
		icm29 = new ImageIcon("Images/chiron.png");
		icm30 = new ImageIcon("Images/spectre.png");
		icm31 = new ImageIcon("Images/phantom.png");
		icm32 = new ImageIcon("Images/ghost.png");
		icm33 = new ImageIcon("Images/mache.png");
		icm34 = new ImageIcon("Images/lightning.png");
		icm35 = new ImageIcon("Images/escape.png");
		icm36 = new ImageIcon("Images/gt.png");
		icm37 = new ImageIcon("Images/raptor.png");
		icm38 = new ImageIcon("Images/outlander.png");
		icm39 = new ImageIcon("Images/eclipse.png");
		icm40 = new ImageIcon("Images/evo.png");
		icm41 = new ImageIcon("Images/skyline.png");
		icm42 = new ImageIcon("Images/gtr.png");
		icm43 = new ImageIcon("Images/leaf.png");
		icm44 = new ImageIcon("Images/ceyanne.png");
		icm45 = new ImageIcon("Images/918.png");
		icm46 = new ImageIcon("Images/cerrara.png");
		icm47 = new ImageIcon("Images/911.png");
		icm48 = new ImageIcon("Images/roadster.png");
		icm49 = new ImageIcon("Images/teslas.png");
		icm50 = new ImageIcon("Images/tesla3.png");
		icm51 = new ImageIcon("Images/agerar.png");
		icm52 = new ImageIcon("Images/one.png");
		
		CarModel cm1 = new FuelCarModel("Aventador",20, 500000,"Fuel",icm1,217,16,"V12",769);
		CarModel cm2 = new FuelCarModel("Sesto Elemento",10, 2200000,"Fuel",icm2,221,12,"V10",562);
		CarModel cm3 = new FuelCarModel("Murchielego",15, 240000,"Fuel",icm3,214,3.8,"V12",670);
		
		Car c = new Car("Lamborghini",lambo);
		c.addModel(cm1);
		c.addModel(cm2);
		c.addModel(cm3);
		
		CarModel cm4 = new HybridCarModel("LaFerrari",20, 1000000,"Hybrid",icm4,218,3,"V12",950,"KERS",708000);
		CarModel cm5 = new HybridCarModel("Enzo",10, 1100000,"Hybrid",icm5,218,9,"V12",651,"Tipo",485000);
		CarModel cm6 = new HybridCarModel("812 Competizion",15, 672000,"Fuel",icm6,211,3.5,"V12",789,"GA",588000);
		CarModel cm7 = new FuelCarModel("Monza SP2",5, 1800000,"Fuel",icm7,186,7.25,"V12",809);
		
		Car c1 = new Car("Ferrari",ferrari);
		c1.addModel(cm4);
		c1.addModel(cm5);
		c1.addModel(cm6);
		c1.addModel(cm7);
		
		CarModel cm8 = new FuelCarModel("SLR McLaren",10, 350000,"Fuel",icm8,207,3,"V8",617);
		CarModel cm9 = new FuelCarModel("AMG GT",10, 120000,"Fuel",icm9,202,12.65,"V8",416);
		
		Car c2 = new Car("Mercedes",mercedes);
		c2.addModel(cm8);
		c2.addModel(cm9);
		
		CarModel cm10 = new FuelCarModel("R8 2022", 20, 146000, "Fuel",icm10,200,6.71,"V10",602);
		CarModel cm11 = new HybridCarModel("RS5", 30, 75000, "Fuel",icm11,155,10.8,"V6",444,"-Not Available-",331000);
		CarModel cm12 = new ElectricCarModel("e-tron GT",15,100000,"Electric",icm12,152,205,"AC",475000);
		CarModel cm13 = new HybridCarModel("A7 TFSI",10,77000,"Hybrid",icm13,155,41.13,"V6",335,"-Not Available-",270000);
		
		Car c3 = new Car("Audi",audi);
		c3.addModel(cm10);
		c3.addModel(cm11);
		c3.addModel(cm12);
		c3.addModel(cm13);
		
		CarModel cm14 = new FuelCarModel("DB9 Coupe", 25,230000,"Fuel",icm14,186,9.8,"V12",540);
		CarModel cm15 = new FuelCarModel("DB11", 30,205000,"Fuel",icm15,192,8.9,"V12",528);
		CarModel cm16 = new HybridCarModel("Valhalla",10,1800000,"Hybrid",icm16,217,312,"V8",937,"-Not Available-",735000);
		CarModel cm17 = new FuelCarModel("Vantage",5,168000,"Fuel",icm17,170,8.6,"V8",528);
		
		Car c4 = new Car("Aston Martin",aston);
		c4.addModel(cm14);
		c4.addModel(cm15);
		c4.addModel(cm16);
		c4.addModel(cm17);
		
		CarModel cm18 = new HybridCarModel("Bentayga",40,334000,"Hybrid",icm18,190,7.6,"V8",126,"PHEV",94000);
		CarModel cm19 = new FuelCarModel("Continental GT",30,202000,"Fuel",icm19,208,8.5,"W12",650);
		CarModel cm20 = new FuelCarModel("Flying Spur",40,208000,"Fuel",icm20,198,6.38,"V8",542);
		
		Car c5 = new Car("Bentley",bentley);
		c5.addModel(cm18);
		c5.addModel(cm19);
		c5.addModel(cm20);
		
		CarModel cm21 = new FuelCarModel("Series 3",50,42000,"Fuel",icm21,155,16.67,"S50",382);
		CarModel cm22 = new FuelCarModel("Series 7",40,86000,"Fuel",icm22,158,15,"N52",335);
		CarModel cm23 = new FuelCarModel("M8",45,130000,"Fuel",icm23,190,6.5,"V8",617);
		CarModel cm24 = new FuelCarModel("M3 GTR",1,74000,"Fuel",icm24,178,10.80,"P60B40",444);
		CarModel cm25 = new ElectricCarModel("i4",20,55000,"Electric",icm25,124,245,"-Not Available-",400000);
		CarModel cm26 = new HybridCarModel("i8",15,147000,"Hybrid",icm26,155,47.45,"I3 Turbo B31K",369,"I15",98000);
		
		Car c6 = new Car("BMW",bmw);
		c6.addModel(cm21);
		c6.addModel(cm22);
		c6.addModel(cm23);
		c6.addModel(cm24);
		c6.addModel(cm25);
		c6.addModel(cm26);
		
		CarModel cm27 = new FuelCarModel("Veyron 16.4",10,1700000,"Fuel",icm27,268,4,"W16",987);
		CarModel cm28 = new FuelCarModel("Veyron Super Sport",15,2400000,"Fuel",icm28,268,4,"W16",1184);
		CarModel cm29 = new FuelCarModel("Chiron ",10,3000000,"Fuel",icm29,304.7,5.95,"W16",1500);
		
		Car c7 = new Car("Bugatti",bugatti);
		c7.addModel(cm27);
		c7.addModel(cm28);
		c7.addModel(cm29);
		
		CarModel cm30 = new ElectricCarModel("Spectre",10,600000,"Electric",icm30,170,380,"-Not Available-",102000);
		CarModel cm31 = new FuelCarModel("Phantom II",15,460000,"Fuel",icm31,155,7.1,"V12",563);
		CarModel cm32 = new FuelCarModel("Ghost",20,311000,"Fuel",icm32,155.3,8.4,"V-12",592);
		
		Car c8 = new Car("Rolls Royce",royce);
		c8.addModel(cm30);
		c8.addModel(cm31);
		c8.addModel(cm32);
		
		CarModel cm33 = new ElectricCarModel("Mustang Mach-E",30,51000,"Electric",icm33,124,272,"-Not Available-",367000);
		CarModel cm34 = new ElectricCarModel("F-150 Lightning",35,40000,"Electric",icm34,111.8,230,"-Not Available-",433000);
		CarModel cm35 = new HybridCarModel("2022 Escape",40,25500,"Hybrid",icm35,85,12,"Zetec",180,"EcoBoost",183000);
		CarModel cm36 = new FuelCarModel("GT",20,500000,"Fuel",icm36,216,3,"EcoBoost V6",660);
		CarModel cm37 = new FuelCarModel("Raptor",15,109000,"Fuel",icm37,112,3.5,"V8",700);
		
		Car c9 = new Car("Ford",ford);
		c9.addModel(cm33);
		c9.addModel(cm34);
		c9.addModel(cm35);
		c9.addModel(cm36);
		c9.addModel(cm37);
		
		CarModel cm38 = new HybridCarModel("Outlander PHEV",40,36000,"Hybrid",icm38,108,24,"MIVEC",190,"-Not Available-",67000);
		CarModel cm39 = new FuelCarModel("Eclipse",30,25700,"Fuel",icm39,146,5.2,"4G64",143);
		CarModel cm40 = new FuelCarModel("Lancer Evolution",45,27000,"Fuel",icm40,155,14.8,"SOHC 4G13",148);
		
		Car c10 = new Car("Mitsubishi",mitsu);
		c10.addModel(cm38);
		c10.addModel(cm39);
		c10.addModel(cm40);
		
		CarModel cm41 = new FuelCarModel("R34 Skyline GTR",30,115000,"Fuel",icm41,165,6.25,"RB26DETT I6",276);
		CarModel cm42 = new FuelCarModel("GT-R",35,113000,"Fuel",icm42,205,9,"VR38DETT",565);
		CarModel cm43 = new ElectricCarModel("LEAF",45,27000,"Electric",icm43,89.4,255,"EM57 Motor",40000);
		
		Car c11 = new Car("Nissan",nissan);
		c11.addModel(cm41);
		c11.addModel(cm42);
		c11.addModel(cm43);
		
		CarModel cm44 = new HybridCarModel("Cayenne Turbo",30,182000,"Hybrid",icm44,152,8.75,"V6",296,"-Not Available-",221000);
		CarModel cm45 = new HybridCarModel("918 Spyder",15,850000,"Hybrid",icm45,214,4.8,"MR6 V8",599,"Mr6 Electric",652000);
		CarModel cm46 = new FuelCarModel("Carerra GT",45,1200000,"Fuel",icm46,208,2,"DOHC V10",603);
		CarModel cm47 = new FuelCarModel("911 Turbo",40,187000,"Fuel",icm47,198,3.7,"-Not Available-",640);
		
		Car c12 = new Car("Porsche",porsche);
		c12.addModel(cm44);
		c12.addModel(cm45);
		c12.addModel(cm46);
		c12.addModel(cm47);
		
		CarModel cm48 = new ElectricCarModel("Roadster",10,250000,"Electric",icm48,250,620,"AC Induction Motor",185000);
		CarModel cm49 = new ElectricCarModel("Model S",20,94000,"Electric",icm49,216,405,"AC Induction Motor",615000);
		CarModel cm50 = new ElectricCarModel("Model 3",25,55000,"Electric",icm50,145,353,"IPM-SynRM",340000);
		
		Car c13 = new Car("Tesla",tesla);
		c13.addModel(cm48);
		c13.addModel(cm49);
		c13.addModel(cm50);
		
		CarModel c51 = new FuelCarModel("Agera R",15,1500000,"Fuel",icm51,260,8,"V8",1160);
		CarModel c52 = new FuelCarModel("One",10,2800000,"Fuel",icm52,277.8,8,"V8",1360);
		
		Car c14 = new Car("Koenigsegg",koe);
		c14.addModel(c51);
		c14.addModel(c52);
		
		cars.add(c);
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		cars.add(c7);
		cars.add(c8);
		cars.add(c9);
		cars.add(c10);
		cars.add(c11);
		cars.add(c12);
		cars.add(c13);
		cars.add(c14);
		
		f = new JFrame("Welcome to RRAM Car Dealers");
		
		i1 = new ImageIcon("Images/rram wow.png");
		i2 = new ImageIcon("Images/button_enter 1.png");
		i3 = new ImageIcon("Images/icon circle.png");
		
		l1 = new JLabel(i1);
		l1.setBounds(27, 0, 655, 381);
		
		b1 = new JButton("Enter");
		b1.setBounds(250,340,184,82);
		b1.setBackground(new Color (31, 29, 29));
		b1.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
		b1.setForeground(new Color(214, 21, 63));
		b1.addActionListener(this);
		
		b2 = new JButton("Exit");
		b2.setBounds(250,430,184,82);
		b2.setBackground(new Color (31, 29, 29));
		b2.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
		b2.setForeground(new Color(214, 21, 63));
		b2.addActionListener(this);
		
		f.add(l1);
		f.add(b1);
		f.add(b2);
		
		f.setLayout(null);
		f.getContentPane().setBackground(new Color(48, 47, 47));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setIconImage(i3.getImage());
		f.setResizable(false);
		f.setResizable(false);
		f.setSize(700,600);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
	}
	

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			User u = new User("Rafin Abrar", "rono", "1","Admin", "BRAC", "1001", "1", 100000000);
			User u1 = new User("Meraz Sish", "meraz", "1","Admin", "Dhaka Bank", "1002", "1", 100000000);
			User u2 = new User("Resadus Salehin", "rafsan", "1","Admin", "DBC", "1003", "1", 100000000);
			User u3 = new User("Bhowal", "apurba", "1","Admin", "Sonali Bank", "1004", "1", 100000000);
			
			new Login(cars);
			Login.add(u);
			Login.add(u1);
			Login.add(u2);
			Login.add(u3);
		
			f.setVisible(false);
		}
		
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
	}
}
