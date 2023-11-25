

///// JAVA Class 5: on May 6, 2023, Saturday with Instructor AP //////


package nb_cl5_loop_whileDO_pkg;

public class NB_cl5_loop2_clnotes {
	
	
	
	
	
	
	
	// break vs continue:- continue is to basically  skip the iteration. vs break is if certain condition is met then I can break out of it.
			// continue will keep working on rest of the other loops. 
			// both have to be inside the curly bracket and the loop.
	
	
	
	
	// ============================================================================================
	


		
	
		
		
// END OF FOR LOOP AND FOR EACH LOOP		
		
	/*	
////Exercise 12:
	public static void main(String[] args) {

		String a = "apple keeps the doctor away";
		String[] x = a.split(" ");	  // it splits the whole sentence into individual index numbers
					// Ex: index #1 = apple, index #2 = keeps, index #3 = the ........and so on
		
		System.out.println(x[1]); 		// has to print index value 1 which matches "keeps"
		
		System.out.println("==================");

		// For each : you do this on each element or values
		for(String item : x){
			if(item.equals("nurse"));
			System.out.println(item);
			break;
		}
	}	
}
 */	
		
	/*
////Exercise 11: USING FOR LOOP
	public static void main(String[] args) {

		String a = "Nistoj";
		char[] x = a.toCharArray();  // it holds each individual char values
		
		// For each : you do this on each element or values
		
		//for loop
		for(int i = 2 ; i < x.length; i=i+1) { 
			System.out.println(i);       // if I want to start from 's' then I have to put the index number 2.  
				// it prints the index numbers only
		}
		
		System.out.println("==================");
		
		for (int i=2; i<=x.length-1; i=i+1)	{
			System.out.println(x[i]);
				// it prints the value that matches with the given index number
		}
	}	
}
	*/

	/*
//Exercise 10: Using FOR EACH LOOP: for(DataTypeOfTheGroup VariableToRepresentEachData : GroupData ){ BodyWork }
// Here, you cannot control where to begin. it has to be all or nothing. 
// For Each using continue
	public static void main(String[] args) {

		String a = "apples";
		char[] x = a.toCharArray();
		
		for(char item : x ) {
			
			if(item == 'p') {		// only strings you can do .functions...with char you have to do  == function
				continue;
				// continue will skip all the 'p' iterations and move to next iteration which is l then e
		}
			System.out.println(item); 
		//if you want to print just 's' then use if clause inside of for loop
			if(item == 's') {
				System.out.println(item);
				break;
			}
			
			// final result is a,l,e, s, s ..... no clue why its printing s twice though there is only 1 s in apples
		}
	}
}
	*/
		
	/*
//Exercise 9:		
// for each loop using break
	
	public static void main(String[] args) {
		
		String a = "apple";
		char[] x = a.toCharArray();    

		System.out.println(x);  // a p p l e ..... basically prints the string as a list of characters
		
			for(char item : x ) {
				if(item == 'p') {
					break;
				}
				System.out.println(item);    // a
			// it has to be all or nothing. you cannot start from "ple"
			// break will stop the loop, and no more iteration happens after that. 
			 
			// final result is a
		}	
	}
}	
	*/
		
	/*
//Exercise 8:
	public static void main(String[] args) {
		// Print out every letter of a word except the 3rd letter
		
		String a = "oranges";
		char[] x = a.toCharArray();
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
	}
}
	*/
		
	/*
//Exercise 7: once it reached index value of 2, it will stop coding and break out of it
	// for loop using break

	public static void main(String[] args) {
		String a = "oranges";
		char[] x = a.toCharArray();
		
		for(int i=0; i<x.length; i++) {
			if(i==2) {
				break;    // once it reached index value of 2, it will stop coding and break out of it
			}
	
			System.out.println(x[i]);    // o , r
		}
	}		
}		
		// break vs continue:- continue is to basically  skip the iteration. vs break is if certain condition is met then I can break out of it.
		// continue will keep working on rest of the other loops. 
		// both have to be inside the curly bracket and the loop. 
	*/	
		
		
	/*
//Exercise 6:	
	public static void main(String[] args) {

		String a = "apple";  
		char[] x = a.toCharArray();    // index values: 0,1,2,3,4 for a,p,p,l,e respectively
		
		System.out.println(x[0]); 	// a
		System.out.println(x[1]);	// p
		System.out.println(x[2]);	// p
		System.out.println(x[3]); 	// l
		System.out.println(x[4]);	// e
	}	
}
	*/
	
	/*
//Exercise 5: if you want to skip 2, 3, and 4 but keep going
	public static void main(String[] args) {

		for (int i=0; i <=5; i++) {
			if(i==4 || i==3 || i==2) {  // if you want to skip 2, 3, and 4 but keep going
				continue;
			}
			System.out.println(i);
			System.out.println("hello");		
		}			
 	}
}	
	*/

	/*
//Exercise 4 or 3 part 2: this prints all from 0 to 5, and does not skip since continue is placed after 4 is already printed
	public static void main(String[] args) {
		for (int i=0; i <=5; i=i+1) {
			System.out.println(i);
			System.out.println("hello");
			
			if(i==4) {
				continue;
				// this does not skip the 4 because it is done after the system already print the above statements
			}
		}
	}
}	
	*/

	/*
//Exercise 3:If you want your output as: basically skips that i ==4 value and prints everything before or after 
	public static void main(String[] args) {
		for (int i=0; i <=5; i++) {
			
			if(i==4) {
				continue;
				// keyword - continue helps to skip everything in that for loop and goes to the end of it or next iteration 
			}
			System.out.println(i);
			System.out.println("hello");			
		}
		
	}
}		
	*/
		
		/*
		
//Exercise 2: If you want your output as: 0,1,2,3,4,8
	
	public static void main(String[] args) {	
	
//		// i =i+1 --> i++
//		// i =i+1 --> i--
//		
		int N=8;
		
		if (N>=0) {
			System.out.println(0);
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);    // it will print 0,1,2,3,
			
			for (int i=4; i<=N; i=i+4) {
			
				System.out.println(i);  // 4,8
			}
		}
		else {
			for (int i=0; i<=N; i=i+1){
				System.out.println(i);
			}			
		}
	}
}		
	*/
		
	/*
//Exercise 1:
	public static void main(String[] args) {	
		int N = 15;
		
		if (N>=0) {
			System.out.println(0);
		}	
		for (int i=1; i<=N; i=i+2) {
			
			System.out.println(i);   
		}
						// it will print 0,1,3,5,....
	
	}	
}		
	*/	
		
		// HW4 Question #1:
	
	public static void main(String[] args) {
		
	
		// Given N --- Print this pattern up to N: 1,4,8,12,16,20...
		
		int N = 58; // 1,4,8,12
		
		for (int i=1; i<=N; i=i+4) {
			
			if(i==1) {
				System.out.println(1);
				i = 4;
			}
			System.out.println(i);
		}
	}
}		

	/*	
		// alternative way to get the same result:

		int N = 58;
		
		if(N>=1) {
			System.out.println(1);
		}
		
			for(int i=4; i <=N; i=i+4) {
			System.out.println(i);	
		}
	}
}
	*/
		