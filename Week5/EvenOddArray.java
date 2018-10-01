

import java.lang.Math;
import java.util.Scanner;



public class EvenOddArray
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    
    double[] numbers;  //Declaration
    numbers = new double[6];  //Creation
    
    Scanner sc;
    sc = new Scanner(System.in) ;
    
    
    //read input - will only read x numbers, where x is the size of the array ( numbers)
    for ( int i = 0; i < numbers.length ; i++){
    	numbers[i] = sc.nextDouble();
    } 
    
    
    
    System.out.println("Sum of numbers at even position : " + even(numbers));
    System.out.println("Sum of numbers at odd position : " + odd(numbers));

    
   
  }//end main method
  
  //This method returns the sum all the elements with an EVEN index.
  public static double even(double[] numbers){
    
    double sum = 0 ;
    
    for (int i = 0; i < numbers.length ; i=i+2 ){
    	
      sum = sum + numbers[i];
    
    }
  return sum;
  
  
  }//end method
  
  
    //This method returns the sum all the elements with an ODD index.
  public static double odd(double[] numbers){
    
    double sum = 0 ;
    
    for (int i = 1; i< numbers.length ; i=i+2 ){
    	
      sum = sum + numbers[i];
    
    }
  return sum;
  
  
  }//end method
}




