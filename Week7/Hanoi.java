import java.util.Scanner;
import java.util.Arrays;

public class Hanoi{


		// 0 = no disk, 1 = smallest disk,..., size_tower= largest disk
		public static void moveTower(int n, int[] origin, int[] goal, int[] intermediate){

			if (n == 1) {
				//System.out.println("Move disk "+n+ "  "+origin+" --> "+goal );
				moveDisk(n,origin,goal);
				printArrays(origin,intermediate, goal);
			}
			else{
				moveTower(n-1, origin, intermediate, goal);
				//System.out.println("Move disk  "+n+ "  "+origin+" -> "+goal );
				moveDisk(n,origin,goal);
				printArrays(origin,intermediate, goal);

				moveTower(n-1, intermediate, goal, origin);


			}
		}
		//moves the disk between 2 arrays ( stacks ).
		public static void moveDisk(int disk, int[] stack_origin, int[] stack_goal){
			// stack_origin[disk-1] = disk 
			// stack_goal[count] = future position of fisk
			//search free position in array 
			int size_tower = stack_goal.length;

			int count = size_tower-1;
			boolean diskmoved = false; 


		while (diskmoved == false) { 
			if (stack_goal[count] == 0 ) {

				//move disk
				stack_goal[count] = stack_origin[disk-1];

				stack_origin[disk-1]=0;
				System.out.println("Disk moved ! ");
				diskmoved = true ; 

			}
			else{
				count--;
				System.out.println("tested position "+ count);
			}
		}




		}


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
		printArrays(stackA,stackB, stackC);


		moveTower(size_tower,stackA,stackC,stackB);



		//testing
		// for (int i = 1; i<size_tower+1; i++){

		// 	moveDisk(i, stackA, stackB);
		// }















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
	 public static void printArrays(int[]a, int[] b, int[] c){
	 	System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		}	

	}