package Lesson_1;

public class Bai6_EpKieuDuLieu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // Ep kieu dung: (kieu du lieu)
        double kq = (double)a/b; // Ep a tu int -> double
        System.out.println(kq);

        //Ep kieu hep
        int c = 128;
        byte d = (byte) c;
        System.out.println(d);
        System.out.println(c);
    }
}
