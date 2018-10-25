import java.io.*;

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
    }
    
    public static void bob(int b) {
        if (b < 3) {
            return;
        }
        System.out.println(b*b);
        return;
    }
}
