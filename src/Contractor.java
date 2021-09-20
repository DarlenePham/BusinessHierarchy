class Contractor extends Employee {
	private double payBase;
	
	/**
	 * This is the default constructor of Contractor class
	 */
	public Contractor() {
		
	}
	
	/**
	 * This is the constructor of Contractor class
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 * @param age age of the employee
	 * @param address address of the employee
	 * @param id id of the employee
	 * @param pay pay rate per hour of the employee
	 * @param ssn social security number of the employee
	 */
	public Contractor(String firstName, String lastName, int age, Address address, int id, double pay, String ssn) {
		super(firstName, lastName, age, address, id, ssn);
		payBase = pay;
	}

	/**
	 * @return the pay per hour
	 */
	public double getPayBase() {
		return payBase;
	}

	/**
	 * @param payBase the pay per hour to set
	 */
	public void setPayBase(double payBase) {
		this.payBase = payBase;
	}
	
	/**
	 * @return a string including all attributes of Contractor class
	 */
	@Override
	public String toString() {
		return super.toString() + ",Pay base rate: $" + payBase;
	}
	
	/**
	 * Print the information of a contractor employee
	 */
	public void introduce(boolean displaySSN) {
		String str = toString();
		String[] arr = str.split(",");
		System.out.println("=====Contractor=====");
		for(String a : arr) {
			if(displaySSN == false & a.contains("SSN"))
				continue;
			System.out.println(a);
		}
	}
	
	/**
	 * This method print the contractor employee's pay based on hours working. 
	 * @param numHrs number of hours working
	 * @return pay per hours working
	 */
	public double computePay(int numHrs) {
		return numHrs * payBase;
	}
}
