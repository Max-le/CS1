import java.util.Scanner;

public class AbsoluteLie {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		boolean imGonnaLie = false ;
		if  ((Math.random() * 10) < 1) imGonnaLie = true ;

		boolean even ;
		if (number % 2 == 0 ) even = true; 
		else even = false;

		if (even && imGonnaLie) System.out.println("This number is odd...");
		if (even && !imGonnaLie)  System.out.println("This number is even");
		if (!even && imGonnaLie) System.out.println("This number is even...");
		if (!even && !imGonnaLie) System.out.println("This number is odd");

		
		
	}



}