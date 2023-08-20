
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
        // 1 2 4 7 11 16 22 29 37 46 56 66
        int result  = nums[1] - nums[0]; //
        int len     = nums.length; //
        int center, left, right;
        
        if(len > 2){//
            result += nums[len-1] - nums[len-2];
            if (len >= 5) {// i=2
                for (int i = 2; i < len-2; i++) {
                    center = nums[i+1] - nums[i];//
                    left = nums[i] - nums[i-1];//
                    right = nums[i+2] - nums[i+1];//
                    
                    if (i == len - 3) {//если элемент 3й уперся в последнюю пару
                        result += left <= center ? left : center;
                    }else if (i >= len -2) {// если элемент часть последней пары
                        return result;
                    }else if (center< right + left) { //
                        /*
                        if (left < right) {
                            result += left;
                        }else{
                            result += center;
                            i++;
                        }
                        */
                        
                        result += center;
                        i++;
                    }else {
                        result += left;
                    }
                }
            }            
        }
        return result;
             //       
           
    }
}
