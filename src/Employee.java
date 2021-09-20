abstract class Employee extends Person {
	private int id;
	private String educationLevel = "N/A";
	private boolean directDeposit;
	
	/**
	 * This is the default constructor of Employee class
	 */
	public Employee() {
		
	}
	
	/**
	 * This is the constructor of Employee class
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 * @param age age of the employee
	 * @param address address of the employee
	 * @param id id of the employee
	 * @param ssn social security number of the employee
	 */
	public Employee(String firstName, String lastName, int age, Address address, int id, String ssn) {
		super(firstName, lastName, age, ssn, address);
		this.id = id;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the educational level
	 */
	public String getEducationLevel() {
		return educationLevel;
	}

	/**
	 * @param educationLevel the educational level to set
	 */
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	/**
	 * @return the direct deposit
	 */
	public boolean isDirectDeposit() {
		return directDeposit;
	}

	/**
	 * @param directDeposit the direct deposit to set
	 */
	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}
	
	/**
	 * @return a string including all attributes of Employee class
	 */
	@Override
	public String toString() {
		return super.toString() + ",ID: " + id + ",Education Level: " + educationLevel + ",Direct deposit: " + directDeposit;
	}
}
