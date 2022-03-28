package lesson5;

public class IfDemo {

	public static void main(String[] args) {
		int accountBalance = 50;
		int accountDays = 100;
		String savingsAccountOffer = 
				"You qualified for a special savings account,"
				+ " where you can earn additional interest"
				+ " on your high balances.";
		int creditAccounts = 1;
		boolean balanceTransferPossible = false;

		// if-then statement
		if (accountBalance > 100) {
			System.out.println("Safe balance.");
		}

		// if-then-else statement
		if (accountBalance > 100) {
			System.out.println("Safe balance.");
		} else {
			System.out.println("Warning: Low balance.");
		}

		// if-then-elseif statement
		if (accountBalance > 100) {
			System.out.println("Safe balance.");
		} else if (accountBalance < 0) {
			System.out.println("ALERT: Negative balance!");
		} else {
			System.out.println("Warning: Low balance.");
		}

		// nested if-then statements
		if (accountBalance > 0) {
			System.out.println("Safe balance.");
			if (accountDays > 90) {
				System.out.println(savingsAccountOffer);
			}
		} else {
			System.out.println("ALERT: Negative balance!");
		}
		
		//Boolean operators combining if conditions
		if (accountBalance > 0 && accountDays <= 90) {
		    System.out.println("Safe balance.");
		} else if (accountBalance > 0 && accountDays > 90) {
		    System.out.println("Safe balance.");
		    System.out.println(savingsAccountOffer);
		} else {
		    System.out.println("ALERT: Negative balance!");
		}

		if (accountBalance > 0) {
		    System.out.println("Safe balance.");
		    if (accountDays > 90) {
		        System.out.println(savingsAccountOffer);
		        if (creditAccounts > 1) {
		            balanceTransferPossible = true;
		        } else {
		            System.out.println("Send your Credit Application");
		        }
		    }
		} else {
		    System.out.println("ALERT: Negative balance!");
		}

	}

	}


