package Library;

public class Map extends Item{

	public String mapType;
	
	public Map(int loanDuration, double shelfLocation, long uniqueNumber, String mapType) {
		super(loanDuration, shelfLocation, uniqueNumber);
		this.mapType = mapType;		
	}
	
	//change the page count of the Book object into the new, specified book page count
	public void updateItem(String newMapType) {
		this.mapType = newMapType;
	}
}
