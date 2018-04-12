package Garage;

public class Lorry extends Vehicle {
	
	int wheelCount;
	
	public Lorry(int ID, String type, int wheelCount) {

		super(ID, type);
		this.wheelCount = wheelCount;

	}
}
