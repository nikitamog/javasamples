
import java.util.*;
import java.io.*;


public class StringCompare {
    public static void main(String[] args) {
        System.out.println("apple".equals("banana"));
        String[] baby = {"S", "C", "J", "Z", "R"};
        mystery(Arrays.asList(baby));
    }
    public static void mystery(List<String> list) {
        Set<String> result = new TreeSet<String>();
        for (String element : list) {
            if (element.compareTo(list.get(0)) < 0) {
                result.add(element);
                    }
            else {
                result.clear();
                    }
        }
        System.out.println(result);
    }
}
