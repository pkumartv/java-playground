package corejava.interviews.simple;

class Test 
{ 
    public static void main (String args[])  
    { 
        System.out.println(10 + 20 + "Javatpoint");  
        System.out.println("Javatpoint" + 10 + 20); 


//30Javatpoint
//Javatpoint1020
//In the first case, 10 and 20 are treated as numbers and added to be 30. 
//Now, their sum 30 is treated as the string and concatenated with the string Javatpoint. 
//Therefore, the output will be 30Javatpoint.
//In the second case, the string Javatpoint is concatenated with 10 to be the string Javatpoint10 which will then be concatenated with 20 to be Javatpoint1020.


        System.out.println(10 * 20 + "Javatpoint");  
        System.out.println("Javatpoint" + 10 * 20); 


//200Javatpoint
//Javatpoint200
//In the first case, The numbers 10 and 20 will be multiplied first and then the result 200 is treated as the string and 
//concatenated with the string Javatpoint to produce the output 200Javatpoint.
//In the second case, The numbers 10 and 20 will be multiplied first to be 200 because the precedence of the multiplication 
//is higher than addition. The result 200 will be treated as the string and concatenated with the string Javatpointto produce the output as Javatpoint200.

