
public class Grid {
	
	public static int swamp[][]= new int[10][10];
	
	public Grid() {
		System.out.println("The adventure of Barren Moor");
		System.out.println("You awaken yourself in a barren moor. Try typing look");
		printGrid();	
	}

	public void placePlayer() {
		int startColumn = swamp.length/2;
		int startRow = swamp[startColumn].length/2;
		swamp[startColumn][startRow] = ;
	}
	
	public void printGrid() {
		
		//columns
		for(int i = 0; i < swamp.length; i++) {
			System.out.print(swamp[i][1]);
			//rows
			for(int j = 0; j < swamp.length; j++) {
				System.out.print(swamp[i][j]);
			}
			System.out.println();
		}
	}
}
