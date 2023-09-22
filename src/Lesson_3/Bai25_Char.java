package Lesson_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai25_Char {
    public static void main(String[] args) {
        // Khai bao
        char ch = 'A';
        char ch1 = 65; //Ma ASCII
        char ch2;

        //Nhap lieu
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(1);
        System.out.println(ch4);*/

        // Compare
        System.out.println(Character.compare('a','b'));
        System.out.println(Character.compare('a','a'));
        System.out.println(Character.compare('b','a'));

        //Char method
        char ch5 = ' ';
        char ch6 = '1';
        char ch7 = 'a';
        char ch8 = 'A';
        //Kiem tra la chu so
        System.out.println(Character.isDigit(ch6));
        //Kiem tra la ki tu
        System.out.println(Character.isLetter(ch8));
        //kiem tra la khoang trang
        System.out.println(Character.isSpaceChar(ch5));
        //Kiem tra chu hoa, chu thuong
        System.out.println(Character.isUpperCase(ch8));
        System.out.println(Character.isLowerCase(ch7));
    }
}
