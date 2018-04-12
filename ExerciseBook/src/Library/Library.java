package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	ArrayList<Item> catalogue = new ArrayList<Item>();
	ArrayList<Member> memberList = new ArrayList<Member>();
	Scanner sc = new Scanner(System.in);

	//add member to list of members stored by the library
	public void registerPerson(Member m) {
		memberList.add(m);
	}
	
	//remove member from list of members stored by the library
	public void deletePerson(Member m) {
		memberList.remove(m);
	}

	//input requested from user to enter new first name and last name and both are updated
	public void updatePerson(Member m) {
		//use scanner to wait for new entries of first name or surname;
		System.out.println("Please enter new firstName");
		m.firstName = sc.nextLine();
		System.out.println("Please enter new firstName");
		m.surname = sc.nextLine();
		
	}
	//add an item to the list of items currently stored by the library, does not include those on loan
	public void addItem(Item i) {
		catalogue.add(i);
	}
	//remove an item from the list of items currently stored by the library, does not include those on loan
	public void deleteItem(Item i) {
		catalogue.remove(i);	
	}
	//change the following details of the item: the loan duration and the shelf location. should be updated to be entered via input 
	public void updateItem(Item i) {
		System.out.println("Please enter new loanDuration");
		i.loanDuration = i.loanDuration*2;
		System.out.println("Please enter new shelfLocation");
		i.shelfLocation = i.shelfLocation+10;
	}
	//output entire list of items currently held by the library
	public void printCatalogue() {
		for (int i = 0; i < catalogue.size(); i++) {
			System.out.println(catalogue.get(i));
		}
	}
	//output list of members signed up to the library
	public void printMemberList() {
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}
}
