package inheritance;

public class EmployeeDetails {
	String name,id,company;
	double basicpay,deduction,bonus,hra,pf,totalSalary;
	public void printSalaraySlip()
	{
		System.out.println("Salary Slip :");
		System.out.println("Employee Name :"+name);
		System.out.println("Employee ID :"+id);
		System.out.println("Company :"+company);
		System.out.println("Basic Pay :"+basicpay);
		System.out.println("Deduction :"+deduction);
		System.out.println("HRA :"+hra);
		System.out.println("PF :"+pf);
		System.out.println("Bonus :"+bonus);
		System.out.println("Total Salary :"+totalSalary);
		
	}

}
