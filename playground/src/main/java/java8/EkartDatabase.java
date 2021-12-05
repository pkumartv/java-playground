package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {

    public static List<Customer> getAll()
    {
        return Stream.of(
            new Customer(101,"john","john@gmail.com", Arrays.asList("123445","423423")),
            new Customer(102,"smith","smith@gmail.com", Arrays.asList("98786767","76576765")),
            new Customer(103,"peter","peter@gmail.com", Arrays.asList("54544353","867867")),
            new Customer(104,"john","john@gmail.com", Arrays.asList("4745645745","534543"))
        ).collect(Collectors.toList());

    }
}
