package exceptionTypes;

public class StringOutOfBound {
	
	 public static void main(String args[])
	    {
	        try {
	            
	        	String a = "Akhil Pillamgolla a java Developer  "; // length is 36 (It also consider the space in them)
	            
	            char c = a.charAt(6); // accessing 6th element
	            
	            System.out.println(c);
	            
               char d = a.charAt(5); 
	            
	            System.out.println(d);  // it don't print any thing as its space 
	            
               char f = a.charAt(37);   // if you try to access the element that is not present in String data
	            
	            System.out.println(f);

	        }
	        catch(StringIndexOutOfBoundsException e) {
	            
	        	System.out.println("StringIndexOutOfBoundsException");
	        }
	    }

}
