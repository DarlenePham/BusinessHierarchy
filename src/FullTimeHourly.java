class FullTimeHourly extends FullTimeEmployee {
	private double overtimePay;
	
	/**
	 * This is the default constructor of FullTimeHourly class
	 */
	public FullTimeHourly() {
		
	}
	
	/**
	 * This is the constructor of FullTimeHourly class
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 * @param age age of the employee
	 * @param address address of the employee
	 * @param id id of the employee
	 * @param basePay pay rate per hour of the employee
	 * @param overtime pay rate per overtime hour of the employee
	 * @param ssn social security number of the employee
	 */
	public FullTimeHourly(String firstName, String lastName, int age, Address address, int id, double basePay, double overtime, String ssn) {
		super(firstName, lastName, age, address, id, basePay, ssn);
		overtimePay = overtime;
	}

	/**
	 * @return the overtime pay rate per hour
	 */
	public double getOvertimePay() {
		return overtimePay;
	}

	/**
	 * @param overtimePay the overtime pay rate per hour to set
	 */
	public void setOvertimePay(double overtimePay) {
		this.overtimePay = overtimePay;
	}
	
	/**
	 * @return a string including all attributes of FullTimeHourly class
	 */
	@Override
	public String toString() {
		return super.toString() + ",Overtime pay rate: $" + overtimePay;
	}
	
	/**
	 * Print the information of a full-time hourly employee
	 * @param displaySSN flag if SSN should be shown
	 */
	public void introduce(boolean displaySSN) {
		String str = toString();
		String[] arr = str.split(",");
		System.out.println("=====Full-time hourly=====");
		for(String a : arr) {
			if(displaySSN == false & a.contains("SSN"))
				continue;
			System.out.println(a);
		}
	}
	
	/**
	 * This method print the full-time hourly employee's pay based on hours working. 
	 * @param numHrs number of hours working
	 * @return pay per hours working
	 */
	public double computePay(int numHrs) {
		if(numHrs > 40)
			return 40 * basePay + (numHrs - 40) * overtimePay;
		else
			return numHrs * basePay;
	}
	
}
