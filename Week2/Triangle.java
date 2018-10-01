import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		
		// Initialise a Scanner to read from the command line
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please type the width :");
		
		// Collect the input
		int width = in.nextInt();

		System.out.println("Please type the height :");
		int height = in.nextInt();
		double area = (height*width)/2;

		
		// Give some output;
		System.out.println("This is your number: " + area);
		
	}

}