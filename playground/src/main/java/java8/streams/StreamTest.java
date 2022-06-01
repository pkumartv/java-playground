package java8.streams;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Performance comparision between for loop, streams and parallel streams.
*/
public class StreamTest{

    public static void main(String[] args) {
        Integer [] myInt= new Integer[300];

        //Initialize
        int count=0;
        for (int i=0;i<myInt.length;i++) {
            myInt[i]= count++;  
            System.out.print(""); 
        }
        
       
        //BLOCK1 NORMAL 
        Long startTime= System.currentTimeMillis();
        for(int i=0;i<myInt.length;i++){
            
           myInt[i]=myInt[i]++;
           // System.out.println("Interger at "+i+ " is "+myInt[i]);
        }
        Long endTime= System.currentTimeMillis();
        Long timeTake= endTime-startTime;
        System.out.println("Time take for for loop is "+timeTake);

        //k=0;
        //BLOCK2 Streams sequqnetial
        startTime= System.currentTimeMillis();
       // int i;
       myInt = new Integer[0];
        Arrays.stream(myInt).forEach(
            (one) -> //System.out.println(one) 
            {
                one++;
                System.out.print(""); 
            }

        );
        endTime= System.currentTimeMillis();
        timeTake= endTime-startTime;
        System.out.println("Time take for streams is "+timeTake);


        //BLOCK3 parallel streams
        

               // int i;
               startTime= System.currentTimeMillis();
               Arrays.stream(myInt).parallel().forEach(
                (one) -> //System.out.println(one) 
                {
                  one++;
                  System.out.print(""); 
                }
    
            );
            endTime= System.currentTimeMillis();
            timeTake= endTime-startTime;
            System.out.println("Time take for parallel streams is "+timeTake);



    }
}