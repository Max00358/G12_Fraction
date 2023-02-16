import java.util.*;
import java.io.*;

public class FractionTester{
	
	public static void main(String[] args)throws IOException{
		
		int loop = 1;
		
		//Create a while loop to loop the entire program
		while(loop == 1){
			//Construct variables
			int n = 0;
			int d = 0;
			int loop1 = 1;
			int loop2 = 1;
			int loop3 = 1;
			int loop4 = 1;
			String answer;
			int answer2;
			String answer3;
			
			//Create scanner named userInput to scan user inputs
			Scanner userInput = new Scanner(System.in);
			System.out.print("\033[H\033[2J");
			System.out.println("Hello, please input a positive integer as your NUMERATOR: ");
			
			//Use while loop and try and catch method to make the user input a positive integer as the numerator for the fraction
			//The while loop only stops looping if user inputs a positive integer as numerator
			while(loop1 == 1){
				//The try and catch method will catch the error if user inputs a letter or symbol instead of an integer
				try{
					n = userInput.nextInt();
					
					//if the n value is less than or equal to 0, then repeat the loop
					if(n <= 0){	
						System.out.print("\033[H\033[2J");
						System.out.println("The numerator should be positive. Enter the positive integer again:");
						loop1 = 1;
					}
					//else end the loop
					else{
						loop1 = 0;
					}
				}
				catch(Exception ex){
					System.out.print("\033[H\033[2J");
					System.out.println("Invalid input! Your input probably isn't an integer. \nEnter the positive integer again: ");
					userInput.next();
				}
			}
		
			System.out.print("\033[H\033[2J");
			System.out.println("Please input a positive integer as your DENOMINATOR: ");
			
			//Use while loop and try and catch method to make sure that the denominator of the fraction is a positive integer
			//The while loop only stops looping if user inputs a positive integer as denominator
			while(loop2 == 1){
				//The try and catch method will catch the error if user inputs a letter or symbol instead of an integer
				try{
					d = userInput.nextInt();
				
					//if the d value is less than or equal to 0, then repeat the loop
					if(d <= 0){	
						System.out.print("\033[H\033[2J");
						System.out.println("The denominator should be positive. Enter the positive integer again:");
						loop2 = 1;
					}
					//else end the loop
					else{
						loop2 = 0;
					}
				}
				catch(Exception ex){
					System.out.print("\033[H\033[2J");
					System.out.println("Invalid input! Your input probably isn't an integer. \nEnter the positive integer again: ");
					userInput.next();
				}
			}
			
			//Create a new fraction and store the user inputs in it
			Fraction newFraction1 = new Fraction(n,d);
			
			//Clear the console and output the fraction along with its mixed number form
			System.out.print("\033[H\033[2J");
			System.out.print(newFraction1);
			System.out.println(newFraction1.mixedNumber());
			
			//Ask if user wants to add another fraction to the program, scan and store the user input
			System.out.println("\nDo you want to add another fraction to the program? (Yes/No)");
			answer = userInput.next();
			
			if(answer.equalsIgnoreCase("yes")){
				int n2 = 0;
				int d2 = 0;
				
				System.out.print("\033[H\033[2J");
				System.out.println("You are constructing your 2nd fraction, please input a positive integer as your NUMERATOR: ");
				
				//Use while loop and try and catch method to make sure the numerator is a positive integer
				//The while loop only stops looping if user inputs a positive integer
				while(loop3 == 1){
					//The try and catch method will catch the error if user inputs a letter or symbol instead of an integer
					try{
						n2 = userInput.nextInt();
						
						//if the n2 value is less than or equal to 0, then repeat the loop
						if(n2 <= 0){	
							System.out.print("\033[H\033[2J");
							System.out.println("The numerator should be positive. Enter the positive integer again:");
							loop3 = 1;
						}
						//else end the loop
						else{
							loop3 = 0;
						}
					}
					catch(Exception ex){
						System.out.print("\033[H\033[2J");
						System.out.println("Invalid input! Your input probably isn't an integer. \nEnter the positive integer again: ");
						userInput.next();
					}
				}
				
				System.out.print("\033[H\033[2J");
				System.out.println("You are constructing your 2nd fraction, please input a positive integer as your DENOMINATOR: ");
				
				//Use while loop and try and catch method to make sure the denominator is a positive integer
				//The while loop only stops looping if user inputs a positive integer as denominator
				while(loop4 == 1){
					//The try and catch method will catch the error if user inputs a letter or symbol instead of an integer
					try{
						d2 = userInput.nextInt();
						
						//if d2 value is less than or equal to 0, repeat the loop
						if(d2 <= 0){	
							System.out.print("\033[H\033[2J");
							System.out.println("The denominator should be positive. Enter the positive integer again:");
							loop4 = 1;
						}
						//else end the loop
						else{
							loop4 = 0;
						}
					}
					catch(Exception ex){
						System.out.print("\033[H\033[2J");
						System.out.println("Invalid input! Your input probably isn't an integer. \nEnter the positive integer again: ");
						userInput.next();
					}
				}
				
				//Construct the second fraction that has the numerator and the denominator value of user inputs
				Fraction newFraction2 = new Fraction(n2,d2);
				
				System.out.print("\033[H\033[2J");
				System.out.println("Do you want to add or multiply this new fraction to the first fraction? \n(1 for addition/2 for multiplication)");
				answer2 = userInput.nextInt();
				
				//if user answers 1, then perform call the addition methods to calculate and output the fraction addition result
				if(answer2 == 1){
					System.out.print("\033[H\033[2J");
					newFraction1.add(n2,d2);
					newFraction1.add(newFraction2);
				}
				
				//if user answers 2, then perform call the multiplication methods to calculate and output the fraction multiplication result
				else if(answer2 == 2){
					System.out.print("\033[H\033[2J");
					newFraction1.multiply(n2,d2);
					newFraction1.multiply(newFraction2);
				}
				
				//else assumes the user wants to end the program and end the program
				else{
					System.out.println("Your pressed neither 1 or 2, so I'm assuming you want to end the program. Bye!");
					loop = 0;
				}
				
				//Ask whether user wants to try the program again, scan and collect user inputs
				System.out.println("Do you want to try this program again?");
				answer3 = userInput.next();
				
				//if user answers "yes," then repeat the loop
				if(answer3.equalsIgnoreCase("yes")){
					loop = 1;
				}
				//else thank the user and end the loop
				else{
					System.out.print("\033[H\033[2J");
					System.out.println("Thank you for trying out the program, goodbye!");
					loop = 0;
				}
			}
			//when the user doesn't want to add another fraction or simply input an answer other than "yes", then thank the user for trying out the program and then end the loop.
			else{
				System.out.print("\033[H\033[2J");
				System.out.println("Thank you for trying out the program, goodbye!");
				loop = 0;
			}
		}
	}
}