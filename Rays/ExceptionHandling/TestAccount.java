package Com.Rays.ExceptionHandling;

public class TestAccount {
	public static void main(String[] args) {
		Account A = new Account();
		A.deposit(10000);
		try {
			A.withdrawl(2000);
			}catch (Account e) {
				e.printStackTrace();
			}
	}

}
