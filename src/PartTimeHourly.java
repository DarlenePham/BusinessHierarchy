class PartTimeHourly extends Employee {
	private double baseHourlyPay;

	/**
	 * This is the default constructor of PartTimeHourly class
	 */
	public PartTimeHourly() {
		
	}
	
	/**
	 * This is the constructor of PartTimeHourly class
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 * @param age age of the employee
	 * @param address address of the employee
	 * @param id id of the employee
	 * @param pay pay rate per hour of the employee
	 * @param ssn social security number of the employee
	 */
	public PartTimeHourly(String firstName, String lastName, int age, Address address, int id, double pay, String ssn) {
		super(firstName, lastName, age, address, id, ssn);
		baseHourlyPay = pay;
	}
	
	/**
	 * @return the baseHourlyPay
	 */
	public double getBaseHourlyPay() {
		return baseHourlyPay;
	}

	/**
	 * @param baseHourlyPay the pay base per hour to set
	 */
	public void setBaseHourlyPay(double baseHourlyPay) {
		this.baseHourlyPay = baseHourlyPay;
	}
	
	/**
	 * @return a string including all attributes of PartTimeHourly class
	 */
	@Override
	public String toString() {
		return super.toString() + ",Base pay rate: $" + baseHourlyPay;
	}
	
	/**
	 * Print the information of a part-time employee
	 * @param displaySSN flag if SSN should be shown
	 */
	public void introduce(boolean displaySSN) {
		String str = toString();
		String[] arr = str.split(",");
		System.out.println("=====Part-time hourly=====");
		for(String a : arr) {
			if(displaySSN == false & a.contains("SSN"))
				continue;
			System.out.println(a);
		}
	}
	
	/**
	 * This method print the part-time employee's pay based on hours working. 
	 * If work exceed 40 hours, return -1.
	 * @param numHrs number of hours working
	 * @return pay per hours working
	 */
	public double computePay(int numHrs) {
		if(numHrs > 40)
			return -1;
		else
			return numHrs * baseHourlyPay;
	}
}
