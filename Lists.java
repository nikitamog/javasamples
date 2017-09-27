//Written by Nikita Mogilevsky
//nikitamog@gmail.com

import java.io.*;
import java.util.*;

public class Lists {

    public static void main(String args[]) {
	List<Integer> lista = new ArrayList<Integer>();
	lista.add(9);
	lista.add(8);

	List<Integer> listb = new ArrayList<Integer>();
	listb.add(8);
	listb.add(7);

	System.out.println("a" + lista);
	System.out.println("b" + listb);
	isinit(lista, listb);

	lista.addAll(listb);
	System.out.println("Add b to a: " + lista);

	lista.retainAll(listb);
	System.out.println("Use only commmon elements from b.");
	System.out.println("a: " + lista);
			   
    }

    public static void isinit(List<Integer> a, List<Integer> b) {
	for (int value: a) {
	    System.out.println("Is " + value + " in b? " + b.contains(value));	    
	}
    }
}
