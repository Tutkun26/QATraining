
public class Main{

	public static void main(String[] args) {

		Player one = new Player();
			one.updateStartPosition()
			
		UserInput input = new UserInput();
			input.compass(one.magicCompass());
		Grid barrenMoor = new Grid();
		while(swamp[one.currentColumn][one.currentRow].equals("666")) {
			input.movePlayer();
		}
	}
}
