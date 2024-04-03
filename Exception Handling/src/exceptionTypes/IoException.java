package exceptionTypes;

import java.util.Scanner;

public class IoException {
	
	 public static void main(String[] args)
	    {
	 
	        // Create a new scanner with the specified String
	        // Object
	        Scanner scan = new Scanner("Hello Akhil");
	 
	        // Print the line
	        System.out.println("" + scan.nextLine());
	 
	        // Check if there is an IO exception
	        System.out.println("Exception Output: "
	                           + scan.ioException());
	 
	        scan.close();   // closing the scanner so no longer we can give values in that
	    }

}
