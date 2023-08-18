
package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


// Задача https://coderun.yandex.ru/problem/pin/description?currentPage=1&pageSize=10&rowNumber=1&compiler=java

public class Nails {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int     len     = Integer.parseInt(reader.readLine());
        int[]   nums    = stringToAryInt(reader.readLine());
        
        

        reader.close();
        writer.close();
    }
    
    private static int[] stringToAryInt(String line){
        
        String[] numsSrting = line.split(" ");
        int len = numsSrting.length;
        int[] result = new int[len];
        
        for (int i = 0; i < len; i++) {
            result[i] = Integer.parseInt(numsSrting[i]);
        }
        
        return result;
    }
}
