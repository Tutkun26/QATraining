
public class Exercise {
	
	int[] newArray = new int[10];
	
	public int parameters(int a, int b, boolean t) {
		int c = a+b;
		int d = a*b;
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		if(t) {
			return c;
		}
		else {
			return d;
		}
	}
	
	
	public void iteration() {
		for (int i = 0; i < 10; i++) {
			System.out.println(parameters(i, 7, true));
		}
	}
	
	public void createArray() {
		int myArray[] = {1,2,3,4,5,6,7,8,9,10};
			for(int i: myArray) {
				parameters(i, 2, true);
				System.out.println(i);		
			}
	}
	public void populateArray() {
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i] = i);
			System.out.println(newArray[i] = (i*10));
		}
	}
}
