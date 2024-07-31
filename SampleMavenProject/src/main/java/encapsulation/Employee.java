package encapsulation;

public class Employee {
	
	private String name,designation;
	private double salary;
	
	public void setter(String name,String designation,double salary)
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	public void getter()
	{
		System.out.println("Employee name :"+name);
		System.out.println("Designation :"+designation);
		System.out.println("Salary :"+salary);
	}
	

}
