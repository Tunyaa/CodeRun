
package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Sort {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            int lineQuantity = Integer.parseInt(reader.readLine());
            String[] line = reader.readLine().split(" ");
            int[] nums = new int[lineQuantity];
            for (int i = 0; i < line.length; i++) {
                nums[i] = Integer.parseInt(line[i]);
            }

            sort(nums);
            
            for (int i = 0; i < nums.length; i++) {
                writer.write(String.valueOf(nums[i]));
            }
            
            writer.close();
            reader.close();

        }catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    static void sort(int[] ary) {
        int t = 0;
        for (int i = 0; i < ary.length; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[j] < ary[i]) {
                    t = ary[j];
                    ary[j] = ary[i];
                    ary[i] = t;
                }
            }
        }
    }
}
