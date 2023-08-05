package week3.day1;

public class AxisBank extends BankInfo {
	public void Deposit() {
		System.out.println("Amount to be Deposited is Rs.2000");	
	}

	public static void main(String[] args) {
		
		AxisBank Bank=new AxisBank();
		Bank.saving();
		Bank.fixed();
		Bank.Deposit();
		Bank.deposit();
		

	}

}
