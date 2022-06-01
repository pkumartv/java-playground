/*
SOURCE : https://dev.java/learn/creating-streams/
*/
package java8.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void main(String[] args) {

        // Print length of string in a list
        List<String> strings = List.of("one", "two", "three", "four");
        Function<String, Integer> toLength = String::length;
        // Stream<Integer> ints = strings.stream().map(toLength);
        List<Integer> ints = strings.stream().map(toLength).collect(Collectors.toList());

        System.out.println(ints);

        // Grouping
        // var map = strings.stream().collect(groupingBy(String::length, counting()));

        // Statistics in an IntStream
        IntSummaryStatistics stats = strings.stream().mapToInt(String::length).summaryStatistics();
        System.out.println("stats = " + stats);

        // Filtering a stream

        long count = strings.stream().map(String::length).filter(length -> length == 3).count();
        System.out.println(count);

        // Flatmapping a Stream to Handle 1:p Relations

        // Debugging Streams
        List<String> result = strings.stream().peek(s -> System.out.println("Starting With = " + s))
                .filter(s -> s.startsWith("t")).peek(s -> System.out.println("Filtered =" + s)).map(String::toUpperCase)
                .peek(s -> System.out.println("Mapped = " + s)).collect(Collectors.toList());

                System.out.println(result);


    //Empty Stream
    Stream<String> empty= Stream.empty();
    List<String> strings2= empty.collect(Collectors.toList());
    System.out.println(strings2);

        //Creating a Stream from a Supplier
    Stream<String> generated = Stream.generate(() -> "+");
    List<String> strings3=generated.limit(10L).collect(Collectors.toList());
    System.err.println(strings3);;


    //Creating a Stream from a UnaryOperator and a Seed
        Stream<String> iterated = Stream.iterate("+", s -> s + "+");
        iterated.limit(10L).forEach(System.out::println);

        //Starting Java9 optimization through a predicate

        Stream<String> iterated2= Stream.iterate("+", s -> s.length() <=10, s -> s + "+");
        iterated2.forEach(System.out::println);
    }

}
