// Take an array as input from the user. Search for a given number x and print the index at which it occurs.
import java.util.Scanner;

public class Array1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size of array  = ");
        int size = sc.nextInt();
        int number[] = new int[size];
           
        // input

        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        // output

        /*  for(int i=0; i<size; i++){
            System.out.println(number[i]);
        } */


        for(int i=0; i<number.length; i++){
           if(number[i]==x){
            System.out.println("x found at index : "+i);
           } 
        } 
                sc.close();
    }
}