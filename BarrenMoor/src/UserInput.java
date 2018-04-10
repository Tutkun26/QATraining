import java.util.Scanner;

public class UserInput {
	public Scanner sc = new Scanner(System.in);

	public int movePlayer() {
		String direction = sc.nextLine();
		boolean expectingInput = true;
		int northSouthVector = 0;
		int eastWestVector = 0;

		while(expectingInput) {
			switch(direction) {
				case "n": case "north":
					return northSouthVector = -1;
					//break;
				case "s": case "south": case "down":
					return northSouthVector = 1;
					//break;
				case "w": case "west": case "left":
					return eastWestVector = -1;
					//break;
				case "e": case "east": case "right":
					return eastWestVector = 1;
				//	break;
				default:
					return 0;
			}
		}
		return northSouthVector; return eastWestVector;
	}

	//if user inputs look, print out a set of statements
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
	//if user inputs compass, return the result of the magicCompass method from Player object
	public void compass(float distance) {
		String compass = sc.nextLine();
			if (compass.equals("compass")) {
				System.out.println(distance + "m");
				//want to use method magicCompass from Player object instead of "using compass"
			}
 	}
}
