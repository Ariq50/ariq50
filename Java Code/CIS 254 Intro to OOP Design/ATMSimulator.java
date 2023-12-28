//Import Scanner class
import java.util.Scanner;

public class ATMSimulator {
	
	public static void main(String[] args)
	{  //Initialize variables
		int balance = 100000;
		int withdraw;
		int deposit;
		boolean isRunning = true;  
		//Instantiate Scanner object to handle user input
		Scanner scnr = new Scanner(System.in);
		//while loop to display menu options to user
		while(isRunning)
		{
			System.out.println("Welcome to the Automated Teller Machine!");
			System.out.println("Please Make A Selection From The Menu Below:");
			System.out.println("Select 1 to Withdraw Cash");
			System.out.println("Select 2 to Deposit Cash");
			System.out.println("Select 3 to Check Account Balance");
			System.out.println("Select 4 to Exit");
			//Prompt user to enter option from menu
			System.out.println("Please Enter Your Choice Below:");
            //Validate user input is an integer
			if(scnr.hasNextInt()) {
				int choice = scnr.nextInt();
                //Validate user input is integer between 0 and 5, exclusive
				if(choice > 0 && choice < 5 )
				{
                //Test value of user input and execute case from switch-case statement that corresponds to input value
				switch(choice)
				{
                    //Case for withdrawing cash from account
					case 1:
						System.out.print("Enter amount you would like to withdraw:");
						withdraw = scnr.nextInt();
						
						if(balance >= withdraw)
						{
							balance = withdrawCash(balance, withdraw);
							System.out.println("Please collect your money.");
						} else {
							System.out.println("Insufficient Funds Available");
						}
						System.out.println("");
						break;
					//Case for depositing cash to account	
					case 2:
						System.out.println("Please enter amount to be deposited:");
						deposit = scnr.nextInt();
						
						balance = depositCash(balance, deposit);
						System.out.println("Money Successfully Deposited");
						System.out.println("");
						break;
					//Case for displaying account balance	
					case 3:
						System.out.println("Account Balance: " + balance);
						System.out.println("");
						break;
					//Case for exiting program	
					case 4:
						System.out.println("Goodbye! Have A Nice Day!");
						System.exit(0);		
						}
                    //Invalid input message (input not an integer between 0 and 5, exclusive).
					} else {
						System.out.println("Invalid Input.");
						isRunning = false;
						break;
					}
                //Invalid input message (input not an integer).
				} else {
				System.out.println("Invalid Input.");
				isRunning = false;
				break;
				}
			} 
		}
    //Method for withdrawing cash from account
	public static int withdrawCash(int balance, int withdraw) {
		return (balance - withdraw);
	}
	//Method for depositing cash to account
	public static int depositCash(int balance, int deposit) {
		return (balance + deposit);
	}
	
	}
