
public class RunnerClass{

	public static void main(String[] args) {

		//create empty grid for the swamp
		public int swamp[][]= new int[10][10];

		GreySwamp swamp = new GreySwamp();
		Player one = new Player();
		UserInput input = new UserInput();

		while(swamp[one.currentColumn][one.currentRow].equals("666")) {
			input.movePlayer();
		}
	}

}
