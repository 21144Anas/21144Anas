package lab1;

import java.util.Scanner;

public class AreaOfCricle {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter the Radius");
		double radius = sc.nextDouble();
    	double area =Math.PI*(radius*radius);
    	System.out.println("The area of circle is : "+ area);
    	double circumference= Math.PI * 2*radius;
    	System.out.println( "The circumference of the circleis:"+circumference) ;
    			
    	
		
		
	}

}
