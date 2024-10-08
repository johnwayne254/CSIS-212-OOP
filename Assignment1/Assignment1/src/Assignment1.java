//CSIS 212 - D01
import javax.swing.JOptionPane;
import java.util.Scanner; 

public class Assignment1 {
//main method execution
	public static void main(String[] args)
	{ 
		System.out.println("Amarachi Mazariegos - CSIS 212\n"); // Heading
		
		//Program 1
		//5 Different sentences of technology being used to win souls for Jesus Christ
		System.out.println("Social media platforms have allowed us to reach a global audience with the message of Christ.");
		System.out.println("Websites provide a space for sharing sermons, devotionals, and other spiritual resources.");
		System.out.println("Online streaming services enable live broadcasts of church services to those unable to attend in person.");
		System.out.println("Mobile apps offer daily scriptures, prayers, and inspirational messages to users.");
		System.out.println("Email newsletters keep the congregation informed and spiritually engaged throughout the week.\n");
	    
		//Program 2
		//Request user's name
		String name = JOptionPane.showInputDialog("What is your name?");
		
		//create the message
		String message = String.format("Welcome, %s, To The Liberty University Website!\n The Scripture for the day is : Matthew 6:11", name);
		
		//display message
		JOptionPane.showMessageDialog(null, message);
		
		//Program 3
		//a Use 1 println statement
		System.out.println("1 2 3 4");
		
		//b Use 4 print statements
		System.out.print("1");
		System.out.print(" 2");
		System.out.print(" 3");
		System.out.print(" 4");
		
		//c Use 1 printf statement
		System.out.printf("%n%s %s %s %s%n", 1, 2, 3, 4);
		
		//Program 4
		
		// create a Scanner to obtain input from command window
		// Define variables as integers
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int sum;
		int product;
		int difference;
		int quotient;
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); //read first number from user
		
		System.out.print("Enter second interger: "); //prompt
		number2 = input.nextInt();//read second number from user
		
	    //Operations involving earlier defined integers
		sum = number1 + number2; 
		product = number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;
		
		//Print our operational findings
		System.out.printf("Sum is %d%n", sum); // display sum
		System.out.printf("Product is %d%n", product); // display product
		System.out.printf("Difference is %d%n", difference); // display difference
		System.out.printf("Quotient is %d%n", quotient); // display quotient
		
		//Program 5
		
		//Is the first number a multiple of the second
		
		//If there are no remainders
        if (number1 % number2 == 0) {
        	System.out.printf("%d is a multiple of %d", number1,number2);
        }
        
        //If there are remainders
        if (number1 % number2 != 0) {
        	System.out.printf("%d is not a multiple of %d", number1,number2);
        }
        	
		}
}
