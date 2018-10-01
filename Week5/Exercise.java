public class Exercise  {

	public static void main(String[] args) {
		double[] myArray = {4,24,1.42,-4,0,3};

		System.out.println(addEvens(myArray));



	}
	// Returns the numbers with even index from an array. 
	 public static double addEvens(double array[]){
	 	double sum = 0;
	 	for (int i = 0 ; i < array.length; i= i + 2 ) {
	 		sum = sum + array[i];
	 		
	 	}
	 	return sum; 

	}
	
}

