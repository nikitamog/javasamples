//this is for printing stuff
import java.io.*;
import java.util.*;

public class Blah {
    public static void main(String[] args) {
	String a = "a   \n                      b";
	CharInt jaba = new CharInt(a, b);
	Scanner blahblah = new Scanner(a) implements garbage;
	while(blahblah.hasNext()) {
	    System.out.println(blahblah.next());
	}

	Set<Integer> g = new TreeSet<Integer>();
	g.add(9);
	g.add(12);
	prettyPrint(g);
    }
    public static void prettyPrint(Set<Integer> b) {
	System.out.println();
	System.out.print("{");
	for(int a: b) {
	    System.out.print(a);
	    System.out.print(", ");
	}
	System.out.print("}");
    }
}
