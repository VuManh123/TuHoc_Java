package Lesson_2;

import java.util.Scanner;

public class Bai12_BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        double a = sc.nextDouble();
        // Xu ly theo toan tu 3 ngoi
        String result = (a>=8.5)?"Gioi" :
                (a>=7 && a<=8.5)?"Kha" :
                        (a>=5 && a<=7)? "Trung binh" : "Kem";
        System.out.println("Voi diem: "+a+". Ban xep loai: "+result);
    }
}
