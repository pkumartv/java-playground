package java8.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> noVal= Optional.empty();
		Optional<String> hasVal=Optional.of("abcdef");
		
		if(noVal.isPresent())
			System.out.println("This wont be printed");
		else
			System.out.println("This will be printed");

		if(hasVal.isPresent())
			System.out.println("The String  in hasVal is: "+hasVal.get());
		
		String defStr= noVal.orElse("HAHA");
		
		System.out.println(defStr);
	}

}
