import java.util.*;
import java.io.*;


class GuessingGame {
    public static void main(String[] args) {

      	//print hello!
	System.out.println("Hello! Let's play a guessing game!");

	//make random object
	Random r = new Random();
	//generate random number [1,10]
	int randomnum = r.nextInt(10);
	
	//Take input from the user.
	System.out.println("I chose an integer between 1 and 10.");
	System.out.print("Make an educated guess: ");

	//make Scanner object
	Scanner a = new Scanner(System.in);
	
	//get # from user.
	int guess = a.nextInt();

  	//stop when the guess is correct.
	while(guess != randomnum) {
	    //check if too high
	    if (guess > randomnum) {
		System.out.println();
		System.out.println("Your guess is too High!");
	    }
	    //if not high, or equal, then low
	    else {
		System.out.println();
		System.out.println("Your guess is too Low!");
	    }
	    //Ask again
	    System.out.print("Guess again:");
	    //Get # from user.
	    guess = a.nextInt();
	}

	//Assuming the guess is correct.
	System.out.println();
	System.out.println("You got it! Congratulations, my number was "
			   + randomnum + ".")
;
    }//main
}//class
