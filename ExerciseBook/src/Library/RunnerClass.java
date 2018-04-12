package Library;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library manchesterCentralLibrary = new Library();
		Member georgeOrwell = new Member("George", "Orwell", 1112838044);
		Book crimeAndPunishment = new Book(14, 314.7, 33333333, 416);
		Map firstMapofUSA = new Map(2, 898.0, 11111111, "topographic map");
		Thesis SarahConnorThesis = new Thesis (30, 456.12, 22222222, "University of Manchester");
		
		manchesterCentralLibrary.registerPerson(georgeOrwell);
		manchesterCentralLibrary.addItem(crimeAndPunishment);
		manchesterCentralLibrary.addItem(firstMapofUSA);
		manchesterCentralLibrary.addItem(SarahConnorThesis);
		
		crimeAndPunishment.updateItem(420);
		firstMapofUSA.updateItem("geographic map");
		SarahConnorThesis.updateItem("University of Salford");
		System.out.println(crimeAndPunishment.pageCount + " " + firstMapofUSA.mapType + " " + SarahConnorThesis.universityName);
		
		georgeOrwell.checkOutItem(manchesterCentralLibrary, crimeAndPunishment);
		georgeOrwell.checkOutItem(manchesterCentralLibrary, firstMapofUSA);
		georgeOrwell.checkInItem(manchesterCentralLibrary, crimeAndPunishment);
		georgeOrwell.printCurrentLoans();
	}

}
