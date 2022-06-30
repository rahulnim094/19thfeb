package Array;

public class array_sort {
	public static void main(String[]args)
	{           // 0,  1,  2, 3, 4,  5,  6,  7,  8,  9  possision
		int a[]= {10, 20, 40, 2, 4, 60, 50, 98, 23, 67};  //----total length = 10
		
		for(int i=0 ; i<a.length ; i++)
		{
   			for(int j=i+1 ; j<a.length ;j++)
			{
				int temp ;
				if (a[i] > a[j])
				{
					temp = a[i] ;
					a[i] = a[j] ;
					a[j] = temp ;
				}
			}
		System.out.print(a[i] +" ");
	}
}
}
