package exceptionTypes;

public class Numberformat {
	
	public static void main(String args[])
    {
        try {
            // "akiMowa" is not a number
            int num = Integer.parseInt ("akiMowa") ; // its not integer value right 
 
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }

}
