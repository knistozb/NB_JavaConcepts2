
///// JAVA Class 5 part 4: on May 6, 2023, Saturday with Instructor AP //////


package nb_cl5_GAME_pkg;

import java.util.Scanner;

public class NB_c5_GuessTheNumber {

	
	
	
	
	
	
	
	
	
	
	
	// ===================================================================
	
	
	
	
// Exercise 1:	Guess the number game!
	
	public static void main(String[] args) {

		
		int computerNumber = 5;
		
		System.out.println("Welcome to --- Guess the Number--- game show!!");
		System.out.println("The number will be always between 0-9");
		
		System.out.println("Give me a number?");
		Scanner ui = new Scanner(System.in);
		int number = ui.nextInt();
		
		int count = 1;
		
		do {
			if(number == computerNumber) {
				System.out.println("You win!");
				break;
			} else {
				
				if (count==3) {
					System.out.println("You lost!! You could not guess within 3 turns!!");
					break;
				}
				System.out.println("Try again! Give me another number?");
				number = ui.nextInt();
				count ++;    // ++ same as +1.... its funtion is to keep adding the count till it reaches the max set in while loop
			}			
		} while ( count <4);		
	}

}
	// What's actually happening above?
		// First, user is being asked a number between 0-9.
		// Inside do, if the input is is what we put as computerNumber then it will say you win and break/end the loop
			// if it is not, then it will go inside else statement.
				// now that has if situation where we are now setting the counts equal to 3 total meaning user has total 3 attempts     
				// it keeps looping/asking to give another number until the count reaches 3 max then it triggers the if syso and breaks out of the loop
		// Inside while, we are setting the rules as like the total count is less than 4, meaning 3, attempts only
		






