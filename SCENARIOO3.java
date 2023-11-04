package scenarioo3;
import java.util.Scanner;

public class SCENARIOO3 {

    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type your 1st number");
        double a = sc.nextDouble();
        System.out.println("Type your 2nd number");
        double b = sc.nextDouble();
        
        double c;
        c = a+b;
        
        System.out.println("Your 1st number is " +a);
        System.out.println("Your 2nd number is " +b);
        System.out.println("Total amount is " +c);
    }
    
}