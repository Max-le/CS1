import java.util.Scanner;


public class Recursion {




	public static int recursion(int n, int steps){

		//Base step
		if (n == 1 ){
	 	System.out.println("number of steps : " + steps);
		 return 1 ;

		}


		//Recursion
		else
			steps++;
			if (n%2==0) {

				//divideby2
				System.out.println(n);
				 return n = recursion((n/2),steps) ;

			}
			else {

				System.out.println(n);
				//multiply by 3, add 1
				return n = recursion((n*3)+1, steps);


			} 

		}

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int steps = 0 ; 
		recursion(number, steps);
		//value returned here will be the number of steps.
	}

}


