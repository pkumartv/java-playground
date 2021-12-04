package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/*
@FunctionalInterface
public interface Comparator<T> {

    int compare(T o1, T o2);
}
*/
public class ComparatorTest {

    public class User{
        String name;

        User(String name){
            this.name=name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return this.getName();
        }
        
    }
    public static void main(String[] args) {

        // comparator to compare strings of characters in a non-natural way: the shortest strings are lesser than the longest strings.
        Comparator<String> comparator= (s1,s2) -> Integer.compare(s1.length(), s2.length());

        //it is possible to chain and compose lambda expressions
        //Function<String,Integer> toLength= String::length;
        //Comparable<String> compatorFlavor2= (s1,s2) -> Integer.compare(toLength.apply(s1),toLength.apply(s2));

        Comparator<String> comparator3= Comparator.comparing(String::length);//.thenComparing(naturalOrder());

        ComparatorTest oneEnclosure= new ComparatorTest();
        //User one= oneEnclosure.new User("XXX");
        List<User> users= new ArrayList<>();
        users.add(oneEnclosure.new User("Pavan"));
        users.add(oneEnclosure.new User("Kiran"));
        users.add(oneEnclosure.new User("Shravs"));



        System.out.println(users);

        Comparator<User> byName= Comparator.comparing(User::getName);
        users.sort(byName);

        
        System.out.println("sorting by Name"+users);

        //users.sort(naturalOrder());
        
        List<Integer> intList= new ArrayList(){
            {
                add(1);
                add(2);
                add(-5);
                add(4);
                add(-1);
            }
            
        };
        Comparator<Integer> comparator4= (i1,i2) ->Integer.compare(i1, i2);
        Comparator<Integer> simplifiedComparator= Integer::compare;
        Comparator<Integer> naturalOrder = Comparator.naturalOrder();
        Comparator<Integer> naturalOrderNullsOrder= Comparator.nullsLast(naturalOrder());
        Comparator<Integer> naturalOrderNullsFirst= Comparator.nullsLast(naturalOrder());


        //List.of(1,2,3,4,5,5,6,7,9,-1);
        System.out.println("BEFORE: "+intList);
        intList.sort(simplifiedComparator);
        System.out.println("With SimplifiedComparator: "+intList);



       

    }
    // private static Comparator<? super User> naturalOrder() {
    //     return User.;
    // }
}
