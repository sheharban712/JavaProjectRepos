package inheritance;

public class EmpCalculate extends EmployeeDetails {

	public double calculateHRA()
	{
		hra=0.5*basicpay;
		
		return hra;
	}
	public double calculatePF()
	{
		pf=0.2*basicpay;
		
		return pf;
	}
}
