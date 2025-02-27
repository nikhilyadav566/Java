/* Write a fuction that takes in age as input and returns if that person is eligible to vote
    or not .A person of age > 18 is eligible to vote. */

    import java.util.Scanner;

public class eligiblefunction5 {
  public static int printEligible(int age){
    if(age>18){
        System.out.println("your are eligible to vote");
    }else{
        System.out.println("you are not eligible to vote");
    }
    return (age);
  }



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age = ");
            int age = sc.nextInt();

           printEligible(age);

           sc.close();
    }
}
