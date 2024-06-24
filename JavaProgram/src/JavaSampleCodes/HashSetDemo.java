package JavaSampleCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet myset=new HashSet();
		
		myset.add(100);
		myset.add("welcome");
		myset.add('A');
		myset.add(10.5);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		myset.add(true);
		//size
		/*System.out.println("Orginal HashSet size is:" +myset.size());
		
		System.out.println("Orginal HashSet is:"+myset);
		//remove
		myset.remove(10.5);
		System.out.println("After remove size of the HashSet is:" +myset.size());
		System.out.println("After removing HashSet is:" +myset);
		 */
		//Insert the object into HashSet is not possible.
		
		//Access the specific element from the HashSet is not possible. But these is a work around.
		
		/* ArrayList al=new ArrayList(myset);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		//using the for..each loop
		
		for(Object y:myset)
		{
			System.out.println(y);
		}
		*/
		
		//Using Iterator
		
		/*Iterator it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	*/
		myset.clear();
		System.out.println(myset);
		
		System.out.println(myset.isEmpty());
		
	}

}
