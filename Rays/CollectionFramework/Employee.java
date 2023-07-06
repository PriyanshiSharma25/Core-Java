package Com.Rays.CollectionFramework;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	private int id = 0;
	private String name = null;
	private int salary = 0;
	
	public Employee (int id ,String name , int salary) {
		this.id = id ;
		this.name = name;
		this.salary= salary;
		
	}
	public int getID() {
		return id;
	}
	public String getname() {
		return name;
	}
	public int getSalary() {
		return salary;
	
	}

	  @Override
	public String toString() {
	
		return id+" "+name+" "+salary;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id;
	}
	 
	class OrderByName implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			o1.getname().compareTo(o2.getname());
	
			return 0;
		}
	
	}}

	

