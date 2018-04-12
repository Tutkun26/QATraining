package Garage;

public abstract class Vehicle {
	
	public int ID;
	public String type;

	public Vehicle(int ID, String type) {
		
		this.ID = ID;
		this.type = type;
		
	}
	
	public String toString() {

		return this.getClass().getSimpleName();
		
		
	}
}
