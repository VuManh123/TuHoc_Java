package Lesson_3;

import java.util.Calendar;
import java.util.Scanner;

public class Bai22_Vidu {
    public static void main(String[] args) {
        // Viet ct nhap ngay thang nam va in ra man hinh
        int day, year, month, age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dayBorn: ");
        day = sc.nextInt();
        System.out.print("Enter dayBorn: ");
        month = sc.nextInt();
        System.out.print("Enter dayBorn: ");
        year = sc.nextInt();

        // Khoi tao
        Calendar birthDay = Calendar.getInstance();
        //Set ngay thang nam sinh
        birthDay.set(year, month-1, day);
        int namSinh = birthDay.get(Calendar.YEAR);
        int thangSinh = birthDay.get(Calendar.MONTH);
        int ngaySinh = birthDay.get(Calendar.DATE);
        System.out.println("Your Date of Birth: "+ngaySinh+"/"+(thangSinh+1)+"/"+namSinh);

        // Lay nam hien tai
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        int thangHienTai = now.get(Calendar.MONTH);
        int ngayHienTai = now.get(Calendar.DATE);
        age = namHienTai - namSinh;
        if(thangHienTai>thangSinh)
            age -= 1;
        else if(thangHienTai==thangSinh){
            if(ngayHienTai>ngaySinh)
                age -= 1;
        }
        System.out.println("Tuoi ban la "+age);
    }
}
