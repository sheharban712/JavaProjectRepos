package inheritance;
import java.util.Scanner;
public class EmpTotal extends EmpCalculate {
	public double calculateTotal()
	{
		totalSalary=basicpay+hra-pf-deduction+bonus;
		
		return totalSalary;
	}
	public static void main(String args[])
	{
		EmpTotal emp=new EmpTotal();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		emp.name = scanner.nextLine();
       
        System.out.println("Enter your id: ");
		emp.id = scanner.nextLine();
		
		System.out.println("Enter your company: ");
		emp.company = scanner.nextLine();
		
		System.out.println("Basic pay: ");
		emp.basicpay = scanner.nextDouble();
		
		System.out.println("Deduction: ");
		emp.deduction = scanner.nextDouble();
		
		System.out.println("Bonus: ");
		emp.bonus = scanner.nextDouble();
		emp.calculateHRA();
		emp.calculatePF();
		emp.calculateTotal();
		emp.printSalaraySlip();
		
		
	}

}
