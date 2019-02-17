import java.io.*;
import java.util.Scanner;

public class basicoutput {
    
    public static void main(String[] args) {
	System.out.println("Hello world!");
        System.out.println();
        bob(5);
        System.out.println();
        bob(7);

        int a, b, c;
        a = 5;
        b = a;
        c = a;
        a = 4;
        System.out.println("C'est <<c>>: " + c);

        Scanner in = new Scanner(System.in);
        System.out.print("Please type something: ");
        String a = "hello";
        System.out.println("a to uppercase " + a.toUpperCase());
        
        // q or Q if(string == 'q' || string == 'Q')
        // what if both q and Q were just Q? then only 1 comparison
        // can be made.
        // check for double
        System.out.println("hasNextDouble is " + in.hasNextDouble());

        // check for Int
        System.out.println("hasNextInt is " + in.hasNextInt());
        
        System.out.println("next()'s value is " + in.next());

        
        
    }
    
    public static void bob(int b) {
        if (b < 3) {
            return;
        }
        System.out.println(b*b);
        return;
    }
}
