class FullTimeSalaried extends FullTimeEmployee {
	/**
	 * This is the default constructor of FullTimeSalaried class
	 */
	public FullTimeSalaried() {
		
	}
	
	/**
	 * This is the constructor of FullTimeSalaried class
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 * @param age age of the employee
	 * @param address address of the employee
	 * @param id id of the employee
	 * @param salary salary per year of the employee
	 * @param ssn social security number of the employee
	 */
	public FullTimeSalaried(String firstName, String lastName, int age, Address address, int id, double salary, String ssn) {
		super(firstName, lastName, age, address, id, salary, ssn);
	}
	
	/**
	 * @return a string including all attributes of FullTimeSalaried class
	 */
	@Override
	public String toString() {
		return super.toString();
	}
	
	/**
	 * Print the information of a full-time salaried employee
	 * @param displaySSN flag if SSN should be shown
	 */
	public void introduce(boolean displaySSN) {
		String str = toString();
		String[] arr = str.split(",");
		System.out.println("=====Full-time salaried=====");
		for(String a : arr) {
			if(displaySSN == false & a.contains("SSN"))
				continue;
			System.out.println(a);
		}
	}
	
	/**
	 * This method print the full-time salaried employee's pay based on weeks working. 
	 * @param numWeeks number of weeks working
	 * @return pay per hours working
	 */
	public double computePay(int numWeeks) {
		return numWeeks * basePay / 52;
	}
}
