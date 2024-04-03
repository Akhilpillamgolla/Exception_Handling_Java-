package exceptionHandling;

public class Exceptionalhandling {

	public static void main(String[] args) {     //is executed by JVM
		method2(); 								// Depends on number of method we will have more lines in console 

	}

	public static void method2() {
		method1();
	}

	public static void method1() {

		int fnum = 10;
		int Lnum = 5;                     // if we give zero we get error. Program stops excn
		int result=0;
		try {
			 result = fnum/Lnum;        // the exception is written over here
		}
		catch (ArithmeticException a)            //a is variable , this execute only if we have any exception 
		{
		System.out.println(a.toString());	//printing exception details 
		System.out.println(a.getMessage());       //print msg only  //delete this line & see difference 
		System.out.println(a.getStackTrace());  //gives line number 
		throw a;                              // give exception to java & stop execution of program (if error is too much we use this)
		}
		finally {
			System.out.println("execute even if exception is there");
		}
		System.out.println("Output is " +result);  

	}
}
