  import java.util.Scanner;

public class incometaxCalculator {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Enter your income = ");
    double income = sc.nextDouble();
    int tax;
    if(income<500000){
        tax =(int) (income);
        System.out.println(" 0% tax will be levied as per your income "+"Rs.0");

         sc.nextLine();
         
        System.out.println("Do you want to know how much money left ");
        String leftmoney = sc.nextLine();
   
        switch(leftmoney){
               case "yes":  System.out.println("You have only Rs."+ (income - 0) +" left:");
               break;
               case "no":   System.out.println("Thank You");
               break;
               default :    System.out.println("Sorry I can't understand your language");
        }
        sc.close();
    }
    
    
    else if(income>=500000 && income <=1000000){
        tax = (int)(income*0.2);
        System.out.println("20% tax will be levied as per your income "+ "Rs."+tax);

            sc.nextLine();

        System.out.println("Do you want to know how much money left ");
        String leftmoney = sc.nextLine();
       
        switch(leftmoney){
             case "yes": System.out.println("You have only Rs."+ (income - tax) +" left:");
             break;
             case "no":  System.out.println("Thank You");
             break;
             default :   System.out.println("Sorry I can't understand your language");
        }
            sc.close();
    }



    else if(income>1000000){
        tax = (int)(income*0.3);
        System.out.println("30% tax will be levied as per your income "+"Rs."+ tax);

        sc.nextLine();
        System.out.println("Do you want to know how much money left ");
        String leftmoney = sc.nextLine();
           
        switch(leftmoney){
               case "yes": System.out.println("You have only Rs."+ (income - tax) +" left:");
               break;
               case "no":  System.out.println("Thank You");
               break;
               default :   System.out.println("Sorry I can't understand your language");
            }
                sc.close();
            }
    else{
        System.out.println("Sorry ! I can't find");
    }
            sc.close();
    }
}