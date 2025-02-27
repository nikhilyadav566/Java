import java.util.*;
public class continuequestion {
    public static void main(String args []){

        // Display all numbers entered by user except multiples of 10.


    Scanner sc = new Scanner (System.in);


    do{
    System.out.println("Enter your no. ");
    long num = sc.nextLong();
    if(num % 5 == 0 ){
        continue;
    }
    System.out.println("You have entered :- " + num);
    }while(true);
    }
}
    

