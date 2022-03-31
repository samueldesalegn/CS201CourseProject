package src.lesson8;

import java.util.Scanner;

public class FindMinimum {
	 Scanner scanner;

    public static void main (String[] args) {
    	FindMinimum tester;
        tester = new FindMinimum( );

        tester.testArrayPassing( );
    }

    public FindMinimum( ) {
        scanner = new Scanner(System.in);
    }


    public void testArrayPassing( ){
        test1( );

        test2( );

        test3( );
    }

    /**
     * Passes an array argument to the searchMinimum method.
     * The called method returns the index to the smallest
     * element in the passed array.
     */
    private void test1( ) {
        double[] arrayOne, arrayTwo;

        double number;

        int size = 10;

        //create and assign values to arrayOne and arrayTwo
        arrayOne = new double[size];
        arrayTwo = new double[size];

        for ( int i = 0; i < size; i++ ) {
            System.out.print("Number " + (i+1) + ": ");
            number = scanner.nextDouble();

            arrayOne[i] = number;
            arrayTwo[size - (i+1)] = number;
        }


        //get the index of the smallest element of arrayOne
        int minOne = searchMinimum(arrayOne);

        //get the index of the smallest element of arrayTwo
        int minTwo = searchMinimum(arrayTwo);

        //output the result
        System.out.print("Mimimum value in Array One is ");
        System.out.print(arrayOne[minOne] + " at position " + minOne);

        System.out.println("\n");

        System.out.print("Mimimum value in Array Two is ");
        System.out.print(arrayTwo[minTwo] + " at position " + minTwo);

     }


     /**
      * Caller declares the array. The array is created by the
      * called method readFloats.
      */
     private void test2( ) {
        double[] arrayOne, arrayTwo;

        //assign values to arrayOne and arrayTwo
        arrayOne = readDoubles();

        arrayTwo = readDoubles();

        System.out.println("\n\n");
        System.out.println("Array One:");

        for (int i = 0; i < arrayOne.length; i++ ) {
            System.out.println(arrayOne[i]);
        }

        System.out.println("\n\n");
        System.out.println("Array Two:");

        for (int i = 0; i < arrayTwo.length; i++ ) {
            System.out.println(arrayTwo[i]);
        }
     }


     /**
      * Caller creates an array and passes this array
      * to the readIntegers method. This method fills
      * the elements.
      */
     private void test3( ) {

        int[] myIntArray = new int[5];

        readIntegers(myIntArray);

        System.out.println("\n\n");
        System.out.println("int Array:");

        for (int i = 0; i < myIntArray.length; i++ ) {
            System.out.println(myIntArray[i]);
        }
     }

    /**
     * Inputs the double values and returns an array of double
     *
     * @return an array of double values entered
     */
    public double[] readDoubles() {
        double[] number;
        
        System.out.println("\n\n");
        System.out.print("How many input values? ");
        int N = scanner.nextInt();

        number = new double[N];

        for (int i = 0; i < N; i++) {            
            System.out.print("Number " + (i+1) + ": ");
            number[i] = scanner.nextDouble();
        }

        return number;
    }


    /**
     * Returns the index to the smallest element in the
     * passed array.
     *
     * @param number an array of double to search for the
     *               smallest element
     *
     * @return the index to the smallest element
     */
    public int searchMinimum(double[] number) {
        int indexOfMinimum = 0;

        for (int i = 1; i < number.length; i++) {
            if (number[i] < number[indexOfMinimum]) { //found a
                indexOfMinimum = i;                   //smaller element
            }
        }
        return indexOfMinimum;
    }


    /**
     * Inputs the integer values and fill the passed
     * array with the entered values.
     *
     * @param number an array of integers whose elements
     *               are filled by this method
     */
    public void readIntegers(int[] number){
        for (int i = 0; i < number.length; i++) {
            System.out.print("Number " + (i+1) + ": ");
            number[i] = scanner.nextInt();
        }
    }
}
