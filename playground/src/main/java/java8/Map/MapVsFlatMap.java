package java8.Map;

import java8.Customer;
import java8.EkartDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Customer> customerList= EkartDatabase.getAll();

        //List<Customer> to List<String>
//Map tramsforms data from Stream to Stream
       List<String> emailIds= customerList
           .stream()
           .map(Customer::getEmail)
           .collect(Collectors.toList());

        System.out.println(emailIds);

        //flat map falttens the map
        //one to many mapping
        //transforms data from Stream<Stream> to Stream
       List<String> phoneNumbersFlatMap= customerList.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbersFlatMap);
    }
}
