	package exceptionHandling;

public class ExceptionTypes {

	public static void main(String[] args) {
		
		/*
		 * Common Scenarios of Java Exceptions:
		 * 
		 * 
		 * 1) ArithmeticException occurs:
		 * 
		 * If we divide any number by zero, there occurs an ArithmeticException.
		 * 
		 * ex:int a=50/0;//ArithmeticException
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 2) NullPointerException occurs:
		 * 
		 * 
		 * 
		 * If we have a null value in any variable
		 * 
		 * 
		 * String s=null; System.out.println(s.length()); //NullPointerException
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 3) NumberFormatException occurs:
		 * 
		 * 
		 * 
		 * 
		 * If the formatting of any variable or number is mismatched, it may result into
		 * NumberFormatException. Suppose we have a string variable that has characters;
		 * converting this variable into digit will cause NumberFormatException.
		 * 
		 * 
		 * 
		 * 
		 * String s="abc"; int i=Integer.parseInt(s);//NumberFormatException
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 4) ArrayIndexOutOfBoundsException occurs:
		 * 
		 * 
		 * 
		 * 
		 * When an array exceeds to it's size, the ArrayIndexOutOfBoundsException
		 * occurs. there may be other reasons to occur ArrayIndexOutOfBoundsException.
		 * Consider the following statements.
		 * 
		 * 
		 * 
		 * int a[]=new int[5]; a[10]=50; //ArrayIndexOutOfBoundsException
		 * 
		 * 
		 * 5) ClassNotFoundException:
		 * 
		 *  When there is a mismatch in class. we will have this exception.
		 * 
		 * 
		 */
	}
}
