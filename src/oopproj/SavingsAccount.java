package oopproj;

//super class or base class or parent class
public class SavingsAccount {

	//fields or instance variables or non-static variables
	private int accountNo;
	private float balance;
	private int pin;
	//static variable
	final static int minimumBalance=500;
	
	//default constructor
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}	
	
	//parameterized constructor
	                    //parameters
	public SavingsAccount(int accountNo, float balance, int pin) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.pin = pin;
	}
	
	public static int getMinimumbalance() {
		return minimumBalance;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public boolean isPinValid(int pin) {
		if(this.pin == pin) {
			return true;
		}else {
			return false;
		}
	}

	//instance or non-static method
	//deposit(int)
	public void deposit(int amount) {
		if(amount > 0) {
			this.balance = this.balance + amount;
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	//instance or non-static method
	//withdraw(int)
	public void withdraw(int withdrawalAmount) {
		if(withdrawalAmount <= balance) {
			this.balance = this.balance - withdrawalAmount;
		}else {
			System.out.println("U Have Insufficeint funds");
		}
	}
	
	//withdraw(int,int)
	public void withdraw(int withdrawalAmount,int pin) {
		if(this.pin == pin) {
			
			if(withdrawalAmount <= 4000) {
				
				withdraw(withdrawalAmount);
				
			}else {
				System.out.println("Withdrawal limit exceeded");
			}
			
		}else {
			System.out.println("Invalid pin");
		}
	}
	
}
