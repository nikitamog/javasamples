
/*
@author: Nikita Mogilevsky
@email: nikitamog@gmail.com
 */

import java.util.*;// not sure
import java.io.*;// for files and streams
import java.lang.*; // for sqrt

class LoopBreaks {
    public static void main(String args[]) throws FileNotFoundException{
        
        File textoutput = new File("/home/nikita/code/javasamples/textoutput.txt");
        
        PrintStream greatstream = new PrintStream(textoutput);
        
        for (int i = 0; i < 5; ++i) {
            greatstream.print(i);
            greatstream.println("Hello!");
        }
        
        greatstream.close();
        
    }
}

