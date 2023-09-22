package Lesson_1;

import java.util.Scanner;

public class Bai10_Scanner_NhapLieu {
    public static void main(String[] args) {
        //Khoi tao mot doi tuong Scanner
        Scanner sc = new Scanner(System.in);

        //Cho phep nhap chuoi
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println("String 1: "+str1);

        //Cho phep nhap so nguyen
        System.out.print("Enter a integer: ");
        int x = sc.nextInt();
        System.out.println("Integer 1: "+x);

        /*Cac kieu du lieu khac:
        * boolean a = sc.nextBoolean();
        * double b = sc.nextDouble();
        * float c = sc.nextFloat(); */

        //Neu gap loi khi nhap nhieu lan dung chung mot doi tuong sc. Ta dung
        System.out.print("Hay nhap ten: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Ten cua ban: "+name);
        // => Moi lan nhap khai bao mot doi tuong moi luon
    }
}
