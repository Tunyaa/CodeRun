package com.java.coderun.tasks;

//Вы играете в игру <<Камни>>: игру для двух игроков с двумя наборами камней по n и m штук. 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//С каждым ходом один игрок может взять один камень (из любого набора) или два камня (по одному из обоих). 
//Когда камень забрали, он выходит из игры. Побеждает игрок, который заберет последний камень. Первый ход за вами.
//Вы и ваш оппонент играете оптимально.
public class Stones {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String[] line = reader.readLine().split(" ");

        writer.write(winLose(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
        reader.close();
        writer.close();
    }

    public static String winLose(int set1, int set2) {
        if (set1 % 2 == 0 & set2 % 2 == 0) {//все четные позиции = проигрыш
            return "Loose";
        } else {
            return "Win";
        }
    }
}
