package lesson9;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount(500);
		try {
		acc1.deposit(100);
		System.out.println("Balance = "+acc1.getBalance());
		acc1.withdraw(200);
		System.out.println("Balance = "+acc1.getBalance());
		//This will cause IllegalArgumentException
		acc1.deposit(-8);
		//acc1.withdraw(-500);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End Program");
		}
	}

}
