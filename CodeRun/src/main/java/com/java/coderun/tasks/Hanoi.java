package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Hanoi {

//    Головоломка <<Ханойские башни>> состоит из трёх стержней, пронумеруем их слева направо: 1, 2 и 3. 
//    Также в головоломке используется стопка дисков с отверстием посередине. Радиус дисков уменьшается снизу вверх. 
//            Изначально диски расположены на левом стержне (стержень 1), самый большой диск находится внизу. 
//                    Диски в игре перемещаются по одному со стержня на стержень. Диск можно надеть на стержень, 
//                    только если он пустой или верхний диск на нём большего размера, чем перемещаемый. 
//                    Цель головоломки — перенести все диски со стержня 1 на стержень 3.
// Требуется найти последовательность ходов, которая решает головоломку <<Ханойские башни>>.
    static int numberOfOperations = 0;
    static List<int[]> nums = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numDiscs = Integer.parseInt(reader.readLine());
        int source = 1; //Первый стержень
        int auxiliary = 2; //Второй стержень
        int destination = 3; // Третий стержень

        solveHanoiTower(numDiscs, source, auxiliary, destination);

        System.out.println(numberOfOperations);
        for (int[] num : nums) {
            System.out.println(num[0] + " " + num[1]);
        }
    }

    public static void solveHanoiTower(int numDiscs, int source, int auxiliary, int destination) {
        numberOfOperations += 1;
        if (numDiscs == 1) { 

            nums.add(new int[]{source, destination});
            return;
        }

        solveHanoiTower(numDiscs - 1, source, destination, auxiliary);

        nums.add(new int[]{source, destination});
        solveHanoiTower(numDiscs - 1, auxiliary, source, destination);

    }
}
