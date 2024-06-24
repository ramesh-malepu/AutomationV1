package JavaSampleCodes;

public class MultiDimArray {

	public static void main(String[] args) {

		int a[][]= new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		System.out.println("Length of row:" +a.length);
			
		System.out.println("length of column:" +a[0].length);
		
//		for(int r=0;r<=a.length-1;r++)
//		{
//			for(int c=0;c<=a[r].length-1;c++)
//			{
//				System.out.print(a[r][c]+" ");
//				
//			}
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+ "  ");
			}
			System.out.println();
		}
		
	}

}
