public class math {
    public static void main(String[]args){
        double x = 3.14;
        double y = -10;

       double z = Math.max(x,y);   // Math.max()is used to get larger no. between two digits
       double k = Math.min(x,y);
       double a = Math.abs(y);   // abs means absolute value of y
       double b = Math.sqrt(x);  // sqrt means square root
       double c = Math.round(x);
       double d = Math.ceil(x);
       double e = Math.floor(x);

       System.out.println(z);
       System.out.println(k);
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
    }
    
}
