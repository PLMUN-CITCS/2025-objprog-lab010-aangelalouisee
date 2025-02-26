public class LoopingStatementsDemo {
    public static void main(String[] args) {

  	int counter = 1;
	System.out.println("While Loop Output:");
	while (counter <= 5) { //the loop will continue as long as the counter is less than or equal to 5
	    System.out.println("Count: " + counter); //displays the current value of counter
	    counter++; //counter adds 1 value up every loop
	}

	counter = 1; // Reset counter
	System.out.println("\nDo-While Loop Output:");
	do {
	    System.out.println("Count: " + counter); //displays the current value of counter
	    counter++; //counter adds 1 value up every loop
	} while (counter <= 5); //the loop will continue as long as the counter is less than or equal to 5

	System.out.println("\nFor Loop Output (Even Numbers):");
	for (int i = 2; i <= 10; i += 2) { //the loop begins with 2 and continues looping 2 values up until it is equal to 10
	    System.out.println("Even: " + i); //displays the value of i that returns true
	}

	System.out.println("\nNested Loops Output (3x3 Grid):");
	for (int row = 1; row <= 3; row++) { //the loop begins with 1 and continues looping until it is equal to 3
	    for (int col = 1; col <= 3; col++) { //for every outer loop, the inner loop begins with 1 and continues looping until it is equal to 3
	        System.out.print("* "); //displays an asterisk
	    }
	    System.out.println(); // Newline
	}

	System.out.println("\nLoop with Break and Continue:");
	for (int i = 1; i <= 10; i++) { //loop begins with 1 and continues looping until it is equal to 10
	    if (i == 7) { //the program will continue if the value is equal to 7
	        continue;
	    }
	    if (i > 8) { //the loop breaks if it is less than 8
	        break;
	    }
	    System.out.println("Number: " + i); //displays the value of i that returns true
	}

    }
}
