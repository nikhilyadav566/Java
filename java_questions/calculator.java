import java . util.*;

public class calculator{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your first no.");
        double first = sc.nextDouble();
        System.out.println("Enter your second no.");
        double second = sc.nextDouble();
          

        System.out.println("Choose your operator ( +,-,*,/,%)");
        char Operator = sc.next().charAt(0);
            

        switch(Operator){
            case '+': System.out.println("Add = "+(first+second));
            break;
            case '-': System.out.println("Sub = "+(first-second));
            break;
            case '*': System.out.println("Multi = "+ (first*second));
            break;
            case '/': System.out.println("Div = "+(first/second));
            break;
            default : System.out.println("Sorry ! It is not too much advanced ");
        }
            System.out.println();

            sc.close();
    }

    }
