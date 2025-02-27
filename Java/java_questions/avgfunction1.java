// Enter 3 numbers from the user & make a function to print their aberage by the return type.
import java.util.Scanner;

public class avgfunction1 {
   public static int calculateAvg(int first,int second,int third){
    int avg = (first+second+third)/3;
     return avg;
   }



    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter your first no = ");
    int first = sc.nextInt();
    System.out.print("Enter your second no = ");
    int second = sc.nextInt();
    System.out.print("Enter your third no = ");
    int third = sc.nextInt();
     


     int avg =calculateAvg(first,second ,third);
     System.out.print("your average no is = "+avg);
         
       sc.close();
    }
}
