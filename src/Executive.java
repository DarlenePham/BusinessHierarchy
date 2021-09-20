class Executive extends Employee {
	private double yearlyBonus;
	private double yearlyCompensation;
	
	/**
	 * This is the default constructor of Executive class
	 */
	public Executive() {
		
	}
	
	/**
	 * This is the constructor of Executive class
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 * @param age age of the employee
	 * @param address address of the employee
	 * @param id id of the employee
	 * @param pay pay rate per year of the employee
	 * @param bonus bonus earned that year of the employee
	 * @param ssn social security number of the employee
	 */
	public Executive(String firstName, String lastName, int age, Address address, int id, double pay, double bonus, String ssn) {
		super(firstName, lastName, age, address, id, ssn);
		yearlyBonus = bonus;
		yearlyCompensation = pay;
	}

	/**
	 * @return the yearly bonus
	 */
	public double getYearlyBonus() {
		return yearlyBonus;
	}

	/**
	 * @param yearlyBonus the yearly bonus to set
	 */
	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	/**
	 * @return the yearly compensation
	 */
	public double getYearlyCompensation() {
		return yearlyCompensation;
	}

	/**
	 * @param yearlyCompensation the yearly compensation to set
	 */
	public void setYearlyCompensation(double yearlyCompensation) {
		this.yearlyCompensation = yearlyCompensation;
	}
	
	/**
	 * @return a string including all attributes of Executive class
	 */
	@Override
	public String toString() {
		return super.toString() + ",Yearly bonus: $" + yearlyBonus + ",Yearly compensation: $" + yearlyCompensation;
	}
	
	/**
	 * Print the information of an executive employee
	 */
	public void introduce(boolean displaySSN) {
		String str = toString();
		String[] arr = str.split(",");
		System.out.println("=====Executive=====");
		for(String a : arr) {
			if(displaySSN == false & a.contains("SSN"))
				continue;
			System.out.println(a);
		}
	}
	
	/**
	 * This method print the executive employee's pay based on compensation and bonus per year. 
	 * @return total pay per year
	 */
	public double computePay() {
		return yearlyBonus + yearlyCompensation;
	}
}
