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


////Test client
public static void main(String[] args) {
	Rectangle r1 = new Rectangle(2.3, 3.3) ;
	System.out.println(r1.width + " "+r1.height);
	System.out.println("Aera : "+ r1.area()); 
}

}