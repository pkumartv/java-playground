package java8.optional;

import java8.Customer;

import java.util.ArrayList;
import java.util.List;
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

        //Customer Demo
        Customer customer = new Customer(999,"Pavan",null,List.of("12234", "423423"));

        System.out.println(noVal);

        //Optional<String>  emailOptional2= Optional.of(customer.getEmail());
        //System.out.println(emailOptional2);
        Optional<String> emailOptional= Optional.ofNullable(customer.getEmail());

//        if(emailOptional.isPresent()){
//            System.out.println("Present");
//            System.out.println(emailOptional.get());
//        }
//        else
//            System.out.println("Not Present");
//

        System.out.println(        emailOptional.orElse("NOVALUE"));
        System.out.println(emailOptional.orElseThrow(IllegalArgumentException::new));
	}

}
