package String;

public class reverseString {

	public static void main(String[] args) {
	String s = "Rohit";
	String rev = "";
	int size = s.length();

	for(int i=size-1; i>=0; i--)
	{
 	rev= rev+s.charAt(i);
	
	}
	System.out.print("The reverse of string is: " +rev);
	}

}
