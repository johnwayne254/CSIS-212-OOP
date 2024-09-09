import java.util.Scanner;

public class Assignment3Exercise416 {
    public static void main(String[] args) {
        System.out.println("Amarachi Mazariegos - Assignment 3 Exercise 4.16 Bar Chart Printing Program \n");

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int fivenumbers = 0;

        System.out.println("Enter five numbers between 1-30:");

        // Read 5 numbers between 1 and 30
        while (fivenumbers < 5) {
            int inputinteger = input.nextInt();
            if (inputinteger >= 1 && inputinteger <= 30) {
                numbers[fivenumbers] = inputinteger;
                fivenumbers++;
            } else {
                System.out.println("You need to pick a number between 1 and 30.");
            }
        }

        // Display bar chart
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
