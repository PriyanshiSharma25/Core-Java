package Com.Rays.Clonning;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer C1= new Customer("Priyanshi");
		Customer C2=(Customer) C1.clone();
		C2.name = "Sharma";
		C2.acnt.balance = 80;

				System.out.println(C1.name);
				System.out.println(C1.acnt.balance);
				System.out.println(C2.name);
				System.out.println(C2.acnt.balance);
	}
}
