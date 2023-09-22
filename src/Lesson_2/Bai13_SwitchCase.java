package Lesson_2;

import java.util.Scanner;

public class Bai13_SwitchCase {
    //Tao menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Tim theo ten");
        System.out.println("2: Tim theo MSSV");
        System.out.println("3: Tim theo CCCD");
        System.out.println("4: Tim theo so dien thoai");
        System.out.print("Enter your selection: ");
        int select = sc.nextInt();
        switch (select){
            case 1:
                System.out.println("Ban da chon tim kiem theo ten");
                break;
            case 2:
                System.out.println("Ban da chon tim kiem theo MSSV");
                break;
            case 3:
                System.out.println("Ban da chon tim kiem theo CCCD");
                break;
            case 4:
                System.out.println("Ban da chon tim kiem theo so dien thoai");
                break;
            default:
                System.out.println("Lua chon chua ban khong hop le!");
        }
    }
}
