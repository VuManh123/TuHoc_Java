package Lesson_2;

import java.util.Scanner;

public class Bai12_ToanTu3Ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int x = sc.nextInt();
        String result = (x%2==0)?"So vua nhap la chan!" : "So vua nhap la so le!";
        System.out.println(result);
    }
}
