import java.util.*;

public class reversenobyWhile{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your no.");
        int num = sc.nextInt();

        int rev = 0;

        while(num>0){
            int lastdigit = num % 10;
             rev = (rev*10) + lastdigit;
                num = num/10;
        }
            System.out.println("Your rev no = "+ rev );
              sc.close();
    }
    
}
