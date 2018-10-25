
import java.io.*;
import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Hey, you! Type something: ");
        
        String Bigstring = console.nextLine();

        System.out.println("Thank you! Type something else.");

        String Smallstring = console.next();

        System.out.println("This is Bigstring: " + Bigstring);
        System.out.println("This is Smallstring: " + Smallstring);

        Scanner Linething = new Scanner(Bigstring);

        System.out.println(Linething.next());
        System.out.println(Linething.next());
        System.out.println(Linething.next());
        
        
    }
    
}
