// print no from 1 to n.
import java.util.*;

public class whileloop {
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your no.");
    long num = sc.nextLong();

    int a = 1 ;

    while(a<=num){
        System.out.println(a);
         a++;
    }
        sc.close();
}

}
