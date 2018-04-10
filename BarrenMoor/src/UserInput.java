import java.util.Scanner;

public class UserInput {
	public Scanner sc = new Scanner(System.in);
	public int northSouthVector = 0;
	public int eastWestVector = 0;

	public int movePlayer() {
		String direction = sc.nextLine();
		boolean expectingInput = true;

		while(expectingInput) {
			switch(direction):
				case "n": case "north":
					return northSouthVector = -1;
					break;
				case "s": case "south": case "down":
					return northSouthVector = 1;
					break;
				case "w": case "west": case "left": r
					return eastWestVector = -1;
					break;
				case "e": case "east": case "right":
					return eastWestVector = 1;
					break;
				default:
					return 0;
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
	public void compass() {
		String compass = sc.nextLine() {
			if (compass.equals("compass")) {
				System.out.println(magicCompass() + "m");
			}
 		}
	}
}
