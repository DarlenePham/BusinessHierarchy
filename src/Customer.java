class Customer extends Person {
	private int customerID;
	private String payPreference;
	
	/**
	 * This is the default constructor of Customer
	 */
	public Customer() {
		
	}
	/**
	 * This is the constructor of Customer
	 * @param customerID the customer ID
	 * @param payPreference the pay preference method
	 */
	public Customer(String firstName, String lastName, int age, String ssn, Address address) {
		super(firstName, lastName, age, ssn, address);
	}
	
	/**
	 * @return the customer ID
	 */
	public int getCustomerID() {
		return customerID;
	}
	
	/**
	 * @param customerID the customer ID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	/**
	 * @return the pay preference method
	 */
	public String getPayPreference() {
		return payPreference;
	}
	
	/**
	 * @param payPreference the pay preference method to set
	 */
	public void setPayPreference(String payPreference) {
		this.payPreference = payPreference;
	}
	
	/**
	 * @return a string including all attributes of Customer class
	 */
	@Override
	public String toString() {
		return super.toString() + ",ID: " + customerID + ",Pay preference: " + payPreference;
	}
	
	/**
	 * Print the information of a customer
	 */
	public void introduce() {
		String str = toString();
		String[] arr = str.split(",");
		System.out.println("=====Customer=====");
		for(String a : arr) {
			if(a.contains("SSN"))
				continue;
			System.out.println(a);
		}
	}
	
	/**
	 * Display the preferred method used to make payment
	 */
	public void makePayment() {
		System.out.println("Payment was made by " + payPreference);
	}
}
