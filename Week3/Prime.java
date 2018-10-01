import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		// Initialise a Scanner to read from the command line
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		// true if number is an integer 
		if (number == (int)number) {

			if ((number > 0) && (number < 21)) {
				System.out.println("Number is OK...");
				System.out.println("Your number is prime : " + checkPrime(number));


			}
			else System.out.println("Please type a number between 0 and 20.");


		}
		else System.out.println("This number isn't an integer !");
		
		
	}

	//Method return true if input number is prime
	public static boolean checkPrime(int x){
		//Trying to divide x by every number between 2 and 20

		System.out.println("Running loop...");

		for (int i = 2; i <= 20; i=i+1){
			//nSystem.out.println("Trying to divide by "+i);
			if ((x % i == 0)&& (x != i))  {
			return false;

			}
		}
		return true;
	}

}