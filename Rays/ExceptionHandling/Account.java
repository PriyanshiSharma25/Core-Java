package Com.Rays.ExceptionHandling;

public class Account extends Exception {
	private double Balance= 0;
	private String accountNumber= null;
	public void setBalance(double Balance) {
		this.Balance= Balance;
	}
	public double getBalance() {
		return Balance ;
	
}
	public void deposit(double amount) {
		double total = getBalance()+ amount;
		System.out.println("Deposit amount = " + amount);
}
	public void withdrawl (double amt) throws Account {
		if ((Balance - amt)<2000) {
			throw new Account();
		}else {
			Balance = Balance -amt;
			System.out.println("Withdrawl ="+ amt);
			System.out.println("Balance is ="+ Balance);
		}
	}
	}
