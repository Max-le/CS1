import java.util.Scanner;
import java.util.Arrays;


public class MinMax{


	public static int[] find(int[] list, int goal){
	//Base step 
		if (list.length == 1 ){

			if (list[0] == goal) {
				System.out.println("Found it ! ");
				return list;
			}
			else {
				System.out.println(goal +" was not found in the list");
				return list;
			}

		}

		//Recursive call
		if(list[0]!= goal){
			System.out.println(list[0] + " != from goal...");

			//Remove item from list
			System.out.println("list :"+Arrays.toString(list));

			int[] newlist = new int[list.length-1];
			System.arraycopy(list,1,newlist,0,list.length-1);
			System.out.println("newlist :"+Arrays.toString(newlist));


			return find(newlist, goal);


		}
		else {
			//Item found
			//returns list with only solution in it.
			int[] newlist = new int[1];
			newlist[0]=list[0]; // list[0]==goal 


			return find(newlist, goal) ;
		}

	}//End find()



	public static int Min(int[] list){

		//Base step
		if (list.length == 1 ) {
			return list[0];
		}

		if (list[0] < list[1] ){
				//
			list[1]= list[0];


		}

		int[] newlist = new int[list.length-1];
		System.arraycopy(list,1,newlist,0,list.length-1);

		return Min(newlist);


		

	}

	public static int Max(int[] list){

		//Base step 
		if (list.length == 1) {
			return list[0];
		}


		if( list[0] > list[1]){
			list[1]= list[0];


		}
		int[] newlist = new int[list.length-1];
		System.arraycopy(list,1,newlist,0,list.length-1);
		return Max(newlist);

	}

	public static void main(String[] args) {

		int[] list = {54,-35,6,394,0};

		// System.out.println("Minimum = "+Min(list));
		// System.out.println("Max = "+Max(list));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value you're looking for.");
		int goal = sc.nextInt();
		find(list, goal);





		
	}
}