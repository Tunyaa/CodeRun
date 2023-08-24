package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CombinationsWithRepetitions {

    // Выведите число сочетаний с повторением
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String[] line = reader.readLine().split(" ");
        int n, k;

        k = Integer.parseInt(line[1]);
        n = Integer.parseInt(line[0]) - 1 + k;

        int nFacto = facto(n);
        int kFacto = facto(k);

        int result = nFacto / (kFacto * facto(n - k));

        writer.write(String.valueOf(result));

        reader.close();
        writer.close();

    }

    private static int facto(int num) {
        int result = 1;
        for (int i = 1; i - 1 < num; i++) {
            result = result * i;
        }
        return result;
    }

}
