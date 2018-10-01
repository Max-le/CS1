
import java.util.Scanner;

public class Prime {	



public static void main(String[] args) {
	System.out.println("Type a positive integer.");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	System.out.println("This number is prime : "+checkPrime(number));
	System.out.println("Cool, now let's count the number of prime -> 10000.");

	int counter = 0 ;
	for (int i = 2; i <=10000 ;i++ ) {
		if (checkPrime(i)) counter++;	
	}
	System.out.println("Done. There is "+counter+" prime numbers between 0 and 10000.");



}


//Method return true if input number is prime
public static boolean checkPrime(int x){

	//Trying to divide x by every number between 2 and x 

	for (int i = 2; i <= x; i=i+1){
		//nSystem.out.println("Trying to divide by "+i);
		if ((x % i == 0)&& (x != i))  {
		return false;

		}
	}
	return true;
}


}