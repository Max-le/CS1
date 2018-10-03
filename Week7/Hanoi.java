import java.util.Scanner;
import java.util.Arrays;

public class Hanoi{


		// 0 = no disk, 1 = smallest disk,..., size_tower= largest disk


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Tower of Hanoï.");
		int size_tower = sc.nextInt();

		int[] stackA = new int[size_tower];
		int[] stackB = new int[size_tower];
		int[] stackC = new int[size_tower];
		stackA = fill(stackA,0);
		stackB = fillZeros(stackB,0);
		stackC = fillZeros(stackC,0);
		System.out.println(Arrays.toString(stackA));
		System.out.println(Arrays.toString(stackB));
		System.out.println(Arrays.toString(stackC));










	}

	/** Fills an array with zeros ( recursively ).

	 @param index starting index to fill the array

	 **/
	 public static int[] fillZeros(int[] array, int index){
		//if last element is zero
	 	if (array[array.length-1]==0){
			//stack full of zeros.

	 		return array; 
	 	}



	 	else {

	 		int[] newArray = new int[array.length];

	 		newArray[0]= 0 ; 
	 		return fillZeros(newArray, index+1);
	 	}


	 }

	/** Fills an array with 1,2,3,4,... ( recursively ).

	 @param index starting index to fill the array

	 **/
	 public static int[] fill(int[] array,int index){

		//check array is completed
	 	if (index == array.length  ){
	 		return array; 

	 	}
	 	else{
	 		int[] newArray = new int[array.length];
	 		newArray = array; 
	 		newArray[index] = index + 1 ;
	 		System.out.println("index :"+index);
	 		System.out.println("value : "+newArray[index]);


	 		return fill(newArray, index + 1);



	 	}



	 }	


	}