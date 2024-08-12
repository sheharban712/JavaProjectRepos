package collections;

import java.util.ArrayList;
import java.util.List;

public class ColorList {
	public static void main(String args[])
	{
	
		ArrayList<String> colrLst=new ArrayList<String>();
		colrLst.add("Orange");
		colrLst.add("Red");
		colrLst.add("Yellow");
		colrLst.add("Blue");
		System.out.println(colrLst);
		
		System.out.println();
		//Get Element at 2 position
		System.out.println("Get Element at 2 position :"+colrLst.get(1));
		System.out.println();
		
		//loop through the elements
		System.out.println("Looping through the list : ");
		for(int i=0;i<colrLst.size();i++)
		{
			System.out.println(colrLst.get(i));
		}
		System.out.println();
		
		//removing element at 3 position
		System.out.println("Removing element at 3 position ");
		colrLst.remove(2);
		System.out.println(colrLst);
		System.out.println();
		
		//Search an element in the list
		System.out.println("Blue exist in the colr List : "+colrLst.contains("Blue"));
	
	}
	
	

}
