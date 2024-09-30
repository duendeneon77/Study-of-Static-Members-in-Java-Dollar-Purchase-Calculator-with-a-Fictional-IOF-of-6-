package util;

public class Calculator {
	public static final double IOF = 0.06;
	
	public static String amountToBePaid(double dollarPrice, double howMany) {
		double count =(dollarPrice * howMany)*(1+IOF);
		
		return String.format("Amount to be paid: %.2f: ",count);
	}

}
