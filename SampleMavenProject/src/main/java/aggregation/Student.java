package aggregation;

public class Student {
	int studentId;
	String name,std;
	Address addr;
	
	public Student(int studentId,String name,String std,Address addr)

	{
		this.studentId=studentId;
		this.name=name;
		this.std=std;
		this.addr=addr;
	
	}
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Student ID :"+studentId);
		System.out.println("Std :"+std);
		System.out.println("House no :"+addr.houseno);
		System.out.println("Street :"+addr.street);
		System.out.println("LandMark :"+addr.landmark);
		System.out.println("Pincode :"+addr.pincode);
	}
	public static void main(String[] args) {
		Address adr=new Address("404/B","Thalakkonam","Thonakkal","tvm",695317);
		Student st=new Student(1,"sheharban","9",adr);
		st.display();
		
		
	}
}
