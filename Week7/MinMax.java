import java.util.Scanner;


public class MinMax{


public static int[] find(int[] list, int goal){
	//Base step 
	



}
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

		int[] list = {54,34,6,35};

		System.out.println("Minimum = "+Min(list));
		System.out.println("Max = "+Max(list));


		
	}
}