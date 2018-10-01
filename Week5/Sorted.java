import java.lang.Math; 
import java.util.Scanner;

public class Sorted  {

	public static void main(String[] args) {

		double[] numbers = new double[10000] ;
		int length = 0 ;//length of array actually used.
		Scanner sc = new Scanner(System.in);
		System.out.println("Type some ordered numbers to create an array. Type a letter when you're done.");

		while (sc.hasNextDouble()){
			//add input to array
			numbers[length] = sc.nextDouble();

			length++;
		}

		double value = 3.5;

		System.out.println("Ok.I'll insert the value "+ value);

		//Replace old array by the new one : 
		numbers = insert(value, numbers, length);
		System.out.println("Here's your new list : ");
		for (int i = 0; i < length+1; i++ ){
			System.out.println(numbers[i]);
		}

	}//end main
	
	public static double[] insert(double value, double array[], int length){
		double[] newArray = new double[10000];

	 	//find out where value should go 
	 	int pos = 0 ;//which position ( index ) value should go 
	 	while ( value > array[pos] && pos < (length - 1) )
	 	{
	 		pos++;
	 	}
	 	System.out.println("Your value should go at pos. "+ pos);

	 	// 	// We are about to add an element, so we need to update the size of the array
	 	length = length + 1 ;

	 	//Moving elements to free a place for value
	 	for (int i = length - 1 ; i >= pos; i--) {
	 		newArray[i] = array[i-1];

	 	}

	 	//insert new element
	 	newArray[pos]=value;


	 	return newArray; 

	 }
	 
	}

