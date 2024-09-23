import java.lang.reflect.Array;
import java.security.SecureRandom;  
public class Assignment5Exer617 {
	
	public static void main(String[] args) {
		System.out.println("Amarachi Mazariegos - Assignment 5 Exercise 6.17 Dice Rolling \n"); 
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = new int[7];
		int face1 = 0; 
		int face2 = 0; 
		int rolls;
		int totals = 0; 
		int freq2 = 0;
		int freq3 = 0;
		int freq4 = 0;
		int freq5 = 0;
		int freq6 = 0;
		int freq7 = 0;
		int freq8 = 0;
		int freq9 = 0;
		int freq10 = 0;
		int freq11 = 0;
		int freq12 = 0;
		
		for (rolls = 1; rolls <= 36000; rolls++) {
			++frequency[1 + randomNumbers.nextInt(6)];  
			face1 = 1 + randomNumbers.nextInt(6); 
			face2 = 1 + randomNumbers.nextInt(6); 
			totals = face1 + face2; 
			System.out.printf("\n%s%7s%15s%n", "Die 1", "Die 2", "Sum of Dice"); 
			System.out.printf("%3d%7d%12d%n", face1, face2, totals); 
		
		switch (totals) {
		case 2:
			++freq2;
			break;
		case 3:
			++freq3;
			break;
		case 4:
			++freq4;
			break;
		case 5:
			++freq5;
			break;
		case 6:
			++freq6;
			break;
		case 7:
			++freq7;
			break;
		case 8:
			++freq8;
			break;
		case 9:
			++freq9;
			break;
		case 10:
			++freq10;
			break;
		case 11:
			++freq11;
			break;
		case 12:
			++freq12;
			break;			
		} 
	} 
		
		int[] sumarray = {freq2, freq3, freq4, freq5, freq6, freq7, freq8, freq9, freq10, freq11, freq12};
		int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};		
		
		System.out.printf("\n%15s\t%15s", "Sum of Dies", "Number of Frequencies");
		
		for (int countingup = 0; countingup < sumarray.length; countingup++)
		System.out.printf("\n%10d\t%14d%n", numbers[countingup], sumarray[countingup]); 

	}

}
