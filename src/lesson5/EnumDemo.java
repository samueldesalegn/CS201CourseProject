package lesson5;

enum Currency {
	US, INDIA, UK
}

public class EnumDemo {
	public static void main(String[] args) {

		display(Currency.US);
		display(Currency.INDIA);
		String x = "UK";
		Currency input = Currency.valueOf(x); // Converting String Input into Enum Type
		display(input);

	}

	public static void display(Currency cy) {
		switch (cy) {
		case US:
			System.out.println("Dollar");
			break;
		case INDIA:
			System.out.println("Rupee");
			break;
		case UK:
			System.out.println("Pounds");
			break;
		}

	}

}