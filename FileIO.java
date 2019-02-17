/*

  @author: Nikita Mogilevsky

  @description: 
  
  Basic File IO using data files.

 */

import java.io.File;
import java.io.PrintStream; // outputs data
import java.io.FileNotFoundException;
import java.util.Scanner; // reads data

public class FileIO {
    public static void main(String args[])
        throws FileNotFoundException {

        String path = args[0];
        Scanner in = new Scanner(new File(path));
        PrintStream out = new PrintStream(new File("grades.output"));

        //print the lines from the in stream to the out stream
        while(in.hasNextLine()) {
            out.println(in.nextLine());
        }

        System.out.println("Finished! Printed data from " + path);
    }
}
