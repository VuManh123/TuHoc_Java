package Lesson_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai22_ThuVien_DateTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        /*int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);*/

        // Set ngay thang nam theo y muon
        cal.set(Calendar.YEAR,2003);
        cal.set(Calendar.MONTH,1);
        cal.set(Calendar.DATE,9);
        int yearBorn = cal.get(Calendar.YEAR);
        //Trong Java thang chay tu 0 -> 11
        int monthBorn = cal.get(Calendar.MONTH);
        int dayBorn = cal.get(Calendar.DATE);
        System.out.println("Date of Birth: "+dayBorn+"/"+(monthBorn+1)+"/"+yearBorn);

        // Xuat theo Ngay/Thang/Nam, gio phut giay
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        // Tao doi tuong de get time
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }
}
