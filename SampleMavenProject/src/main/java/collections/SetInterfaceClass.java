package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceClass {
	
	public static void main(String args[])
	{
		Set s1=new HashSet();
		s1.add(1);
		s1.add("hary");
		s1.add(3);
		s1.add("sai");
		s1.add(true);
		s1.add(4.5);
		System.out.println(s1);
		
		HashSet hs1=new HashSet();
		hs1.add("test");
		hs1.add('a');
		hs1.add(54);
		hs1.add(false);
		
		System.out.println(hs1);
		
		
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("new");
		
		
		HashSet<String> hs3=new HashSet<String>();
		hs3.add("apple");
		hs3.add("orange");
		hs3.add("grapes");
		
		
		System.out.println(hs2);
		System.out.println(hs2.size());
		System.out.println(hs2.contains("new"));
		hs2.remove("new");
		
		
		Iterator<String> it1=hs2.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.hasNext());
		}
		hs2.addAll(hs3);
		System.out.println(hs2);
		hs2.removeAll(hs3);
		
		System.out.println(hs2);
	}

}
