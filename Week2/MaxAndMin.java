import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Type 5 numbers : ");

    	int n1 = in.nextInt();
    	int n2 = in.nextInt();
    	int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();

    	int max = Math.max(maxOf3(n1,n2,n3),maxOf3(n3,n4,n5));
        int min = Math.min(minOf3(n1,n2,n3), minOf3(n3,n4,n5));


        System.out.println("------\n The biggest number is : "+max);
        System.out.println("The smallest number is : "+min);


    }

    public static int maxOf3(int r, int s, int t) {

    	if (Math.max(r, s) < t) return t;
            
        else  return Math.max(r,s);
             
            }
    
    public static int minOf3(int r, int s, int t) {
    	if (Math.min(r,s) < t) return Math.min(r,s) ;
    	else return t;
    }
    
}