/* The scanner class if found in the java utility package library and we need to import that 
 * before we can use the scanner so outside of the class at the top of the program that is 
 * going to type import java.util.scanner;
 */


import java.util.Scanner;    
public class input {
    public static void main(String[]args){

    Scanner scanner = new Scanner (System.in);    //Scanner is used to take input 
                    //    ( second scanner) is the name for Scanner here can be use other variable after scanner
    System.out.println("What is your name? ");
    String name = scanner.nextLine();   // In nextLine (L) should be always capital there should be
     // space between next and Line.
     System.out.println("How old are you? ");
     int age = scanner.nextInt();

     scanner.nextLine();
     System.out.println("What is your favourite food? ");
     String food = scanner.nextLine();
      
     System.out.println("What is your hobbies? ");
     String hobbies = scanner.nextLine();

    System.out.println("Hello "+ name);
     System.out.println("You are "+age+" years old");
     System.out.println("you like "+food+"food");
     System.out.println("your hobbies are to "+hobbies);

     scanner.close();

    }
}
