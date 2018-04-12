package Library;

public class Book extends Item{
	
	public int pageCount;
	
	public Book(int loanDuration, double shelfLocation, long uniqueNumber, int pageCount) {
		
		super(loanDuration, shelfLocation, uniqueNumber);
		this.pageCount = pageCount;		
	}
	
	//change the page count of the Book object into the new, specified book page count
	public void updateItem(int newPageCount) {
		this.pageCount = newPageCount;
	}
}
