package MYCars;

import java.util.ArrayList;

public class Accessoriesdb {
	private ArrayList<Accessories> acc=new ArrayList<Accessories>();
	public Accessoriesdb(){
		acc.add(new Accessories("1","Spoiler","Spoiler for your car of light weight carbon fiber. And yes, it comes in black","Mahindra",10000,10));
		acc.add(new Accessories("2","Tyre","Tyre for your car with good grip even on gradient road and wet surfaces. And yes, it will be definitely come in black only. And a question for you, why it generaly comes in black only? ","Apollo",5000,5));
		acc.add(new Accessories("3","Anti-Braking System","ABS for your car for your safe journey!!! ","WEX Ford",8000,2));
		
	}
	public ArrayList<Accessories> getAll() {
	    return acc;
	}
}
