import java.util.Scanner;
public class Player {

	Scanner sc = new Scanner(System.in);
	public int playerIcon = 666;
	public int startColumn = swamp.length/2;
	public int startRow = swamp[startColumn]/2;
	public int currentColumn;
	public int currentRow;


	public float magicCompass() {
		int verticalDistance = (treasureColumn - currentColumn);
		int horizontalDistance (treasureRow - currentRow);
		float hypotenuseSquared = (float) (verticalDistance*verticalDistance) + (horizontalDistance*horizontalDistance);
		return float hyptoenuse = (float)sqrt(hypotenuseSquared);
	}

	public int startPosition() {
		return swamp[startColumn][startRow];
	}

	public void updateStartPosition(movePlayer()) {
		currentColumn = startColumn + northSouthVector;
		currentRow = startRow + eastWestVector;
	}

	public int updatePosition(int vector) {
		currentColumn = currentColumn + movePlayer().northSouthVector;
		currentRow = currentRow + movePlayer().eastWestVector;
		return swamp[currentColumn][currentRow];
	}
}
