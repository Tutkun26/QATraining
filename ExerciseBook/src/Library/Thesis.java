
package Library;

public class Thesis extends Item{

	public String universityName;
	
	public Thesis(int loanDuration, double shelfLocation, long uniqueNumber, String universityName) {
		super(loanDuration, shelfLocation, uniqueNumber);
		this.universityName = universityName;	
	}
	
	//change the page count of the Book object into the new, specified book page count
	public void updateItem(String newUniversity) {
		this.universityName = newUniversity;
	}
}
