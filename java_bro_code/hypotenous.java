// To find the hypotenous of a tringle

import java.util.Scanner;

public class hypotenous {
    public static void main(String[]args){
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first side of triangle ");
         a = scanner.nextDouble();

        System.out.println("Enter second side of triangle ");
         b = scanner.nextDouble();


        c = Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse is : "+c);

        scanner.close();


    }
    
}
