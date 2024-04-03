package exceptionTypes;

public class NullPointer {

	public static void main(String args[]) {
		try {
			String a = "apple";               // null value
			System.out.println(a.charAt(0));    //gives the Char Value present at index 0 
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		}
	}

}
