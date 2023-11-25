

///// JAVA Class 5 part 3: on May 6, 2023, Saturday with Instructor AP //////


package nb_cl5_MyMethod_pkg;

public class NB_cl5_mymethodA_classnotes {

		
	
		
	
	
	
	
	
	
	
	// ====================================================================================
	
	
	 
// Exercise 4:	 Methods - Return type scenarios:
	
	public static void main(String[] args) {
	
		
		System.out.println(NB_cl5_mymethodA_classnotes.sum1(15, 2));
		System.out.println("=========1=========");
		System.out.println(NB_cl5_mymethodA_classnotes.sum1(15, 2)+ 100);
		// use this because you can manipulate further by doing further addition, subtraction, multiplication, division, etc. 
		System.out.println("=========2=========");

//		System.out.println(NB_cl5_mymethodA_classnotes.sum2(15, 2));
		// if the method type is void, you cannot put it inside println as it will print nothing as it's got no return value.
		// basically you cannot print return directly.....instead you can just call it without the syso statement
				// above VS below
		
		System.out.println("=========3=========");

		// so do this instead :
		NB_cl5_mymethodA_classnotes.sum2(15, 2);
		
		System.out.println("==========4========");

		// unless you save it in a variable then print that variable like below:
		int num = NB_cl5_mymethodA_classnotes.sum1(15, 2);
		System.out.println(num);
			
	}
	
	public static void  sum2(int a, int b) {
		System.out.println("Hi");
		System.out.println(a+b);
	}
		
	public static int  sum1(int a, int b) {
			System.out.println("Hello");
			return a+b;
	}		
}
	
// Answer explanation: 
// 1. it goes inside the main method first which tells to go to the sum method first which then tells you to print hello.  
// 2. then it does the adding part for the return function, and print whatever the sum is. 
// 3. then it goes to the sum2 method which firstly prints hello then move down to print a + b. 

	


// =============================================
	
	/*
// Exercise 3:	

	public static void main(String[] args) {
			
		int a =15;
		int b= a;
		
		int x = NB_cl5_mymethodA_classnotes.sum1(15, 2);
		// since this above sum pertains to the one below, the a is equal to 15, and b is equal to a. 
		// a is always gon be the first one so a is 15 while the b is always gon be the second one which in this case is a then that matches to value 15 from above. 
		
		System.out.println("==================");
		System.out.println("Your return answer is " + x);
		// first it finishes the sum then puts the return value of hello for the value of x then prints that as the last output. 

		
		String aa = "apple";

		// returning means it has a value. For example string a has value of apple.
		// value of sum actually is equal to nothing, but it does the work of adding the 2 values to get some final result.
		// anything that comes before the method name is the return type. 
		// void is an example of return type. If other than void is used, for example int, then you have to type return at the end to avoid the error signs. 
		// If statement does not have any void means you need a return statement at the end that matches the matching dataType. 		
	
	
		String xx = NB_cl5_mymethodA_classnotes.sum2(5, 7);	
		System.out.println("==================");
		System.out.println(xx + " is the return answer.");
	}	

	public static int  sum1(int a, int b) {
		System.out.println("The sum of your inputs: " + (a+b));
		return 7;
	}
	public static String  sum2(int a, int b) {
			System.out.println("The sum of your inputs: " + (a+b));
	return "hello";
	}
}	
	*/
	
	/*
// =======================================================================	
// Exercise 2: // Topic Creating methods with arguments
	
	public static void main(String[] args) {
		
	
		NB_cl5_mymethodA_classnotes.greetings("Hi", "John");	
		NB_cl5_mymethodA_classnotes.greetings("John");
		NB_cl5_mymethodA_classnotes.greetings3("Nish");
	}		
	
	public static void greetings (String greeting, String name) {
		System.out.println(greeting + ", " + name);	
	}	
	public static void greetings (String name) {
		System.out.println("Hello, " + name);	
	}
	public static void greetings3 (String name) {
		System.out.println(name);	
	}
}
	*/
		
	/*
// =======================================================================		
// Exercise 1:	// Topic Creating methods:
	
	public static void abc () {
		System.out.println("ABC method");		
		NB_cl5_mymethodA_classnotes.sum(7);
		
	}				
		
	public static void main(String[] args) {	
		// method is created inside the class, but class is never created inside the method. 
		// Also, you cannot create a method inside another method nor class inside a class!!! BUT you can call another method inside a method.
		// main is the method name (has to be always lower cases) with 1 argument/parameter inside the small parenthesis () i.e. 'String' array, [], and 'args' variable inside of it. 
		// String is the dataType of the argument
		// args is the name of the variable of the argument	
		
	
		NB_cl5_mymethodA_classnotes.sum(5);
		System.out.println("==================");
		NB_cl5_mymethodA_classnotes.abc();
		System.out.println("==================");
		System.out.println("Hello from Main!");	
		System.out.println("==================");
		NB_cl5_mymethodA_classnotes.abc();
		System.out.println("==================");
		NB_cl5_mymethodA_classnotes.xyz();
		System.out.println("==================");
		xyz();	
		System.out.println("==================");
	
	}

	public static void xyz() {
		System.out.println("XYZ method");
	}
	
	public static void sum(int a ) {   // if you put a, the user can input whatever integer they want to get the final result or sum
		// idea of argument is it lets the user decide what integer to use
		System.out.println(15+5);  	// 20 everytime
		System.out.println(a+a); 	// varies based on given value of a
	}
}
	*/
