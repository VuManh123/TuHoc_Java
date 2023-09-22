package Lesson_1;

import java.util.Scanner;

public class BT1_TinhPS_HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();
        double P = 2 * Math.PI * r;
        double S = Math.PI * Math.pow(r, 2);
        System.out.println("Chu vi hinh tron: "+P);
        System.out.println("Dien tich hinh tron: "+S);
    }
}
