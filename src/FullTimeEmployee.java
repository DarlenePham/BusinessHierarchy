abstract class FullTimeEmployee extends Employee {
	protected double basePay;
	
	/**
	 * This is the default constructor of FullTimeEmployee class
	 */
	public FullTimeEmployee() {
		
	}
	
	/**
	 * This is the constructor of FullTimeEmployee class
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 * @param age age of the employee
	 * @param address address of the employee
	 * @param id id of the employee
	 * @param basePay pay rate per hour/year of the employee
	 * @param ssn social security number of the employee
	 */
	public FullTimeEmployee(String firstName, String lastName, int age, Address address, int id, double basePay, String ssn) {
		super(firstName, lastName, age, address, id, ssn);
		this.setBasePay(basePay);
	}

	/**
	 * @return the base pay
	 */
	public double getBasePay() {
		return basePay;
	}

	/**
	 * @param basePay the base pay to set
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	
	/**
	 * @return a string including all attributes of FullTimeEmployee class
	 */
	@Override
	public String toString() {
		return super.toString() + ",Base pay rate: $" + basePay;
	}
}
