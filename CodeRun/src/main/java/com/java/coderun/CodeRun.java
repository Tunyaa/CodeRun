
package com.java.coderun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeRun {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        System.out.println(reader.readLine());
    }
}
