/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alex
 */
public class HelloWorldTest {

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
