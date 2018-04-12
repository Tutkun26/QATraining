package Garage;
import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	private static int carCost = 100;
	private static int lorryCost = 150;
	private static int motorcycleCost = 50;
	
	
	//generic method to add any specified vehicle object to arrayList
	public void addVehicle(Vehicle v) {
		System.out.println("adding vehicle: " + v.ID);
		vehicleList.add(v);
	}
	
	//generic method to remove any specified vehicle object from arrayList
	public void removeVehicle(Vehicle v) {
		System.out.println("removing vehicle: " + v.ID);
		vehicleList.remove(v);
	}
	
	//compare string passed to this method with the type of each object within arrayList and if there is a match, remove the object
	//iterate through entire arrayList until all objects of this type are removed
	public void removeVehiclebyType(String vehicleType) {
		for (int i = 0; i < vehicleList.size(); i++) {
			vehicleType = vehicleList.get(i).type;
			switch(vehicleType) {
				case "car":
					vehicleList.remove(i);
					System.out.println("removed vehicle of type: " + vehicleType + " from the garage.");
					break;
				case "lorry":
					vehicleList.remove(i);
					System.out.println("removed vehicle of type: " + vehicleType + " from the garage.");
					break;
				case "motorycycle":
					vehicleList.remove(i);
					System.out.println("removed vehicle of type: " + vehicleType + " from the garage.");
					break;
				default:
					System.out.println("There is no vehicle in the garage of that type.");
					break;
			}
		}
	}

	//compare string passed to this method with the ID of each object within arrayList and if there is a match, remove the object
	//iterate through entire arrayList until all objects with this ID are removed
	public void removeVehiclebyID(int vehicleID) {
		for (int i = 0; i < vehicleList.size(); i++) {
			if(vehicleID == vehicleList.get(i).ID) {
				vehicleList.remove(i);
				System.out.println("removed vehicle of ID: " + vehicleID + " from the garage.");
			}
		}
	}
	public int calculateBill(Vehicle v) {
		switch (v.type) {
			case "car":
				return carCost;
			case "motorcycle":
				return motorcycleCost;
			case "lorry":
				return lorryCost;
			default:
				return 0;
		}
	}
	
	
	public int altCalculateBill(Vehicle v) {
		for (int i = 0; i < vehicleList.size(); i++) {
			if(v.type == vehicleList.get(i).type) {
				switch (v.type) {
					case "car":
						return carCost*10;
					case "motorcycle":
						return motorcycleCost*5;
					case "lorry":
						return lorryCost*20;
					default:
						return 0;
				}
			}
		}
			return 0;
	}
	
	public void emptyGarage() {
		System.out.println("empting garage of all stored vehicles: ");
		vehicleList.clear();
	}
	
	public void printVehicleList() {
		for (int i = 0; i < vehicleList.size(); i++) {
			System.out.println(vehicleList.get(i) + " ");
		}
		System.out.println(vehicleList.size() + " vehicles in the garage.");
	}
	
}
