package Library;

public abstract class Item {
	
	public int loanDuration;
	public double shelfLocation;
	public long uniqueNumber;
	
	public Item(int loanDuration, double shelfLocation, long uniqueNumber) {
		
		this.loanDuration = loanDuration;
		this.shelfLocation = shelfLocation;
		this.uniqueNumber = uniqueNumber;
	}
	
	//when a subclass of the Item class is instantiated and requested, name of the class is returned
	public String toString() {

		return this.getClass().getSimpleName();
		
		
	}
}
