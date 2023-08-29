package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class MultiListSort {
//    Задано n отсортированных по неубыванию последовательностей.
//
//Требуется найти отсортированную по неубыванию конкатенацию этих последовательностей.
//   В  первой строке задано одно число n — количество отсортированных последовательностей.
//Каждая из следующих последовательностей задано в формате: В первой строке m — количество элементов последовательности.
//
//Во второй сами элементы 

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            long startTime = System.currentTimeMillis();
            int lineQuantity = Integer.parseInt(reader.readLine());
            LinkedList<LinkedList<Integer>> list = new LinkedList<>();
            LinkedList<Integer> result = new LinkedList<>();

            for (int i = 0; i < lineQuantity; i++) {
                list.add(new LinkedList<>());
                int size = Integer.parseInt(reader.readLine());
                String[] line = reader.readLine().split(" ");
                for (int j = 0; j < size; j++) {
                    list.get(i).add(Integer.parseInt(line[j]));
                }
            }

            result = multiListSort(list);
            String str = result.toString().replaceAll(",|\\[|\\]", " ");

            writer.write(str);
long endTime = System.currentTimeMillis();
long timeElapsed = endTime - startTime;
            System.out.println(timeElapsed);
            writer.close();
            reader.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static LinkedList<Integer> multiListSort(LinkedList<LinkedList<Integer>> list) {
        LinkedList<Integer> result = new LinkedList<>();

        while (!list.isEmpty()) {
            int index = 0;
            for (int i = 1; i < list.size(); i++) {

                index = list.get(index).peek() < list.get(i).peek() ? index : i;

            }
            result.add(list.get(index).poll());
            
            for (int i = 0; i < list.size(); i++) { //Проверка на пустой список
                if (list.get(i).isEmpty()) {
                    list.remove(i);
                }
            }
        }

        return result;
    }
    
    public static void inputTXTCreated() throws IOException {
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
