package com.java.coderun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CodeRun {

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
        Random random = new Random();
        int size = random.nextInt(1,20);
        
        writer.write(String.valueOf(size));
        writer.newLine();
        
        for (int i = 0; i < size; i++) {
            int len = random.nextInt(1, 1000_000);
            
            writer.write(String.valueOf(len));
            writer.newLine();
            int[] nums = new int[len];
            
            for (int j = 0; j < len; j++) {
                nums[j] = random.nextInt(1,1_000_000_000);
//                writer.write(String.valueOf(random.nextInt(1,1_000)));
//                writer.write(" ");
            }
            
            Arrays.sort(nums);
            
            for (int j = 0; j < nums.length; j++) {
                writer.write(String.valueOf(nums[j]));
                writer.write(" ");
            }
            writer.newLine();
        }
        
        writer.close();
        
    }
}
