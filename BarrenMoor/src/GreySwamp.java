
public class GreySwamp {

	private int treasure = 666;
	public int treasureColumn;
	public int treasureRow;

	public void setTreasurePosition() {
		//adds treasure value (666) into the top right corner of the grid
		treasureColumn = swamp.length;
		treasureRow = swamp.length;
		swamp[treasureColumn][treasureRow] = treasure;
	}

	public void checkForTreasure() {
		if (valueAtNewPosition() = treasure) {
			System.out.println("you see a box sitting on the plain. Its filled with Treasure! You win! The end.");
			sc.close();
			System.exit(0);
		}
	}
	public GreySwamp() {
		System.out.println("The adventure of Barren Moor");
		System.out.println();
		System.out.println("You awaken yourself in a barren moor. Try typing look");
		}
	}
}
