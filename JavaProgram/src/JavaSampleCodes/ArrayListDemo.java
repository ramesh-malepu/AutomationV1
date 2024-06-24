package JavaSampleCodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList myList=new ArrayList();
		
//		List MyList= new ArrayList();
		
//		ArrayList<Integer>MyList=new ArrayList<Integer>();
		
		
		//Add the object into ArrayList
		
		myList.add(100);
		myList.add("welcome");
		myList.add(10.5);
		myList.add('A');
		myList.add(true);
		myList.add(100);
		myList.add(null);
		myList.add(null);
		
		System.out.println("ArrayList of size is:" +myList.size());
		/* System.out.println("ArrayList is:"+myList);
		
		//Remove objects

		System.out.println(myList.remove(0));
		
		System.out.println("After remove ArrayList of size is:" +myList.size());
		System.out.println("After remove ArrayList is:"+myList);
		//Insert object into ArrayList
		myList.add(0,100);
		myList.add(2,1000);
		
		System.out.println("After insert ArrayList of size is:" +myList.size());
		System.out.println("After Insert ArrayList is:"+myList);
		
		//modify/replace/change
		
		myList.set(0,"Java");
		System.out.println("After set ArrayList is:"+myList);
		
		//Access specific value from ArrayList
		
		System.out.println(myList.get(1));
		
		
		for(int i=0;i<=myList.size()-1;i++)
		{
			System.out.println(myList.get(i));
			
		}
		
		*/
		/*
		for(Object list:myList)
		{
			System.out.println(list);
		}
		*/
		
		
		//Using Iterator 
		
		Iterator it=myList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
