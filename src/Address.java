class Address {
	private int streetNum;
	private String streetName;
	private String city;
	private String zip;
	private String state;
	
	/**
	 * This is the constructor of Address class
	 * @param streetNum the street number to set
	 * @param streetName the street name to set
	 * @param city the city name to set
	 * @param zip the zip code to set
	 * @param state the state to set
	 */
	public Address(int streetNum, String streetName, String city, String zip, String state) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	
	/**
	 * @return the street number
	 */
	public int getStreetNum() {
		return streetNum;
	}
	
	/**
	 * @param streetNum the street number to set
	 */
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	
	/**
	 * @return the street name
	 */
	public String getStreetName() {
		return streetName;
	}
	
	/**
	 * @param streetName the street name to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	
	/**
	 * @param zip the zip code to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * @return all the address attributes in a string 
	 */
	public String toString() {
		return streetNum + " " + streetName + " " + city + " " + zip + " " + state;
	}
}
