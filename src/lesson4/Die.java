package lesson4;

/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    File: Die.java
*/
import java.util.*;

//This class simulates a dice
class Die {

    // Data Members  
    
    //the largest number on a dice
    private static final int MAX_NUMBER =  6;
    
    //the smallest number on a dice
    private static final int MIN_NUMBER = 1;
    
    //to represent a dice that is not yet rolled
    private static final int NO_NUMBER = 0;
    
    private int number;
    
    private Random random;
    
    //Constructor
    public Die( ) {
       random = new Random( );
       number = NO_NUMBER;
    }
    
    //Rolls the dice
    public void roll( ) {
       number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
    
    //Returns the number on this dice
    public int getNumber( ) {
        return number;
    }
    
 }