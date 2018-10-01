import java.util.Scanner;

public class Dice {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello ! Enter a number.");
		int sides = in.nextInt();
		double random = Math.random() * sides ; 
		System.out.println((int)random);





	}
}