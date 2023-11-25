package nb_cl5_hw5_pkg;

import java.util.Scanner;

public class NB_cl5_hw5_mainMethod {

//	Assignment:
//
//		1. Build a basic calculator (Plus, Minus, Multiplication, Division)
//			a. (Ask user for a number and then ask for the second number
//				- then ask for the operation: ADD, SUB, MULTI, DIV)
//
//			b. Two of the math operation needs to be a static Methods and two of them to be non-static methods. All 4 operations should be in a separate class.
//			c. Use “IF and ELSE” or “SWITCH”
//		 
//		2. Ask the USER for a string and print if the string is palindrome // wow = wow
//		3. Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.
//		
	
	public static void main(String[] args) {

		Scanner nk = new Scanner(System.in);      // Primitive datatype int, boolean, etc. 
		Scanner nkb = new Scanner(System.in);     // Non-primitive datatype like string
		
		System.out.println("Give me the first number?");
		int fn = nk.nextInt();
		
		System.out.println("Give me the second number?");
		int sn = nk.nextInt();
		
		System.out.println("Please pick one operation: Add, Sub, Multi, Div");
		String pao = nkb.nextLine();
		
		NB_cl5_hw5_methods1_4 multii = new NB_cl5_hw5_methods1_4();
		multii.multi(fn, sn);
		NB_cl5_hw5_methods1_4 divi = new NB_cl5_hw5_methods1_4();
		divi.div(fn, sn);
		
//		switch(pao.toLowerCase()) {
//		case "add":
//			System.out.println("Your answer is " + NB_cl5_hw5_methods1_4.add(fn, sn));
//			break;
//		case "sub":
//			System.out.println("Your answer is " + NB_cl5_hw5_methods1_4.sub(fn, sn));
//			break;
//		case "multi":
//			System.out.println("Your answer is " + multii.multi(fn, sn));
//			break;
//		case "div":
//			System.out.println("Your answer is " + divi.div(fn, sn));
//			break;
//		}
		
		if(pao.toLowerCase().contains("add")) {
			System.out.println("Your answer is " + NB_cl5_hw5_methods1_4.add(fn, sn));
		}
		else if(pao.toLowerCase().contains("sub")) {
			System.out.println("Your answer is " + NB_cl5_hw5_methods1_4.sub(fn, sn));
		}
		else if(pao.toLowerCase().contains("multi")) {
			System.out.println("Your answer is " + multii.multi(fn, sn));
		}
		else if(pao.toLowerCase().contains("div")) {
			System.out.println("Your answer is " + divi.div(fn, sn));
		}	
		
		System.out.println("Thanks for using Nish's Calculator!!!");
		
		System.out.println("========================================");
		System.out.println(" ");
		
		
		System.out.println("Please give me a string!");
		String q2 = nkb.nextLine();
				
		char[] hw5 = q2.toCharArray();  // k a y a k
		
		String finalanswer = "";  // this is basically to concat the string and character every time you finish looping
		
		for(int i= hw5.length -1 ; i>=0 ; i--) {
			finalanswer = finalanswer + (hw5[i]);
	
		}
			System.out.println(finalanswer);			
			if(q2.equals(finalanswer)) {
				System.out.println("Palindrome");
			}
			else {
			System.out.println("Not a Palindrome!");
		}
			
		System.out.println("========================================");
		System.out.println(" ");
		
		System.out.println("PLease give me a number one last time?");
		int q3 = nk.nextInt();
		
		if (q3%2 == 0) {
			System.out.println("The number is Even!");
		}
		else {
			System.out.println("The number is odd");
		}
		
		System.out.println(" ");
		System.out.println("Congratulations! You have successfully completed this assignment!!!");	
	}
}
		
		
		
