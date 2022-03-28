package lesson6;

public class ForTable {
	public static void main(String[] args) {
		// Slide - 26 
		System.out.println("Nested Loop Table");
		for(int row=11; row<=20; row++) {
			for(int col = 5; col <=25; col+=5) {
				int value = 19*col*row;
				System.out.print(value);
				System.out.print("  ");
			}
			System.out.println();
		}
		// Nested Loop with Break
		System.out.println("\nNested Loop - inner loop Break Example");
		for (int x = 0; x < 3; x++) {// outer loop (x loop)
			for (int y = 0; y < 3; y++) { // inner loop (y loop)
				System.out.println("x = " + x + " and y = " + y);
				if (x == y) { // new conditional expression
					System.out.println("Break out of y loop.\n");
					break; // new break statement
				}
			}
		}
	}

}
