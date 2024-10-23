package com.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.beans.Transient;
import java.io.*;

public class TestTime {
    @Test
    public void testRow1(){
        Time time1 = new Time(8,9,58);
        String expectedOutput = "08:09:58";
        String studentOutput = time1.info();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow2(){
        Time time1 = new Time(8,9,58);
        time1.tick();
        String expectedOutput = "08:09:59";
        String studentOutput = time1.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow3(){
        Time time1 = new Time(8,9,58);
        time1.tick();
        time1.tick();
        String expectedOutput = "08:10:00";
        String studentOutput = time1.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow4(){
        Time time1 = new Time(8,9,58);
        time1.tick();
        time1.tick();
        time1.tick();
        String expectedOutput = "08:10:01";
        String studentOutput = time1.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow5(){
        Time time1 = new Time(8,9,58);
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        String expectedOutput = "08:10:02";
        String studentOutput = time1.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow6(){
        Time time1 = new Time(8,9,58);
        for(int i =0; i<12;i++){
            time1.tick();
        }

        String expectedOutput = "08:10:10";
        String studentOutput = time1.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow7(){
        Time time2 = new Time(15,59,58);
        String expectedOutput = "15:59:58";
        String studentOutput = time2.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow8(){
        Time time2 = new Time(15,59,58);
        time2.tick();
        String expectedOutput = "15:59:59";
        String studentOutput = time2.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow9(){
        Time time2 = new Time(15,59,58);
        time2.tick();
        time2.tick();
        String expectedOutput = "16:00:00";
        String studentOutput = time2.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow10(){
        Time time2 = new Time(15,59,58);
        time2.tick();
        time2.tick();
        time2.tick();
        String expectedOutput = "16:00:01";
        String studentOutput = time2.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow11(){
        Time time3 = new Time(23,59,58);
    
        String expectedOutput = "23:59:58";
        String studentOutput = time3.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow12(){
        Time time3 = new Time(23,59,58);
        time3.tick();
    
        String expectedOutput = "23:59:59";
        String studentOutput = time3.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow13(){
        Time time3 = new Time(23,59,58);
        time3.tick();
        time3.tick();
    
        String expectedOutput = "00:00:00";
        String studentOutput = time3.info();

        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    public void testRow14(){
        Time time3 = new Time(23,59,58);
        time3.tick();
        time3.tick();
        time3.tick();
    
        String expectedOutput = "00:00:01";
        String studentOutput = time3.info();

        assertEquals(expectedOutput,studentOutput);
    }
    
    
    
}
