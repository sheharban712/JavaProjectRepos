package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SampleArrayList {
	
	public static void main(String args[])
	{
		ArrayList l1=new ArrayList();//non generic collection
		l1.add(10);
		l1.add("test");
		l1.add(3.5);
		l1.add(true);
		System.out.println(l1);
		
		ArrayList<String> lst=new ArrayList<String>();//Generic Collection
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
		System.out.println("Check whether list is empty :"+lst.isEmpty());
		System.out.println("size of the list :"+lst.size());
		System.out.println("Get Element at 1 :"+lst.get(1));
		lst.set(1, "test");
		System.out.println(lst);
		System.out.println("Get Element at 1"+lst.get(1));
		Collections.sort(lstNew);
		System.out.println("Sorted List: "+lstNew);
		
		System.out.println(lstNew.contains("Python"));
		
		System.out.println("for loop");
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i));
		}
	
		System.out.println("for each loop");
		for(String i:lst)
		{
			System.out.println(i);
		}
		
		System.out.println("Iterator");
		Iterator <String> itr=lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Iterator remove");//remove last element
		itr.remove();
		System.out.println(lst);
	}

}
