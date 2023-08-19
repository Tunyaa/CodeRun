
package com.java.coderun.tasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


// Задача https://coderun.yandex.ru/problem/pin/description?currentPage=1&pageSize=10&rowNumber=1&compiler=java
/* Решение
        Сортируем координаты по возрастанию.
        Расстояние между первыми двумя парами сразу записываем в результат.
        Начинаем с 3го элемента, если расстояние от 3го до 2го меньше чем от 3го до 4го,
        то прибавляем расстояние от 3го до 2го в результат и переходим к следующему элементу,
        иначе прибавляем расстояние от 3го до 4го элемента и переходим через 2 элемента.
        Если элемент последний, сразу прибавляем расстояние к результату.
 */
public class Nails {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int     len     = Integer.parseInt(reader.readLine());
        int[]   nums    = stringToAryInt(reader.readLine());
        
        int result = shortestThreadPath(nums);
        
        writer.write(String.valueOf(result));
        
        reader.close();
        writer.close();
    }
    
    private static int[] stringToAryInt(String line){ // Преобразование строки в массив чисел.
        
        String[]    numsSrting  = line.split(" ");
        int         len         = numsSrting.length;
        int[]       result      = new int[len];
        
        for (int i = 0; i < len; i++) {
            result[i] = Integer.parseInt(numsSrting[i]);
        }
        Arrays.sort(result);                        // Сортировка  по возрастанию
        return result;
    }
    
    public static int shortestThreadPath(int[] nums){ // Поиск минимальной суммарной длины всех ниток.
        
        int result  = nums[1] - nums[0]; 
        int len     = nums.length; 
        
        if(len > 2){
            for (int i = 2; i < len; i++) {
                if(i == len-1){                         // Если последний элемент
                result += nums[i] - nums[i-1];
                }else if (nums[i] - nums[i-1] < nums[i+1] - nums[i]) { // Расстояние от элемента до предыдущего элемента меньше
                    result += nums[i] - nums[i-1];
                }else if (nums[i] - nums[i-1] >= nums[i+1] - nums[i]) { // Расстояние от элемента до следующего элемента меньше
                    result += nums[i+1] - nums[i];
                    i++;
                }
            }
        }
        return result;
    }
}
