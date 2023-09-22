package Lesson_3;

import java.util.Scanner;

public class Bai21_Function {
    // Khai bao ham (co return)
    public static int Cong(int x, int y){
        return x+y;
    }
    // Khai bao thu tuc (khong co return)
    public static void xinChao(String sex){
        if (sex.equals("male"))
            System.out.println("Chao quy ong");
        else if(sex.equals("female"))
            System.out.println("Chao quy ba");
    }
    // Ham main
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap gia tri so thu hai: ");
        int b = sc.nextInt();
        sum = Cong(a, b);
        System.out.println("Tong hai so la: "+sum);

    }
}
