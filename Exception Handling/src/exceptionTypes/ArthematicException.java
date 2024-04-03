package exceptionTypes;

public class ArthematicException {

	public static void main(String args[])
    {
        try {
            int a = 58, b = 0;
            int c = a/b;                     // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
}
}