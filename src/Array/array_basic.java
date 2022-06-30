package Array;

public class array_basic {

	public static void main(String[] args) {
	
		int a[]=new int[5];      //declaration 
		
		a[0]=10;				//initialization  (assigning value to array by index number)
		a[1]=20;				// Array stores only homogeneous data type
		a[2]=30;				//indexing always starts from 0 so if size = last index number + 1.
		a[3]=40;
		a[4]=50;
		
		int size=a.length;
		System.out.println("The size of array a : " +size);

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	}

}
