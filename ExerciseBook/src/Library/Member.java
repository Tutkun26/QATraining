package Library;

import java.util.ArrayList;

public class Member {

	private static long ID;
	public String firstName;
	public String surname;
	ArrayList<Item> currentLoans = new ArrayList<Item>();
	
	
	public Member(String firstName, String surname, long ID) {
		this.firstName = firstName;
		this.surname = surname;
		this.ID = ID;
	}
	
	//add item from catalogue List to currentLoans list
	//remove this item from catalogue list
	public void checkOutItem(Library manchesterCentral, Item i) {	
		currentLoans.add(i);
		manchesterCentral.catalogue.remove(i);
	}
	
	//remove item from currentLoans List to catalogue list
	//remove this item from currentLoans list
	public void checkInItem(Library manchesterCentral, Item i) {
		manchesterCentral.catalogue.add(i);
		currentLoans.remove(i);
	}
	//instead of memory location when Member objects are called, return first name and surname
	public String toString() {
		return firstName + " " + surname;
	}
	
	//prints all books a member currently has on loan
	public void printCurrentLoans() {
		for (int i = 0; i < currentLoans.size(); i++) {
			System.out.println(currentLoans.get(i).uniqueNumber);
		}
	}
}
