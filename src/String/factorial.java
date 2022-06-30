package String;

public class factorial {

	public static void main(String[] args) {
		
		//4!=4*3*2*1
			
		int number = 4;
		int factorial=1;
		
	for(int i = number; i>0; i--) {
		
		factorial=i*factorial;  		
	}
	System.out.println(factorial);
	}
	
}
