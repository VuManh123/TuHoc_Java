package Lesson_3;

import java.util.Random;

public class Bai24_Random {
    public static void main(String[] args) {
        Random rd = new Random();
        // Chay ngau nhien so nguyen
        int x = rd.nextInt(-10,10); //Chay tu -10 -> nho hon 10
        System.out.println("x = "+x);
        // Chay ngau nhien so thuc
        double y = rd.nextDouble(-10, 10);
        System.out.println("y = "+y);
    }
}
