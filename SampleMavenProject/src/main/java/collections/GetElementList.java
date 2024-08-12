package collections;

import java.util.ArrayList;

public class GetElementList {

	public static void main(String[] args) {
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("Benz");
		lst.add("BMW");
		lst.add("Alto");
		lst.add("Creta");
		lst.add("Innova");
		System.out.println(lst);
		System.out.println("Get Element at 2 position "+lst.get(1));

	}

}
