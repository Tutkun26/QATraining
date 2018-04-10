
public class Treasure {
	//this value for treasure is just a unique placeholder for the object treasure that will be stored in the 2d int array (grid)
	private int treasure = 9;
	//positioned in the top right corner of the grid
	public int treasureColumn = 4;
	public int treasureRow = 4;
	
	
	public int setTreasurePosition() {
		//adds treasure value (666) into the top right corner of the grid
		swamp[treasureColumn][treasureRow] = treasure;
		return treasureColumn;
		return treasureRow;
	}
}
