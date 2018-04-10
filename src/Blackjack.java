
public class Blackjack {

	public int closerTo21(int firstNumber, int secondNumber) {
	
		if (firstNumber > 21 && secondNumber <= 21) return secondNumber;
		if (secondNumber > 21 && firstNumber <= 21) return firstNumber;
		if (firstNumber > 21 && secondNumber > 21) return 0;
		
		if (Math.abs(firstNumber - 21) > Math.abs(secondNumber - 21)) {
			return secondNumber;
		}
		if (Math.abs(firstNumber - 21) < Math.abs(secondNumber - 21)) {
			return firstNumber;
		}
		
		return secondNumber;
		
	}
	public int uniqueSum(int num1, int num2, int num3) {
		if (num1 == num2 && num2 == num3) {
			return 0;
		}
		if (num1 == num2) {
			return num3;
		}
		if (num1 == num3) {
			return num2;
		}
		if (num2 == num3) {
			return num1;
		}
		else {
			return num1+num2+num3;
		}
	}
	public boolean tooHot(int temperature, boolean isSummer) {
		if (isSummer && temperature >= 60 && temperature <= 100) {
			return true;
		}
		else if( temperature >= 60 && temperature <= 90) {
			return true;
		}
		else {
			return false;
		}
	}
}
