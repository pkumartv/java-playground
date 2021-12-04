package java8;

import java.util.function.BiPredicate;

/*
@FunctionalInterface
public interface BiPredicate<T, U> {

    boolean test(T t, U u);

    // default methods removed
}
*/
public class BiPredicateTest {
 
    static BiPredicate<String,Integer> isOfLength = (word,length) -> word.length() == length;
    public static void main(String[] args) {
        
        String word="myw";
        int length=3;
        System.out.println("Test for String is: "+ isOfLength.test(word, length));
    }
}
