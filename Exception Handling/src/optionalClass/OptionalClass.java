package optionalClass;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		String str ="Java Buddy Mentoring";
		System.out.println(str.length());  // we get length including  spaces
		
		String str1 = null;
 		
		Optional<String> opt = Optional.ofNullable(str1);  //  Return empty box but not null Exception
 		
 		System.out.println(opt.isPresent());   //if null then false else True
//		System.out.println(opt.get());        //Retrieve the data
		System.out.println(opt.orElse("If no value Present in String only this will Print"));
		System.out.println(opt.isEmpty());  
	
		
	} 
}
