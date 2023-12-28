import java.util.Scanner;

public class ShapeAreaCalculator {
	
	public static void main(String[] args) {
		//Create variables and instantiate an object of the class
		char choice;
		boolean loop = true;
		Scanner scnr = new Scanner(System.in);
		double circleRadius, rectWidth, rectHeight, triBase, triHeight;
		ShapeAreaCalculator s = new ShapeAreaCalculator();
		
		//While loop to present menu to user
		while(loop) {
		System.out.println("Welcome to Shape Area Calculator!");
		System.out.print("\n");
		System.out.println("Menu Selections:");
		System.out.print("\n");
        System.out.println("1 For Area of A Circle");
        System.out.println("2 For Area of A Rectangle");
        System.out.println("3 For Area of A Triangle");
        System.out.print("\n");
        System.out.println("Enter an integer value corresponding to one of the options in the above menu: ");
        
        //Take user menu selection input
        choice = scnr.next().charAt(0);
        
        //Make choice of which shape area calculator method to call, based off of user choice
        switch(choice) {
        case '1':
        	System.out.println("You chose the Circle Area Calculator option.");
        	System.out.print("\n");
        	System.out.println("Please enter the radius of the circle: ");
        	circleRadius = scnr.nextDouble();
        	System.out.print("The area of the circle is: "); 
        	System.out.printf("%5.1f%n", s.calcAreaCircle(circleRadius));
        	break;
        case '2':
        	System.out.println("You chose the Rectangle Area Calculator option.");
        	System.out.print("\n");
        	System.out.println("Please enter the length of the width of the rectangle: ");
        	rectWidth = scnr.nextDouble();
        	System.out.println("Please enter the length of the height of the rectangle: ");
        	rectHeight = scnr.nextDouble();
        	System.out.print("The area of the rectangle is: "); 
        	System.out.printf("%5.1f%n", s.calcAreaRectangle(rectWidth, rectHeight));
        	break;
        case '3':
        	System.out.println("You chose the Triangle Area Calculator option.");
        	System.out.print("\n");
        	System.out.println("Please enter the length of the base of the triangle: ");
        	triBase = scnr.nextDouble();
        	System.out.println("Please enter the length of the height of the triangle: ");
        	triHeight = scnr.nextDouble();
        	System.out.print("The area of the triangle is: "); 
            System.out.printf("%5.1f%n", s.calcAreaTriangle(triBase, triHeight));
        	break;
        	default:
        		System.out.println("Invalid Choice.");
        	}
        //Provide user with option to return to menu or exit the program
        System.out.println("Want to Calculate More Shape Areas? Y/N");
        loop = scnr.next().charAt(0) == 'Y';
		}
		//Close scanner object
		scnr.close();
	}
	//Methods for calculating shape areas
	public double calcAreaCircle(double circleRadius){
        return Math.PI * Math.pow(circleRadius, 2);
    }
	
	public double calcAreaRectangle(double rectWidth, double rectHeight) {
		return (rectWidth * rectHeight);
		
	}
	
	public double calcAreaTriangle(double triBase, double triHeight) {
		return ((0.5) * triBase * triHeight);
		
	}
}
