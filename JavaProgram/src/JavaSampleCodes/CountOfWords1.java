package JavaSampleCodes;

import java.util.Map;
import java.util.TreeMap;

public class CountOfWords1 {

	public static void main(String[] args) {
		String str="ramesh ramesh manvitha manvitha manvitha";
		String arr[]=str.split(" ");
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
			map.put(arr[i], count);
		}
		System.out.println(map);
	}

}
