import java.util.Scanner;
public class Player {

	Scanner sc = new Scanner(System.in);
	public int playerIcon = 1;
	public int currentColumn;
	public int currentRow;


	//calculates distance between player and treasure using pythagoras' theorem
	public float magicCompass() {
		int verticalDistance = (4 - currentColumn);
		int horizontalDistance = (4 - currentRow);
		float hypotenuseSquared = (float) (verticalDistance*verticalDistance) + (horizontalDistance*horizontalDistance);
		float hypotenuse = (float)Math.sqrt(hypotenuseSquared);
		return hypotenuse;
	}

	public void startPosition(int[][] greySwamp) {
	}

	public void updateStartPosition(int upDown, int leftRight, int xAxis, int yAxis) {
		currentColumn = xAxis+ upDown;
		currentRow = yAxis + leftRight;
	}

	public int updatePosition(int vector) {
		currentColumn = currentColumn + movePlayer().northSouthVector;
		currentRow = currentRow + movePlayer().eastWestVector;
		return swamp[currentColumn][currentRow];
	}
}
