package keyword;

public class Address {
	private int addId;
	private String streetName;
	private String cityName;
	private int zip;
	
	public Address() {
		
	}

	public Address(int addId, String streetName, String cityName, int zip) {
		super();
		this.addId = addId;
		this.streetName = streetName;
		this.cityName = cityName;
		this.zip = zip;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address [addressId=" +addId+", streetName= " +streetName+ " cityName, = "+ cityName + " zip = "+ zip + " ]";
	}
	
	
	
	
	
	
	
	
}
