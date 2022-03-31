package src.lesson3;
import java.util.Scanner;

public class ComputeLab3Q1 {
	  final static double PI = 3.14159;

 	  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter integer value A: ");
    int A = sc.nextInt();
    System.out.println("Enter integer value for X:");
    int X = sc.nextInt();
    System.out.println("Enter integer value R:");
    int R = sc.nextInt();

    System.out.println("Enter float value B: ");
    float B = sc.nextFloat();

    System.out.println("Enter float value Y: ");
    float Y = sc.nextFloat();

    System.out.println("Enter double value C: ");
    double C = sc.nextDouble();

    // Task a
    double parabola = Math.pow(B, 2) + 4 * A * C;
    double result = Math.sqrt(parabola);
    System.out.println("The square root of \"B^2 + 4AC\" = " + result);
    System.out.println();

    // Task b
    Double exp1 = X + 4* Math.pow(Y, 3);
    double result2 = Math.sqrt(exp1);
    System.out.println(" The square root of \"X + 4Y^3\"  = " + result2);
    System.out.println();

    // Task c
    double prod = X * Y;
    Double exp2 = Math.pow(prod, (double)1/3);
    System.out.println("The cubic root of product of X and Y =  " + exp2);
    System.out.println();

    // Task d
    Double area = PI* Math.pow(R, 2);
    System.out.println("The area of circle with Radius " + R + " = " + area);

 	}

}
