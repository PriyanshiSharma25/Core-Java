package Com.Rays.ObjectOrientedProgramming;

public class TestAccount {
	public static void main (String [] args) {
		
	Account a = new Account();
	a.setBalance(7890);
	a.setAccountNumber("SBI0987");
	a.deposit(6000);
	a.setColour("Black");
	a.withdrawl(5000);
	System.out.println(a.getBalance());
	System.out.println(a.getAccountNumber());
	System.out.println(a.getColour());
	System.out.println(a.getBalance());
	
	
	}

}
