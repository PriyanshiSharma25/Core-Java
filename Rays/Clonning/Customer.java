package Com.Rays.Clonning;

class Customer implements Cloneable {
	public String name = null;
	public Account acnt= null;

	public Customer(String name) {
		this.name= name;
		this.acnt= new Account(10);
		}
@Override
protected Object clone() throws CloneNotSupportedException {
	Customer C = (Customer)super.clone();
	C.acnt= (Account) acnt.clone();
	return C;
}
}
