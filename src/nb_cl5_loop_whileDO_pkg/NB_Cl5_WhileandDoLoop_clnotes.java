

///// JAVA Class 5 part 2: on May 6, 2023, Saturday with Instructor AP //////


package nb_cl5_loop_whileDO_pkg;

import java.util.Scanner;

public class NB_Cl5_WhileandDoLoop_clnotes {

	
	
	
	// DO - WHILE LOOP: 	No parenthesis and condition right after do; conditions are later to the end inside while 
				// since there is no condition, it is going to go inside and print whatever statement. 
						// Next time it reaches the answer input and if it does not satisfy the condition, it will end the loop. 
				// if it satisfies the condition, it will continue the loop till it is false. 
				
		// When to use while loop VS do loop?
			// If the condition has to be checked in the beginning first thing first, then you use while loop. 
			// but if you only care about running first and checking the conditions later then you can use do loop. 		
				
	
	
	// IQA 1: Differentiate between while loop VS do loop (do while loop) ? 
		// 1. In a while loop, I have to check the given condition first. 
				// Only if the condition is true, then I am going to go inside and keep doing the work until the condition is found false. That's when I end the loop. 
		// Vs
		// 2. In a do loop, it is going to start doing the do- work first no matter what the condition is. 
				// That's because the codes run top to bottom, and the while conditions are not until when we get to the bottom. 
					// So it runs everything till it meets the condition. 
					// If the condition is true, then it restarts the loop, but if it is false then it stops the loop right there. 	
	
	// IQA 2: When to use for vs for each vs while vs do-while loop?
		// 1. For loop: if the loop is based on some kind of number like going from 1 to 100, then I use for loop
		// 2. For each loop: if I am dealing with group of data and I want to loop through all the data in the group then I would use for each loop.
		// 3. While loop: if the loop is based on the condition that needs to be dealt with first thing first then we use while loop.
		// 4. Do-while loop: if the loop is based on running the work first time and dealing with the condition towards later second time or third time etc. in the end, then we use do loop (do while loop). 
			
	
	
	// we are using the scanner to take the input, and store the answer in the variable called word
	// then I am using the loop to check if the variable contains certain things, and if it is true then it is going to go in, and starts running the loop
	// then once I get the answer again, I am using the same variable 'word' to save my answer, and then once I reach the curly bracket, I am going to restart checking the same previous question. 
	// if in that time I find it true, then I keep repeating the same exact until I find the situation to be false. 
	
	
	//	continue;
		// this will skip the next statement so it jumps back to the first one, and since we are not inputing new answer, it will continue being true and say the print statement before this if clause. 
	//	 break; 
		// this will exit out of this statement, and go to the next one below this. if it is true, then it keeps looping same way.
	// once the answer/word is true, but also has 'o' in it, then it gives the upcoming true statement then kicks itself out to the very last ending statement and stop. 
	// ?? question?? it does not really matter if the word contains o or not. as long as it does not have e, it is breaking out. why?
		
	
	
	
	
	// ===========================================================================================
	
	
	
	
// Exercise 2:	DO WHILE LOOP: 	No parenthesis and condition right after do; conditions are later to the end
		// since there is no condition, it is going to go inside and print whatever statement. Next time it reaches the answer input and if it does not satisfy the condition, it will end the loop. 
		// if it satisfies the condition, it will continue the loop till it is false. 
	
		// If the condition has to be checked in the beginning first thing first, then you use the while loop. 
		// but if you only care about running first and checking the conditions later then you can use do loop. 		
		
	public static void main(String[] args) {

		System.out.println("Give me a word?");
		Scanner ui = new Scanner(System.in);
		String word = ui.nextLine();  
		
		do {		
			System.out.println("Your word has the letter E");
			
			if(word.contains("o")) {
				break;   // if the input has 'o' in it, then it will break out of this do-while and go to the last syso
			}
			
			System.out.println("Give me another word?");
			word = ui.nextLine();
		} 
		while(word.contains("e"));    
			// it will keep looping/repeating from top-bottom as long as the word has 'e' in it
			
		System.out.println("Outside of while loop");		
	}
}		
	// What's actually happening here?
		// do happens first and prints its do- syso...if its got 'o' in it then it breaks/ends the loop and goes to the last syso
		// if there isn't any 'o', but has 'e' then it loops/repeats from the top and keeps repeating till the answer has 'e'
		// if there isn't any 'o' or 'e' then, it prints the do-syso and also asks for another word, 
			// and if still can't find then it will end the looping and goes to the last syso
				
	
	/*	
// Exercise 1:	WHILE LOOP : it has condition in the beginning
	public static void main(String[] args) {
	
		System.out.println("Give me a word?");
		
		Scanner ui = new Scanner(System.in);
		String word = ui.nextLine();  // we are using the scanner to take the input, and store the answer in the variable called word
				// then I am using the loop to check if the variable contains certain things, and if it is true then it is going to go in, and starts running the loop
			// then once I get the answer again, I am using the same variable 'word' to save my answer, and then once I reach the curly bracket, I am going to restart checking the same previous question. 
			// if in that time I find it true, then I keep repeating the same exact until I find the situation to be false. 
		
		if(word.contains("e")) {
			System.out.println("hello");
		
			while(word.contains("e")) {		// it will continue running hello until it is false. but unfortunately, it will forever keep running the body in the same loop			System.out.println("Your word has the letter E");
			
				if(word.contains("o")) {
					continue;
				// this will skip the next statement so it jumps back to the first one, and since we are not inputing new answer, it will continue being true and say the print statement before this if clause. 
//				 break; 
				// this will skip this statement, and go to the next one below this. if it is true, then it keeps looping same way.
				// once the answer/word is true, but also has 'o' in it, then it gives the upcoming true statement then kicks itself out to the very last ending statement and stop. 
				// ?? question?? it does not really matter if the word contains o or not. as long as it does not have e, it is breaking out. why?
					
				}
			
			System.out.println("Give me another word?");
			word = ui.nextLine();
			// it is similar to if clause...if the situation is true then I will go inside and run the loop until the situation is false. 
			}
		}
		else {
		System.out.println("Outside of while loop");
		}
	}
}		
	*/	
		
//While Loop:
		
		// BEGINNING OF While LOOP 

