import java.util.*;
import java.io.*;

public class Whileloops {

    public static int NUMBER = 4;
    
    public static void main(String[] args) {
	/* Make a while loop that prints
	   'hahaha' 30 times
	*/
	int a[] = {5,4,6};
	int counter = 1;
	//counts # of times in loop
	while(counter < 3) {
	    //print hahaha
	    System.out.println("haha");
	    counter++;
	}
	//use method
	blah(2);
	blah();
        System.out.println();
        
        int max = 5;
        
        for (int i = 1; i <= max; ++i) {
            for (int j = 0; j < max; ++j) {
                for (int k = 0; k < j; ++k) {
                    System.out.print("");
                }
                System.out.print(".");
        }
            System.out.println();
        }
    }

    public static void blah() {
	System.out.println();
	for (int i = 0; i < NUMBER; ++i) {
	    System.out.print("blah blah ");
	}
    }
    
    // print 'blah blah'
    public static void blah(int g) {
	//print blah
	System.out.println();
	for (int i = 0; i < g; ++i) {
	    System.out.print("blah blah ");
	}
    }
}
