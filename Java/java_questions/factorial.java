import java.util.*;

public class factorial {
    public static void main(String args[]){

// Find the factorial 

Scanner sc = new Scanner (System.in);

System.out.println("Enter your no. = ");
int n = sc.nextInt();
int fact = 1;

for(int a = 1; a <= n ; a++){
fact = fact * a;
//System.out.println("Factorial of "+n+(" = ") + fact);

}

System.out.println("Factorial of "+n+(" = ")+ fact);
        sc.close();
    }
}
