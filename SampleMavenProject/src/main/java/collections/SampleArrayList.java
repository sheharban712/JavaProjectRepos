package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SampleArrayList {
	
	public static void main(String args[])
	{
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("Java");
		lst.add("Python");
		lst.add("ReactJS");
		
		System.out.println(lst);
		
		ArrayList<String> lstNew=new ArrayList<String>();
		lstNew.add("Angular");
		lstNew.add("ADO.Net");
		lstNew.add("Python");
		lst.addAll(lstNew);
		
		System.out.println("New List: "+lst);
		lst.removeAll(lstNew);
		System.out.println("New List: "+lst);
		
		Collections.sort(lstNew);
		System.out.println("Sorted List: "+lstNew);
		
		System.out.println(lstNew.contains("Python"));
		
	}

}
