package assignment9;
public class Location {
    private String city;
	private int longitude;
	private int latitude;
	
	public Location(String city, int longitude, int latitude) {
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public void inPutCity(String city) { 
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void inPutLogitude(int longitude) {
		this.longitude = longitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void inPutAltitude(int latitude) {
		this. latitude = latitude;
	}
	public double getLatitude() {
		return  latitude;
	}

}