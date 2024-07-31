package encapsulation;

public class CustomerNew {

	public static void main(String[] args) {
		Customer cs=new Customer();
		cs.setEmail("abc@gmail.com");
		cs.setAccountNo("110003476678778");
		cs.setBalance(340000);
		System.out.println("Email :"+cs.getEmail());
		System.out.println("Account no "+cs.getAccountNo());
		System.out.println("Balance :"+cs.getBalance());

	}

}
