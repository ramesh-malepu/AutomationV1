package JavaSampleCodes;

import java.util.Map;
import java.util.TreeMap;

public class CountOfWordOccuredInString {

	public static void main(String[] args) {

		String s="ramesh ramesh malepu ramesh kirthan kirthan";
		
		String arr[]=s.split(" ");
		int count=0;
		Map<String,Integer> map=new TreeMap<>();
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
				}
			}
			map.put(arr[i],count);
		}
		System.out.println(map);
	}

}
