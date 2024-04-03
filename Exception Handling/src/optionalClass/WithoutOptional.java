package optionalClass;

public class WithoutOptional {

	public static void main(String[] args) {
		/*
		 * String str = null; 
		 * System.out.println(str.length()); // we can't find length
		 * we will get exception
		 */

		String st = null;
		
		if (st == null) {
			System.out.println("This is a NullObject We will Get NullPointer Exception");
		} else
			System.out.println(st.length());
	}

}
