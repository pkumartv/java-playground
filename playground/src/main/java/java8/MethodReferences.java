package java8;

import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class MethodReferences {
    
    public static void main(String[] args) {
        
        

        String test="GraphQLObjectType{name='Account', description='null', fieldDefinitionsByName=[nodes, pageInfoAccount], interfaces=[]}";

       String[] newone= test.split("[\\=,']");
       System.out.println("XXX "+ newone.toString());
        Consumer<String> printer = s -> System.out.println(s);
        Consumer<String> simplifiedPrinter = System.out::println;



        //Static Method References
        DoubleUnaryOperator sqrt = a -> Math.sqrt(a);
        DoubleUnaryOperator simplifiedSqrt = Math::sqrt;

        //A static method reference may take more than one argument. Consider the following code:
        IntBinaryOperator max = (a,b) -> Integer.max(a, b);

        IntBinaryOperator simplifiedMax = Integer::max;
        //Static Method References END

        

        //Writing Unbound Method References BEGIN
        Function<String,Integer> toLength= s -> s.length();
        Function<String,Integer> simplifiedToLength= String::length;

        Function<User, String> getName = user -> user.getName();
        Function<User, String> simplifiedGetName = User::getName;

        //Writing Unbound Method References END

    }
}
