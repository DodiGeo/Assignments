
package scenarioo5;
import java.util.Scanner;

public class SCENARIOO5 {
    private static int c;

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your first number: ");
        int a = sc.nextInt();
        System.out.println("Type your second number: ");
        int b = sc.nextInt();
       
        
        c = a-b;
        
        if(a < b) {
        	System.out.println("The result is invalid");
        }
        else {
        	System.out.println("Total:"+c);
        }
	
	}
}

