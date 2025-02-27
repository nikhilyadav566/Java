// print the sum of n natural number.
import java.util.*;

public class whileloop2 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your no.");
        long num = sc.nextLong();

        int a = 1 ;
        long sum = 0;

        while(a<=num){
            sum = sum+a ;
               a++;
        }
              System.out.println("Sum of " +num + " = " +sum);
              sc.close();
    }
    
}
