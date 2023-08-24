package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class OverlappingIntervals {
    
//    Задача: 
//            Задано n интервалов. Требуется найти максимальное количество взаимно непересекающихся интервалов.
//                    Два интервала пересекаются, если они имеют хотя бы одну общую точку.
    
//    В первой строке задано одно число n (1 <= n <= 100)
//    В следующихn строках заданы интервалы l, r (1 <= l <= r <= 50)

    public static void main(String[] args) throws FileNotFoundException, IOException {

//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int intervalQuantity = Integer.parseInt(reader.readLine());// количество интервалов
        int[][] interval = new int[intervalQuantity][2];
        int numberOfIntervals = 0;
        List<int[]> intervals = new ArrayList<>(intervalQuantity); 

        for (int i = 0; i < intervalQuantity; i++) {
            String[] line = reader.readLine().split(" ");
            interval[i][0] = Integer.parseInt(line[0]);
            interval[i][1] = Integer.parseInt(line[1]);

            intervals.add(interval[i]); // Список интервалов
        }

        while (!intervals.isEmpty()) {
            int smallestValue = intervals.get(0)[1];// 
            for (int j = 0; j < intervals.size(); j++) {//ищем интервал с нименьшим значением окончания
                smallestValue = smallestValue > intervals.get(j)[1] ? smallestValue = intervals.get(j)[1] : smallestValue;
            }
            final int value = smallestValue;
//            intervals = intervals.stream().filter(n -> n[0] > value & n[1] > value).toList();

            for (int i = 0; i < intervals.size(); i++) { // Удаляем из списка интервалы со значениями <=
                if (intervals.get(i)[0] <= value | intervals.get(i)[1] <= value) {
                    intervals.remove(i);
                    i = i - 1;
                }
            }

            numberOfIntervals += 1;

        }

        System.out.println(numberOfIntervals);

    }
}
