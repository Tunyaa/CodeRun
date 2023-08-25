
package com.java.coderun.tasks;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StonesTest {
    
    public StonesTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void winLose0_0() { 
        Stones stones = new Stones();
        String result = stones.winLose(0, 0);      // 0 0
        
        assertEquals("Loose", result);
    }
    
    @Test
    public void winLose0_10() { 
        Stones stones = new Stones();
        String result = stones.winLose(0, 10);      // 0 10
        
        assertEquals("Loose", result);
    }
    
    @Test
    public void winLose0_9() { 
        Stones stones = new Stones();
        String result = stones.winLose(0, 9);      // 0 9
        
        assertEquals("Win", result);
    }
    
    @Test
    public void winLose10_0() { 
        Stones stones = new Stones();
        String result = stones.winLose(10, 0);      // 10 0
        
        assertEquals("Loose", result);
    }
    
    @Test
    public void winLose10_10() { 
        Stones stones = new Stones();
        String result = stones.winLose(10, 10);      // 10 10
        
        assertEquals("Loose", result);
    }
    
    @Test
    public void winLose6_4() { 
        Stones stones = new Stones();
        String result = stones.winLose(6, 4);      // 6 4
        
        assertEquals("Loose", result);
    }
    
    @Test
    public void winLose6_5() { 
        Stones stones = new Stones();
        String result = stones.winLose(6, 5);      // 6 5
        
        assertEquals("Win", result);
    }
    
    @Test
    public void winLose7_4() { 
        Stones stones = new Stones();
        String result = stones.winLose(7, 4);      // 7 4
        
        assertEquals("Win", result);
    }
    
    @Test
    public void winLose7_5() { 
        Stones stones = new Stones();
        String result = stones.winLose(7, 5);      // 7 5
        
        assertEquals("Win", result);
    }
    
    @Test
    public void winLose4_4() { 
        Stones stones = new Stones();
        String result = stones.winLose(4, 4);      // 4 4
        
        assertEquals("Loose", result);
    }
    
}
