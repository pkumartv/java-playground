package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
@FunctionalInterface
public interface Function<T, U> {

    R apply(U u);

    // default and static methods removed
}
//Functions are used in the Stream API to map objects to other objects
A predicate can be seen as a specialized type of function, that returns a boolean.
*/

public class FunctionalTest {
    public static void main(String[] args) {
        Function<String,Integer> toLenght= s ->s.length();
        String word= "This is a long string";
        int length= toLenght.apply(word);

        //Ex2
        List<String> strings= Arrays.asList("One","two","three","founr");
        UnaryOperator<String> toUpperCase= s -> s.toUpperCase();
        strings.replaceAll(toUpperCase);
        System.out.println(strings);
        
        
    }
}
