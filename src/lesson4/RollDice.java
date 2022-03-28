package lesson4;


/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    File: RollDice.java

*/

class RollDice {
    
    //Simulates the rolling of three dice
    public static void main( String[] args ) {
        
        Die one, two, three;
        
        one   = new Die( );
        two   = new Die( );
        three = new Die( );
        
        one.roll();
        two.roll();
        three.roll();
        
        System.out.println("Results are " + one.getNumber( ) + "  " +
                                            two.getNumber( ) + "  " +
                                            three.getNumber( ) );
       
    }
}