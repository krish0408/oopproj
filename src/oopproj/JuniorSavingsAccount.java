package oopproj;

//sub class or derived class or child class
public class JuniorSavingsAccount extends SavingsAccount{

	String guardianName;

	public JuniorSavingsAccount(int accountNo, float balance, int pin, String guardianName) {
		super(accountNo, balance, pin);
		this.guardianName = guardianName;
	}
	
	public void getDetails() {
		System.out.println("AccountNo : "+getAccountNo());
		System.out.println("Balance   : "+getBalance());
	}
	
	//withdraw(int,int)
	@Override
	public void withdraw(int withdrawalAmount, int pin) {		
			if(isPinValid(pin)) {				
				if(withdrawalAmount <= 1000) {					
					withdraw(withdrawalAmount);					
				}else {
					System.out.println("Withdrawal limit exceeded");
				}				
			}else {
				System.out.println("Invalid pin");
			}
	}
	
}
