package assignment;
//class 4
public class Shapes {
int numberOfSides;//instance variable
//parameterized method of class 4
void calculateShapeArea(int numberOfSides, int sideLength) {
	//Executes for calculating area of circle
	if(numberOfSides==1) {
		Circle cir = new Circle();//created object
		cir.radius =sideLength;//passing value
		cir.calculateArea();// calling method of Circle class
	}
	//Executes for calculating area of Triangle
	else if (numberOfSides==3) {
		Triangle tri = new Triangle();//created object
		tri.sides=sideLength;//passing value
		tri.calculateArea();// calling method of Triangle class
	}
	//Executes for calculating area of Square
		else if (numberOfSides==3) {
			Square sqr = new Square();//created object
			sqr.sides=sideLength;//passing value
			sqr.calculateArea();// calling method of Square class
		}
	//Executes for other conditions
		else {
			System.out.println("No Shapes Present");
		}
	}
//main method 
public static void main(String[] args) {
	Shapes s = new Shapes();//object created
	//Test case 1
	System.out.println("Test Case 1: ");
	s.calculateShapeArea(3, 12);//method call
	//Test case 2
		System.out.println("\nTest Case 2: ");
		s.calculateShapeArea(4, 15);//method call
		//Test case 3
		System.out.println("\nTest Case 3: ");
		s.calculateShapeArea(5, 15);//method call
}
}
