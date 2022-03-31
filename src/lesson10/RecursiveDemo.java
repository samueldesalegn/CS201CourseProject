package src.lesson10;

public class RecursiveDemo {

    public static void main(String[] args) {

    	int res = length("Java Program");
		System.out.println("Length of Renuka " + res );
		System.out.println("Print Characters of a String");
		printChars("Java");
		System.out.println("Print Reversed Characters of a String");
		printCharsReverse("Object Oriented");
		
    	System.out.println("\n Factorial(4): " + factorial(4));
        System.out.println("\nGCD: " + gcd(32,20));
        System.out.println("\nGCD: " + gcd(70,98));
        System.out.println();
        System.out.println("Summation : " +summation(3));
        
        System.out.println("Count of Specific Char: "+ countChar("Java Programming",0, 'm'));

        int [] arr = {6,9,3,5,6,1};
      //  printReversed(arr,0);
       int min =  findMin(arr,0);
       System.out.println("\nMinumum = " + min);

    }

 //1. Recursive Method to find the length of a String
 	public static int length(String str) {
         if (str == null || str.equals("")) {
             return 0;
         } else {
             return 1 + length(str.substring(1)); // ava, va, a, ""
         }
     }
 // 2. Recursive Method to print the characters of a String
 	public static void printChars(String str) {
 		if (str == null || str.equals(""))
 		return;
 		else {
 		System.out.println(str.charAt(0));
 		printChars(str.substring(1));
 		}
 		}
 // 3. Recursive method to print the string in reverse order
 	public static void printCharsReverse(String str) {
         if (str == null || str.equals("")) {
             return;
         } else {
         	 printCharsReverse(str.substring(1));
             System.out.print(str.charAt(0));
         }
       }
 	// 4. Recursive Factorial
 	public static int factorial( int n ){
        // base case
        if(n ==1)
            return 1;
        else // recursive case
            return n * factorial(n-1);
    }
 	// 5. Recursive algorithm to find GCD
 	public static int gcd(int m, int n) {
 	    if (m % n == 0)
 		 return n;
 	    else if (m < n)
 		 return gcd(n, m); // Transpose arguments.
 	    else
 		 return gcd(n, m % n);
 	}   
 	// 6. Recursive method for sum of 1+2+..+n
    public static int summation(int n){
        if(n == 1)
            return 1;
        else
            return n + summation(n - 1);
    }
    // 7. Count the character c from the string word starts from the index 0
    public static int countChar(String word, int i, char c){ // 0

        if(i == word.length())
            return 0;
        else
        if(word.toLowerCase().charAt(i) == c)
            return 1 + countChar(word, i+1, c);
        else
            return 0 + countChar(word, i+1, c);
    }
    // Iterative approach to count the given char from the string
    public static int countCharLoop(String word, char c){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.toLowerCase().charAt(i) == c)
                count++;
        }
        return count;
    }
    // 8. Find the minimum value from the given array
    public static int findMin(int [] arr, int index){
        int nextVal;
        if(index == arr.length-1)
            return arr[index];
        else
            nextVal = findMin(arr, index+1);
            if(arr[index] < nextVal)
                return arr[index];
            else
                return nextVal;
    }

       
}
