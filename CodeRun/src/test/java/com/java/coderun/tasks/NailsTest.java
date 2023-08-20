
package com.java.coderun.tasks;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NailsTest {   
   
    @Test
    public void shortestThreadPathMinIntervalMinPoints(){ //Минимальная длина, минимальное количество точек
        int[] ary = new int[]{0,1};        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(1, result);
    }
    
    @Test
    public void shortestThreadPathMinInrervalMaxPoints(){ // Минимальная длина, максимальное количество точек.
        int[] ary = new int[10001];        
        for (int i = 0; i < ary.length; i++) {
            ary[i] = i;
        }
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(5001, result);
    }
    
    @Test
    public void shortestThreadPathMaxIntervalMinPoints(){ // Максимальная длина, минимальное количество точек.
        int[] ary = new int[]{0,10000};        
        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(10000, result);
    }
    
    @Test
    public void shortestThreadPath1(){ //           3 4 6 12 13 14
        int[] ary = new int[]{3,4,6,12,13,14};     //1 2 6  1  1  
        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(5, result);
    }
    
    @Test
    public void shortestThreadPath2(){ //           1 2 4 7 9 10
        int[] ary = new int[]{1,2,4,7,9,10};       //1 2 3 2 1
        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(5, result);
    }
    
    @Test
    public void shortestThreadPath3(){ //           2 7 10 17 22 27
        int[] ary = new int[]{2,7,10,17,22,27};    //    
        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(17, result);
    }
    
    @Test
    public void shortestThreadPath4(){ //           20 70 100 170 220 270
        int[] ary = new int[]{2,7,10,17,22,27};    // 50 30  70  50  50
        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(17, result);
    }
    
    @Test
    public void shortestThreadPath5(){ //               2 7 10 17 22 27 28
        int[] ary = new int[]{2,7,10,17,22,27,28};     //5 3  7  5  5  1  
                                                        //5 1 7 5
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(18, result);
    }
    
    @Test
    public void shortestThreadPath6(){ //               //1 3 5 9 13 15 17
        int[] ary = new int[]{1,3,5,9,13,15,17};     //  
                                                        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(10, result);
    }
    
    @Test
    public void shortestThreadPath7(){ //               //2 6 10 14 18 22 26 30
        int[] ary = new int[]{2,6,10,14,18,22,26,30};     //  
                                                        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(16, result);
    }
    
     @Test
    public void shortestThreadPath8(){ //               //2 6 10 14 18 22 26 30 34
        int[] ary = new int[]{2,6,10,14,18,22,26,30,34};     //  
                                                        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(20, result);
    }
    
     @Test
    public void shortestThreadPath9(){ //               //2 6 10 14 18 22 26 30 34 38
        int[] ary = new int[]{2,6,10,14,18,22,26,30,34,38};     //  
                                                        
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(20, result);
    }
    
    @Test
    public void shortestThreadPath10(){ //               //         1,2,4,7,9,10,11,13,16,18,19
        int[] ary = new int[]{1,2,4,7,9,10,11,13,16,18,19};     //   1 1 3 2 6  6  2  3  2  1
                                                                   //1  1 2   1
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(10, result);
    }
    
    @Test
    public void shortestThreadPath11(){ //               //             1 2 3 6 8 12 14 16 17 
        int[] ary = new int[]{1 ,2 ,3 ,6 ,8 ,12, 14 ,16 ,17 };     //    1 1 3 2 4  2  4  1
                                                                       //1 1   2    2     1
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(7, result);
    }
    
    @Test
    public void shortestThreadPath12(){ //               //             1 2 3 6 8 12 14 16 17 
        int[] ary = new int[]{1 ,2 ,3 ,6 ,8 ,12, 14 ,16 ,17, 18 };     //    1 1 3 2 4  2  4  1
                                                                       //1 1   2    2     1
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(8, result);
    }
    
    @Test
    public void shortestThreadPath13(){ //               //             1 2 3 4 5 
        int[] ary = new int[]{1 ,2 ,3 ,4, 5};     //    
                                                                       
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(3, result);
    }
    
    @Test
    public void shortestThreadPath14(){ //               //             1 2 3 4 5 
        int[] ary = new int[]{56 ,46 ,37 ,29 ,22 ,16 ,11 ,7 ,4 ,2 ,1};     //    
                                                                       
        int result = Nails.shortestThreadPath(ary);
        
        assertEquals(31, result);
    }
}
