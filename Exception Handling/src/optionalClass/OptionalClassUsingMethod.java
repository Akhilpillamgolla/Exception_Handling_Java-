package optionalClass;

import java.util.Optional;

public class OptionalClassUsingMethod {

	public static Optional<String> getName(){
		String name ="Akhil Pillamgolla";     // Give  nuLL to see Difference
		System.out.println(name);
		return Optional.ofNullable(name);
	}
	
	public static void main(String[] args) {

		String str1 = "Apple"; 
		Optional<String> opt = Optional.ofNullable(str1);
		
		
		Optional<String> nameOptional = getName();
		System.out.println(nameOptional.orElse("null returns"));  // if name is null then it print null return
	}

}
