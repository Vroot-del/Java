package entities;

public class CurrencyConverter {
	
	public static double price;
	public static double quantity;
	
	public static double amount() {
		double percentage = (price * quantity) * 0.06;
		return (price * quantity) + percentage;
	}
}
