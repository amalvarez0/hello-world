
/**
 *
 * @author Alex
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) throws IOException 
    {
        String fileName = "HelloTest.txt";
        BufferedReader r = new BufferedReader(new FileReader(fileName));
    
        for (String line; (line = r.readLine()) != null;) 
        {
            System.out.println(line);
        }
    }
}
