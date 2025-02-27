// Write a function that takes in the radius as input and returns the circumference of a circle. 
import java.util.Scanner; 

public class circumfunction4 {
  public static Double printCircumference(Double radius){
     return  2*3.14*radius;
  }
  

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your radius of circle = ");
        Double radius = sc.nextDouble();

        System.out.println(printCircumference(radius));

        sc.close();

    }
}
