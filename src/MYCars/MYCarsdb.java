package MYCars;


import java.util.ArrayList;

public class MYCarsdb {
	 static ArrayList<MYCars> cars=new ArrayList<MYCars>();
					
	public MYCarsdb(){
		cars.add(new MYCars("I20","1","That is a Hyundai car",5000,4000));
		cars.add(new MYCars("Fortuner","2","That is a  Toyota's car",5000,4000));
		cars.add(new MYCars("Micra","3","That is a  Nissan's car",5000,4000));		
	}	
	
	public void addCar(MYCars temp){
		cars.add(temp);
	}
	public ArrayList<MYCars> getAll() {
	    return cars;
	}
	public void removeCar(MYCars temp){
		cars.remove(temp);
	}
}
