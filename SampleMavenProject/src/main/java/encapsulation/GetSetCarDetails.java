package encapsulation;

public class GetSetCarDetails {

	public static void main(String[] args) {
		Car cr=new Car(400);
		cr.setCompany_name("Benz");
		cr.setModel_name("C Class");
		cr.setYear(2019);
		
		System.out.println("Company name :"+cr.getCompany_name());
		System.out.println("Model Name "+cr.getModel_name());
		System.out.println("Year :"+cr.getYear());
		System.out.println("Mileage :"+cr.getMileage());

	}

}
