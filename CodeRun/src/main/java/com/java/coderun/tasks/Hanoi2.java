package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi2 {

//    Головоломка <<Ханойские башни>> состоит из трёх стержней, пронумеруем их слева направо: 1, 2 и 3. 
//    Также в головоломке используется стопка дисков с отверстием посередине. Радиус дисков уменьшается снизу вверх. 
//            Изначально диски расположены на левом стержне (стержень 1), самый большой диск находится внизу. 
//                    Диски в игре перемещаются по одному со стержня на стержень. Диск можно надеть на стержень, 
//                    только если он пустой или верхний диск на нём большего размера, чем перемещаемый. 
//                    Цель головоломки — перенести все диски со стержня 1 на стержень 3.
// Требуется найти последовательность ходов, которая решает головоломку <<Ханойские башни>>.
//    Теперь головоломка состоит из четырех стержней, а цель головоломки — перенести все диски со стержня 1 на стержень 4.
//    Найдите минимальное количество ходов, за которое можно решить головоломку.
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numDiscs = Integer.parseInt(reader.readLine());

        System.out.println(hanoi4StepsQuantity(numDiscs));

    }
    //Решение: Есть один основной стержень, один целевой и 2 вспомогательных.
    // размещаем половину, от общего количества дисков, на одном вспомогательном стержне hanoi4,
    // и половину(или меньшую половину, чтобы самый большой диск остался на основном стержне)
    // на втором вспомогательном стержне hanoi3. Например для 8 дисков расположение ( 1 3 4 0).
    // Для 9 дисков (1 4 4 0). это будет ровно половина всех действий + 1(перенос самого большого диска на целевой стержень)
    // Для hanoi3 результатом будет (2 в степени N) -1.
    // Для hanoi4 результатом будет hanoi4 для n / 2, при (n == 1) hanoi4 = 1.

    public static int hanoi4StepsQuantity(int diskQuantity) {
        if (diskQuantity == 0) {
            return 0;
        }

        if (diskQuantity == 1) {
            return 1;
        }
        int hanoi4 = diskQuantity / 2;
        int hanoi3 = diskQuantity % 2 == 0 ? diskQuantity / 2 - 1 : diskQuantity / 2;

        return (hanoi4StepsQuantity(hanoi4) + (int) Math.pow(2, hanoi3) - 1) * 2 + 1;

    }
    //Исправить
    //5,9,13,17,25,33,41,49 - r
    //3 4 5  6  7  8  9  10 - n
    //1 1 2  2  3  3  3  3  - /3
    //1 2 2  3  3  4  5  6  - /4
    //0 0 3  3  7  7  7  7  - r/3

}
