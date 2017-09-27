import java.util.*;

public class Stacks {
    public static void main(String[] args) {
	Stack<Integer> a = new Stack<Integer>();
	Stack<Integer> b = new Stack<Integer>();

	b = a;

	System.out.println(a==b);

    }
}
