package oopproj;

public class TestEncapsulation {

	public static void main(String[] args) {

		SavingsAccount account = new SavingsAccount(101,5000,1234);
		
		//account.balance = 10000;

		account.deposit(5000);
		
		System.out.println("Balance : "+account.getBalance());
	}

}
