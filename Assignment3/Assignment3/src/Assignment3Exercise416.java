import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        System.out.println("Amarachi Mazariegos - Assignment 3 Exercise 4.16 Bar Chart Printing Program \n"); // Heading

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Read 5 numbers between 1 and 30
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Enter number " + (i + 1) + " (between 1 and 30): ");
                numbers[i] = scanner.nextInt();
            } while (numbers[i] < 1 || numbers[i] > 30);
        }

        // Display bar chart
        for (int number : numbers) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
