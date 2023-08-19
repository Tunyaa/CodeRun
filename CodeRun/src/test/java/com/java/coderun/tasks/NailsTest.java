
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
    
}
