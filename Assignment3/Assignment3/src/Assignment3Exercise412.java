//Assignment 3 Exercise 4.12 Application that Calculates Product of Odd Integers from 1 to 15
public class ProductOfOdds {

	public static void main(String[] args) {
		System.out.println("Amarachi Mazariegos - Assignment 3 Exercise 4.12\n");
		int oddintegerscount = 0; 
		int product = 1; 
			for (oddintegerscount = 1; oddintegerscount <= 15 ; oddintegerscount+=2) {
			product *= oddintegerscount;
	    }
		
		System.out.printf("The product of odd integers from 1 to 15 is %d%n", product); // Prints out the calculations
	} 
} 
  
