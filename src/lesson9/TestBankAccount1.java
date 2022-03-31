package src.lesson9;

public class TestBankAccount1 {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(500);
		acc1.deposit(100);
		System.out.println("Balance = "+acc1.getBalance());
		acc1.withdraw(200);
		System.out.println("Balance = "+acc1.getBalance());
		//This will cause IllegalArgumentException
		//acc1.deposit(-8);
		//acc1.withdraw(-500);
	}

}
