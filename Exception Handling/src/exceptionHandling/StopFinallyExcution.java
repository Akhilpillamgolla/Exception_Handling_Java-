package exceptionHandling;

public class StopFinallyExcution {

	public static void main(String[] args) {
		
		int a[] = {21,32,65,78};

		try {
			System.out.println(" Acess elements three : " + a[5]); //we can't add excess array
			
			}
			catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch");
			System.exit(0);          // method terminates JVM 
			}
			finally {
			System.out.println("finally");
			}
	}

}
