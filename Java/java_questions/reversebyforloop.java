import java.util.*;

public class reversebyforloop {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
    
        System.out.println("Enter your no .");
        int num = sc.nextInt();

        int rev = 0;

        for(int n = 0; num > n; num = num/10 ){
                int lastdigit = num % 10 ;
                rev = (rev * 10) + lastdigit;
                
        }
            System.out.println("Your reverse no = "+ rev);
                sc.close();

            // and next 
                    int x = 5463;
                    int rev1 = 0;

                    for(int k = 0; x > k; x = x/10){
                           int lastdigit = x % 10;
                           rev1 = (rev1 * 10) + lastdigit;
                        }
                            System.out.println( "Your rev no = " + rev1);
        }
    }

