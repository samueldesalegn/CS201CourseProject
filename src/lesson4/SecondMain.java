package lesson4;

/*
    Introduction to OOP with Java ((5th Ed), McGraw-Hill

    Wu/Otani

    File: SecondMain.java

*/

class SecondMain {
    //This sample program uses both the Bicycle and Account classes

    public static void main( String[] args ) {
    
        Bicycle bike;
        Account acct;
        
        String  myName = "Jon Java";
        
        bike = new Bicycle( );    
        bike.setOwnerName(myName);
        
        acct = new Account( );
        acct.setOwnerName(myName);
        acct.setInitialBalance(250.00);
        
        acct.add(25.00);
        acct.deduct(50);
        System.out.println("Owner: " + acct.getOwnerName());
        System.out.println("Bal  : " + acct.getCurrentBalance());
 
        //Output some information      
        System.out.println(bike.getOwnerName() + " owns a bicyle and");                            
        System.out.println("has $ " + acct.getCurrentBalance() + " left in the bank"); 
       
    }
}