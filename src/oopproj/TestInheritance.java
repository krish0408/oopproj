package oopproj;

public class TestInheritance {

	public static void main(String[] args) {


		JuniorSavingsAccount account = new JuniorSavingsAccount(101,5000,1234,"Hary");
		
//		account.accountNo = 101;
//		account.balance = 5000;
//		account.pin = 1234;
//		account.guardianName = "Hary";
		
		account.deposit(1000);
		
		account.withdraw(2000,1234);
		
		System.out.println("AccountNo : "+account.getAccountNo());
		System.out.println("Balance   : "+account.getBalance());
		
	}

}
