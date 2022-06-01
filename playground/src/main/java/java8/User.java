package java8;

public interface User {

   default String getName(){
       return "name";
   }

}
