abstract class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private Address address;
	
	/**
	 * This is the default constructor of Person class
	 */
	public Person() {
		
	}
	
	/**
	 * This is a constructor of Person class
	 * @param firstName first name of the person
	 * @param lastName last name of the person
	 * @param age age of the person
	 * @param ssn social security number of the person
	 * @param address address of the person
	 */
	public Person(String firstName, String lastName, int age, String ssn, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.address = address;
	}
	
	/**
	 * @return the first name of a person
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the first name of a person to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the last name of a person
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the last name of a person to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age of a person
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age of a person to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the social security number of a person
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the social security number to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the address of a person
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address of a person to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * @return a string including all attributes of Person class
	 */
	public String toString() {
		return "First name: " + firstName + ",Last name: " + lastName + ",Age: " + age + ",SSN: " + ssn + ",Address: " + address;
	}
}
