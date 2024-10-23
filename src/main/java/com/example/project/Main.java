package com.example.project;


public class Main {

   public static void main(String[] args) {
    Time time3 = new Time(10,14);
    time3.tick();
    System.out.println(time3.info());
    time3.tick();
    
    String expectedOutput = "00:00:00";
    String studentOutput = time3.info();
    System.out.println(studentOutput);


   }
}
