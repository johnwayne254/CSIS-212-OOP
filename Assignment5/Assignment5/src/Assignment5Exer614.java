import java.security.SecureRandom; //import java package to generate random numbers
public class Assignment5Exer614 {

	public static void main(String[] args) { //main
		System.out.println("Amarachi Mazariegos - Assignment 5 Exercise 6.14 Variable-Length Argument \n"); // Heading
		SecureRandom randomNumbers = new SecureRandom(); 
		
		int[] array = new int[10]; 		
		
	
		System.out.printf("%s%10s%n", "Calls","Products"); 
		for (int counter = 0; counter < array.length; counter++) { //Loop up to array number length
			array[counter] = (1 + randomNumbers.nextInt(9)) * (1 + randomNumbers.nextInt(9)); //Utilize the product of integers
			//output each array element's value
			System.out.printf("%5d%8d%n", counter, array[counter]); 
		} 
	}
} 
