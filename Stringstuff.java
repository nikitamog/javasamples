import java.util.*;

public class Stringstuff {
    public static void main(String[] args) {
	String a = "blah";
	System.out.println(a.length());
	Random b = new Random();
	//for(int i = 0; i < 20; ++i){
	//    System.out.println(b.nextInt(3));
	//}

	int c[] = {3, 4, 5, 6, 9, 200};
	System.out.println(c.length);
	//Computer counts from 0.
	String d[] = {"haha", "heehee"};
	System.out.println(d[1]);

	for (int i = 0; i < d.length; i++) {
	    System.out.println("d[" +i+"]: "+d[i]);
	}
    }
}
