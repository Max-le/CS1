import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		// Initialise a Scanner to read from the command line
		Scanner in = new Scanner(System.in);
		
		System.out.println("type an number :  ");
		
		double a = in.nextDouble();

		System.out.println("type an second number :  ");

		double b = in.nextDouble();		

		System.out.println(a +" "+ b );

		//Switching values using a third variable
		double c = a ;
		a = b ;
		b = c ;
		System.out.println(a +" "+ b );






		
	}

}