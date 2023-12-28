
// This is a program that simulates the user selection menu for a coffee machine,
// based off user input from a menu displayed by the program.
// Authors: Kian Sattar, Aidan Santos-Stevenson, and Kenny Wong
// Date: 2023/09/26

import java.util.Scanner;

public class CoffeeMachine{
public static void main(String args[]){

Scanner scnr = new Scanner(System.in);//Scanner class object for handling user input

System.out.println("Welcome to the Coffee House!!!!");//menu for coffee
System.out.println("-----Espresso-----");
System.out.println("-----Cappuccino-----");
System.out.println("-----Latte-----");
System.out.println("Enter the coffee type: ");//user input for coffee type

String type = scnr.next();
type = type.toUpperCase(); //set case of user type input to upper case for case insensitivity

System.out.println("Choose the size of the coffee(Small/Medium/Large): ");//user input for coffee size

String size = scnr.next();
size = size.toUpperCase(); //set case of user size input to upper case for case insensitivity

switch(type){//conditional logic
	case "ESPRESSO":
		espressoSize(size); //call to method for espresso option size selection
		break;
	case "CAPPUCINO":
		cappucinoSize(size); //call to method for cappucino option size selection
		break;	
	case "LATTE":
		latteSize(size); //call to method for latte option size selection
		break;
	}
}
public static void espressoSize(String size) { //methof for setting espresso size
	if("SMALL".equals(size)){//displays message for small size
		System.out.printf("Your Order: Small Espresso");
	}else if("MEDIUM".equals(size)){//displays message for medium size
		System.out.printf("Your Order: Medium Espresso");
	}else if("LARGE".equals(size)){//displays message for large size
		System.out.printf("Your Order: Large Espresso");
	}
}

public static void cappucinoSize(String size) { //method for setting cappucino size
	if("SMALL".equals(size)){//displays message for small size
		System.out.printf("Your Order: Small Cappucino");
	}else if("MEDIUM".equals(size)){//displays message for medium size
		System.out.printf("Your Order: Medium Cappucino");
	}else if ("LARGE".equals(size)){//displays message for large size
		System.out.printf("Your Order: Large Cappucino");
	}
}

public static void latteSize(String size) { //method for setting latte size
	if("SMALL".equals(size)){//displays message for small size
		System.out.printf("Your Order: Small Latte");
	}else if("MEDIUM".equals(size)){//displays message for medium size
		System.out.printf("Your Order: Medium Latte");
	}else if("LARGE".equals(size)){//displays message for large size
		System.out.printf("Your Order: Large Latte");
	}
}
}
