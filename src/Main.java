import java.util.ArrayList;

public class Main {
	static ArrayList<Person> People = new ArrayList<>();
	
	public static void main(String[] args) {
		Person steve = new Person();
		steve.age = 22; steve.jobTitle = "Programmer"; steve.name = "Steve";
		Person lucy = new Person();
		lucy.age = 40; lucy.jobTitle = "Data Analyst"; lucy.name = "Lucy";
		Person mehmet = new Person();
		mehmet.age = 50; mehmet.jobTitle = "Cloud Engineer"; mehmet.name = "Mehmet";
		
		People.add(steve); People.add(lucy); People.add(mehmet);
		
		for (Person i: People) {
			i.returnDetails();
		}
		
		
	//	steve.returnDetails();
	//	mehmet.returnDetails();
	//	lucy.returnDetails();
	}
}
