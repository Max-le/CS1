import java.util.Scanner;
public class Exercise  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a word");
		String word = sc.next();
		sc.nextLine();
		System.out.println("Type a number");
		int n = sc.nextInt();
		for (int i = 0;i < n ;i++ ) {
			System.out.println(word);
			
		}
	}
}