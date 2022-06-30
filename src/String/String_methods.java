package String;

public class String_methods {

	public static void main(String[] args) {
		
		String str = "Velocity";
		String str1 = "VELOCITY";
		
		String str2= "That's a good information";
		
		System.out.println(str.equals(str1));
		
		System.out.println(str == str1);
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.length());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.concat(str1));
		
		System.out.println(str.indexOf('i'));
		
		System.out.println(str2.lastIndexOf('i'));
		
		System.out.println(str2.replace("\\s","co"));
		
		System.out.println(str2.replaceAll("information","info"));
		
	
		
		String spl[]= str1.split("O");					//String spl= {"VEL","CITY"}
		System.out.println(spl);
	}

}
