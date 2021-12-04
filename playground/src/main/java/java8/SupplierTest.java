package java8;

import java.util.Random;

import com.google.common.base.Supplier;

// @FunctionalInterface
// public interface Supplier<T> {

//     T get();
// }
public class SupplierTest {

    static Supplier<String> supplier = () -> "Its a supplier with only a get method and no arguments";
    public static void main(String[] args) {
        System.out.println(supplier.get());

        Random random = new Random(314L);
        Supplier<Integer> newRandom= () -> random.nextInt(10);

        for(int i=0;i<5;i++){
            System.out.println(newRandom.get());
        }

        /* To avoid autoboxing here since random give an int we can 
        * use IntSupplier and this is faster.
        */
    }
    
}
