
public class InfiniteGreySwamp {

	//test for 1d array
	private int myArray[] = {1,2,3,4,5};
	
	//create 2d array
	private int[][] populatedSwamp = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	private int swamp[][]= new int[10][10];
	
	public int startPosition() {
		int middleColumn = populatedSwamp.length / 2;
		int middleRow = populatedSwamp[middleColumn].length /2;
		return populatedSwamp[middleColumn][middleRow];
	}
	
	public int updatedPosition() {
		return populatedSwamp[2][2];
	}
	
	
	
	
	
	
	
	
	public void printSwamp() {
		
		//column
		for(int col = 0; col < populatedSwamp.length; col++) {
			//rows
			for (int row = 0; row < populatedSwamp[col].length; row++) {
				System.out.println(populatedSwamp[col][row]);
			}
			System.out.println();
		}
	}
}
