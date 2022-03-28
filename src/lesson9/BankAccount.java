package lesson9;

/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 8 Sample Class: Use the assert statement

    File: BankAccount.java

*/
class BankAccount {
	
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
      if(amount<=0) 
    	  throw new IllegalArgumentException("Amount must be positive");
      balance+=amount;
   }

    public void withdraw(double amount) throws IllegalArgumentException{
           if(amount<=0) 
         	  throw new IllegalArgumentException("Amount must be positive");
           if(amount > balance)
        	  throw new IllegalArgumentException("Insufficient Balance"); 
           balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}