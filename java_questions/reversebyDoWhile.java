import java.util.*;

public class reversebyDoWhile {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your no. ");
        int num = sc.nextInt();

        int n = 0;
        int rev = 0;

        do{
        
        int lastdigit = num % 10;
         rev = (rev * 10) + lastdigit;
        
         num = num / 10 ;

        }while( num > n);

        System.out.println("Your reverse no. = "+ rev);
            sc.close(); 
    }
}
