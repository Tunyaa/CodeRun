
package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hanoi {
    
static int numberOfOperations = 0;
List<
     public static void main(String[] args) throws FileNotFoundException, IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numDiscs = Integer.parseInt(reader.readLine());
        char source = '1';
        char auxiliary = '2';
        char destination = '3';
        
        solveHanoiTower(numDiscs, source, auxiliary, destination);
         System.out.println(numberOfOperations);
    }
    
    public static void solveHanoiTower(int numDiscs, char source, char auxiliary, char destination) {
        numberOfOperations += 1;
        if (numDiscs == 1) {
            System.out.println(source + " " + destination);
            return;
        }
        
        solveHanoiTower(numDiscs - 1, source, destination, auxiliary);
        System.out.println(source + " " + destination);
        solveHanoiTower(numDiscs - 1, auxiliary, source, destination);
        
    }
}
