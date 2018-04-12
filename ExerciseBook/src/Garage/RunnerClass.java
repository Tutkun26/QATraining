package Garage;

public class RunnerClass {

	public static void main(String[] args) {
		Garage g = new Garage();
	
		
		Car porsche = new Car(30, "car", "Porsche");
		Motorcycle dukati = new Motorcycle(300, "motorcycle", 150);
		Lorry truck = new Lorry(3000, "lorry", 8);

		g.addVehicle(porsche);
		g.addVehicle(dukati);
		g.addVehicle(truck);
		
		g.printVehicleList();
		
		System.out.println(porsche.type + " = £" + g.calculateBill(porsche));
		System.out.println(dukati.type + " = £" + g.calculateBill(dukati));
		System.out.println(truck.type + " = £" + g.calculateBill(truck));
		
		g.removeVehiclebyID(truck.ID);
		g.removeVehiclebyType(dukati.type);
		g.printVehicleList();
	}

}
