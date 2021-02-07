package oopproj;

public class Test {

	public static void main(String[] args) {

		
		//Object creation statement
		SavingsAccount account = new SavingsAccount(101,5000,1234);
		
//		account.accountNo = 101;
//		account.balance = 5000;
//		account.pin = 1234;
		
		account.deposit(1000);

		System.out.println("AccountNo : "+account.getAccountNo());
		System.out.println("Balance   : "+account.getBalance());
		
		System.out.println("MinimumBalance : "+SavingsAccount.getMinimumbalance());
		
		SavingsAccount account2 = new SavingsAccount(102,10000,2345);
		
		account2.withdraw(1000);
		
//		account2.accountNo = 102;
//		account2.balance = 10000;
//		account2.pin = 2345;
	}

}
