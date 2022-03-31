package src.lesson6;
import java.util.Random;

public class NestedLoops {

	public static void main(String[] args) {
		randomBoard();
		System.out.println("____________________________________________");
		printTable();
		System.out.println("____________________________________________");
		printStars(5);
	}
	
	public static void randomBoard() {
		Random rand =  new Random();
		
		for(int r =0; r< 3 ; r++) {
			for (int c = 0 ; c< 3 ; c++) {
				System.out.print(rand.nextInt(9)+1 + " ");
			}
			System.out.println("");
		}
	}

	
	public static void printTable()	{
		for(int r =0; r< 4 ; r++) {
			for (int c = 0 ; c< 5 ; c++) {
				System.out.print("( " +  r + ", " + c + " ) ");
			}
			System.out.println("");
		}
	}
	public static void printStars(int n) {
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					System.out.print(" *");		
				}
				System.out.println();
			}
}
}