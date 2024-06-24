package JavaSampleCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap hm=new HashMap();
		
		hm.put(101,"ramesh");
		hm.put(102,"prema");
		hm.put(103,"kirthan");
		hm.put(104,"manvitha");
		hm.put(105,"prema");
		hm.put(103, "raghu");
		
	/*	System.out.println("HashMap is:"+hm);
		
		System.out.println("Size of HashMap is:" +hm.size());
		
		//remove pair
		
		hm.remove(103);
		System.out.println("After remove HashMap is:" +hm);
		
		//Access specific value
		
		System.out.println(hm.get(102));
		
		//get all keys&Values from HashMap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		*/
		//using for..each loop
		
		
		/*
		for( Object x:hm.entrySet())
		{
			System.out.println(x);
		}
		
		*/
		//Using Iterator
		
		Iterator it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
