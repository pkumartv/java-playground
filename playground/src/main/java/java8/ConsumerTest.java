package java8;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/* 
A consumer does the opposite of an supplier it takes and argument and returns nothing.

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);

    // default methods removed
}
*/
public class ConsumerTest {

    class Product {
        int price;

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        String productName;
    }

    static Consumer<String> consumer = s -> System.out.println("OK: argument: "+s);

    // Or easier way is //method reference
     Consumer<String> simplifiedConsumer = System.out::println;

    // Ex for Variable used in lambda expression should be final or effectively
    // final
    // The reason is the following: lambdas cannot modify variables defined outside
    // their body.
    // They can read them, as long as they are final, that is, immutable.
    // This process of accessing variable is called capturing: lambdas cannot
    // capture variables, they can only capture values.
    // A final variable is in fact a value.
    // int calculateTotalPriceForProducts(List<Product> products) {

    //     int totalPrice = 0;
    //     Consumer<Product> consumer = product -> totalPrice += product.getPrice();
    //     for (Product product : products) {
    //         consumer.accept(product);
    //     }

    // }

    static Consumer<String> printer = s -> System.out.println(s);

    public static void main(String[] args) {
        consumer.accept("Test");;
        Random random = new Random(314L);
        for(int i=0;i<5;i++){
            int nextRandom= random.nextInt(10);
            printer.accept("next random is: "+nextRandom);

        }

        List ok = List.of("Pavan","Patri");
        //ok.stream().filter( t -> sop).ma;



        

    }
}
