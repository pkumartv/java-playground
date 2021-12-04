package java8;

import java.util.function.Predicate;
/*
@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    // default and static methods removed
}
*/
public class PredicateTest {

    static Predicate<String> predicate= (String s)  -> {
        return s.length() ==3;

    };

    //Simplified version of the above
    static Predicate<String> simplifiedPredicate= s -> s.length()==0;
    public static void main(String[] args) {

        //Calling predicate
       System.out.println(predicate.test("OK1"));
        
    }
}
