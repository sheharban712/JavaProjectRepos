package abstraction;

public class FullTimeEmployee extends Employee {
	
	public int calculateSalary()
	{
		workHr=8;
		return payment*workHr;
	}

	public static void main(String args[])
	{
		FullTimeEmployee fte=new FullTimeEmployee();
		fte.payment	=1000;
		System.out.println("Full Time Employee Salary: "+fte.calculateSalary());
		
		Contractor ct=new Contractor();
		ct.payment	=1000;
		ct.workHr	=4;
		System.out.println("Contractor Salary: "+ct.calculateSalary());
		
	}
}
