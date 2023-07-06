package Com.Rays.Interface;

public class Buisness implements Institute, StartUp{

	@Override
	public void Employee() {
		// TODO Auto-generated method stub
		System.out.println("Employee of the company");
	}

	@Override
	public void Interns() {
		// TODO Auto-generated method stub
		System.out.println("New interns");
		
	}

	@Override
	public void Salary() {
		// TODO Auto-generated method stub
		System.out.println(" Monthly Fixed pay");
		
	}

	@Override
	public void Ideas() {
		// TODO Auto-generated method stub
		System.out.println("new initiative ideas");
		
	}

}
