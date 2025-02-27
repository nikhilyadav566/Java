// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;

public class greatfunction3 {
  public static int calculateGreater(int first, int second){
    if (first>second){
        return first ;
    }else{
       return second;
    }
  }
     




    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first no.= ");
    int first = sc.nextInt();
    System.out.print("Enter your second no.= ");
    int second = sc.nextInt();

    System.out.println("This  " +calculateGreater(first,second)+"  is greater than other");
    
        sc.close();
  }
}
