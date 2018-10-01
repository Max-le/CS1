import java.util.Scanner;

public class SpeedLight {
	
	public static void main(String[] args) {
		
		// Initialise a Scanner to read from the command line
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please type your clock speed ( in GHz )  : ");
		
		// Collect the input
		double clockspeed = in.nextDouble();
		double c = 299792.458;
		double result = (clockspeed/1000000000)*c;



		
		// Give some output;
		System.out.println("\n During 1 cycle, light travels "+result+" kilometers.");
		
	}

}