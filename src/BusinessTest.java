import java.text.DecimalFormat;
public class BusinessTest {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		//2 instances of executive class
		Executive e1 = new Executive("Maria", "Tyler", 34, new Address(721, "Laurel Lee", "Eagan", "55121", "MN"), 38293737, 2000000, 1299900, "469-10-1826");
		Executive e2 = new Executive("Marshall", "Perkins", 48, new Address(2511, "Pringle Drive", "Chicago", "60610", "IL"), 72934736, 1000000, 389900, "320-34-1306");
		e1.introduce(true);
		System.out.println("Total pay: $" + df2.format(e1.computePay()));
		System.out.println();
		e2.introduce(false);
		System.out.println("Total pay: $" + df2.format(e2.computePay()));
		System.out.println();
		
		//2 instances of full-time salaried class
		FullTimeSalaried fs1 = new FullTimeSalaried("Keith", "Whitmere", 40, new Address(1990, "Black Stallion Road", "Bryantsville", "40444", "KY"), 29475647, 150000, "402-42-2003");
		FullTimeSalaried fs2 = new FullTimeSalaried("John", "Hunt", 32, new Address(4762, "Gregory Lane", "Louisville", "40202", "KY"), 93745801, 88000, "401-57-6203");
		fs1.introduce(true);
		System.out.println("Working units: 45 weeks");
		System.out.println("Total pay: $" + df2.format(fs1.computePay(45)));
		System.out.println();
		fs2.introduce(false);
		System.out.println("Working units: 32 weeks");
		System.out.println("Total pay: $" + df2.format(fs2.computePay(32)));
		System.out.println();
		
		//2 instances of full-time hourly employee
		FullTimeHourly fh1 = new FullTimeHourly("Albert", "Paulson", 23, new Address(4305, "Snyder Avenue", "Charlotte", "28273", "NC"), 74826473, 35, 40, "239-20-9746");
		FullTimeHourly fh2 = new FullTimeHourly("Tina", "Stanley", 29, new Address(3501, "Orchard Street", "Golden Valley", "55427", "MN"), 83728473, 25.5, 30, "472-22-3030");
		fh1.introduce(true);
		System.out.println("Working units: 47 hours");
		System.out.println("Total pay: $" + df2.format(fh1.computePay(47)));
		System.out.println();
		fh2.introduce(false);
		System.out.println("Working units: 38 hours");
		System.out.println("Total pay: $" + df2.format(fh2.computePay(38)));
		System.out.println();
		
		//2 instances of part-time hourly employee
		PartTimeHourly ph1 = new PartTimeHourly("Eric", "Marion", 17, new Address(2137, "Veltri Drive", "Anchorage", "99501", "AK"), 36475622, 18.75, "574-33-2665");
		PartTimeHourly ph2 = new PartTimeHourly("Stephanie", "Wilson", 24, new Address(8301, "Cody Ridge Road", "Oklahoma City", "73105", "OK"), 27432728, 21.5, "442-90-9569");
		ph1.introduce(true);
		System.out.println("Working units: 52 hours");
		System.out.println("Total pay: $" + df2.format(ph1.computePay(52)));
		System.out.println();
		ph2.introduce(false);
		System.out.println("Working units: 35 hours");
		System.out.println("Total pay: $" + df2.format(ph2.computePay(35)));
		System.out.println();
		
		//2 instances of contractor
		Contractor c1 = new Contractor("Casandra", "Boland", 37, new Address(4827, "Black Oak Hollow Road", "Sunyyvale", "94086", "CA"), 28373827, 45.75, "546-70-3983");
		Contractor c2 = new Contractor("Catherine", "Stinson", 33, new Address(377, "Kooter Lane", "Charlotte", "28202", "NC"), 92837472, 32.5, "246-50-6080");
		c1.introduce(true);
		System.out.println("Working units: 60 hours");
		System.out.println("Total pay: $" + df2.format(c1.computePay(60)));
		System.out.println();
		c2.introduce(false);
		System.out.println("Working units: 41 hours");
		System.out.println("Total pay: $" + df2.format(c2.computePay(41)));
		System.out.println();
		
		//2 instances of customer
		Customer cus1 = new Customer("Yu", "Wang", 19, "389-92-3972", new Address(10211, "Homemade Street", "Cupertino", "95014", "CA"));
		Customer cus2 = new Customer("Alex", "Damiens", 62, "293-28-4102", new Address(3889, "Jerry Dove Drive", "Charleston", "29414", "SC"));
		cus1.setPayPreference("Credit Card");
		cus1.setCustomerID(29438471);
		cus1.introduce();
		System.out.println();
		cus2.setPayPreference("Paypal");
		cus2.setCustomerID(84738374);
		cus2.introduce();
	}

}
