import java.util.Scanner;

public class UserInput {
	private Scanner sc = new Scanner(System.in);
	
	
	public void moveInput() {
		String direction = sc.nextLine(); 
		boolean expectingInput = true;
		
		while(expectingInput) {
			if (direction.equals("north")) {
				System.out.println("moving north");
				direction = sc.nextLine();
			}
			else if (direction.equals("south")) {
				System.out.println("moving south");
				direction = sc.nextLine();
			}
			else if (direction.equals("east")) {
				System.out.println("moving east");
				direction = sc.nextLine();
			}
			else if (direction.equals("west")) {
				System.out.println("moving west");
				direction = sc.nextLine();
			}
			else {};
		}
	}
	public void look() {
		String look = sc.nextLine();
		if (look.equals("look")) {
			System.out.println("Grey foggy clouds float oppressively close to you,");
			System.out.println("reflected in the murky grey water which reaches up your shins.");
			System.out.println("Some black plants barely poke out of the shallow water.");
			System.out.println("try north, south, east or west");
			System.out.println("You notice a small watch-like device in your left hand.");
			System.out.println("It has hands like a watch but the hands don't seem to tell time.");
			System.out.println("The dial reads" + " distance " + "Xmiles");
		}
	}
}
