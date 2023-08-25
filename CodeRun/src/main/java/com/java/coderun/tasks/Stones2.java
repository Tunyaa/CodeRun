
package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Вы играете в игру <<Камни>>: игру для двух игроков с двумя наборами камней по n и m штук. 
//С каждым ходом один игрок может забрать следующие комбинации камней:
//Взять один камень из любого набора.
//Взять два камня из какого-то одного набора
//Взять два камня из одного и один из другого.
//Когда камень забрали, он выходит из игры. Побеждает игрок, который заберет последний камень. Первый ход за вами.
//
//Вы и ваш оппонент играете оптимально.

public class Stones2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String[] line = reader.readLine().split(" ");

        writer.write(winLose(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
        reader.close();
        writer.close();
    }

    public static String winLose(int set1, int set2) {
        if (Math.abs(set1 - set2) % 3 == 0) {
            return "Loose";
        } else {
            return "Win";
        }
    }
}
