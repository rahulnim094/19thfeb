package String;

public class StringClass {
	
	//String Immutable once we initialized string we cannot change value
	
	public static void main(String[] args) {
		String str = "aelocity"; //1 object
		String str1= "1elkcity"; //No object
		String str2= new String ("VELOCITY");
		
	
		//start index= 0
		//end index= length -1

		// Difference between "==" and equals() method..
		
		if(str == str2) {
			//System.out.println("Str1 & str is same");
		}
		else {
			//System.out.println("false");
		}
		
		//System.out.println(str.equals(str2));
		//System.out.println(str.equalsIgnoreCase(str2));
		
		
		char ch= str.charAt(1);  // char at index
		//System.out.println(ch);
		
	//	System.out.println(str.indexOf('y')); 
	//	System.out.println(str.indexOf('m'));
	//	System.out.println(str.lastIndexOf('y'));
		
		int size = str.length();  // return the size of string
		//System.out.println(size);
		
		String upperCase= str.toUpperCase();
		//System.out.println(upperCase);
		
		//String lowerCase= str.toLowerCase();
		//System.out.println(lowerCase);
		//System.out.println(str);
		
		//System.out.println(str + " " + str1+ " ");
		
		//String str3= str.concat(null);
		
		String str4 = str + null;
		//System.out.println(str4);
		
		//System.out.println(str3);
		
	//	System.out.println(str.replace('o', 'M'));
	//	System.out.println(str.replace("Vel", "k"));
		//System.out.println(str.replaceAll("", ""));
		
		//compareTo
		//value of
		//split
		
		
		String str7= "VAlocity";
				
		String str8= "Velocity";
		String str9[]= str7.split("");
		
		System.out.println(str7.compareTo(str8));
		
		String  a= str7.valueOf('a');
		
		int m= 79246;
		String b= String.valueOf(m);
	
	}


}