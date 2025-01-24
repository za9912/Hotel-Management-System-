package Pj;
import java.util.List;
import java.util.ArrayList;

public class Organisme {
	private String region;
	private List<Hotel> hotels;
	public Organisme(String region, List<Hotel> hotels) {
		super();
		this.region = region;
		this.hotels = new ArrayList<>();
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public List<Hotel> getHotels() {
		return hotels;
	}
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	public void ajouterHotel(Hotel h) {
	    
 	   hotels.add(h);
	
	}
}
