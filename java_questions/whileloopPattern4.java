import java.util.Scanner;

public class whileloopPattern4 {
    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your no. to print star row pattern ");
            int num = sc.nextInt();
           
            int a = 1; 

             while( a<=num){
                System.out.println("* * * * ");
                    a++;
             }
             sc.close();
    }
}
