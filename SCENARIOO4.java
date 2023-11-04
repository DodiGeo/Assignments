
package scenarioo4;
import java.util.Scanner;

public class SCENARIOO4 {
    private static int c;


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type first number: ");
        int a = sc.nextInt();
        System.out.println("Type second number: ");
        int b = sc.nextInt();
       
        
        c = a-b;
        
        if(a > b) {
        	System.out.println("The difference between the two number is: "+c);
        }
        else {
        	System.out.println("The first number is not greater than second");
        }
	
	}
}