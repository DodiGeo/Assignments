
package bmi;
import java.util.Scanner;
 
public class BMI {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.print("Enter your Height: ");
    	double h = sc.nextDouble();
    	System.out.print("Enter your Weight: ");
    	double w = sc.nextDouble();
    	
    	double c = h * h;
    	double d = w / c;
    	double e = Math.round(d);
    	
    	if (e>=50) {
    		System.out.println("You're  super obese");
    	}
    	else if(e>=40) {
    		System.out.println("You're morbid obese");
    	}
    	else if(e>=35) {
    		System.out.println("You're severe obese");
    	}
    	else if(e>=25) {
    		System.out.println("You're overweight");
    	}
    	else if(e>=18.5) {
    		System.out.println("You're normal");
    	}
    	else {
    		System.out.println("You're underweight");
    	}
    	
    	
    	
    
    	System.out.println("Your BMI: "+e);
    	
    	
    	
    	
    }
}