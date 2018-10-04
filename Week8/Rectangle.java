import java.util.Scanner;

public class Rectangle {


	private double height;
	private double width;

//Constructor 
	public Rectangle(){
		width = 5;
		height = 10 ; 
	}
	public Rectangle(double height, double width){
		this.width = width;
		this.height = height ; 
		
	}


	public double area(){
		return width * height; 
	}

	//Getters
	public double getHeight(){
		return height; 
	}
	public double getWidth(){
		return width;
	}

	//Setters 
	public void setHeight(double height){
		this.height = height;
	}
	public void setWitdh(){
		//Another way to set the value
		System.out.println("Enter the width : ");
		Scanner sc = new Scanner(System.in);
		this.width = sc.nextInt();
	}
	



////Test client
public static void main(String[] args) {
	Rectangle r1 = new Rectangle(2.3, 3.3);

	System.out.println(r1.width + " "+r1.height );
	System.out.println("Aera : "+ r1.area()); 
	System.out.println(r1.getWidth());
	System.out.println(r1.getHeight());
	r1.setHeight(42);
	r1.setWitdh(); 
	System.out.println(r1.area()); 




}

}