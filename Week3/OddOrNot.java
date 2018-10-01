import java.util.Scanner;

public class OddOrNot {
	
	public static void main(String[] args) {
		
		// Initialise a Scanner to read from the command line
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		
		if (number % 2 == 0 ) System.out.println("This number is even");
		else System.out.println("This number is odd");
		
	}

}