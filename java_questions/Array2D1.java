// Take a matrix as input from the user. Search for a given number xa and print the indices at which it occurs.
import java.util.Scanner;

public class Array2D1 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your rows and coulums := ");
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    int number[][] = new int[rows][columns];

   // input
   for(int i=0; i<rows; i++){
   for(int j=0; j<columns; j++){
    number[i][j] = sc.nextInt();
   }
   }
   int x = sc.nextInt();

   for(int i=0; i<rows; i++){
    for(int j=0; j<columns; j++){
        //compare with x
        if(number[i][j]==x){
            System.out.println("x found at location ("+ i + ","+ j +")");
        }
    }
   }
          sc.close();

  }     
}
