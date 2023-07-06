package Com.Rays.ObjectOrientedProgramming;

public class Account {
		private int Balance= 0;
		private String accountNumber;
		public void setBalance(int a) {
			Balance = a;
		}
		public int getBalance() {
			return Balance ;
		}
		
		public void setAccountNumber(String s) {
			 accountNumber = s; 
		}
		public String getAccountNumber() {
			return accountNumber;
			
	}
		public void deposit(int amount) {
			int total = getBalance()+ amount;
			setBalance(total);
	
		}
		public void withdrawl(int amount) {
			int total = getBalance()- amount;
			setBalance(total);
		}
		private String colour = null;
			private int borderWidth=0;
			public void setColour(String colour) {
				this.colour= colour;
			}
			public String getColour() {
				return colour;
			}
			
		
}
