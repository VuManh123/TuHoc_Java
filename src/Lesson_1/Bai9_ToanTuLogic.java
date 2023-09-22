package Lesson_1;

public class Bai9_ToanTuLogic {
    public static void main(String[] args) {
        // && , || , !
        int i = 7;
        System.out.println(i>0 && i<10);

        //Tien to , hau to
        // a++, a--
        int x = 100;
        int y = 90;
        int z = 80;
        x++; // x = x+1
        ++y;
        z--;
        System.out.println(x);
        System.out.println(y);

        // Xu ly ++a, --a truoc sau do moi tinh a++, a--
        int a = 2;
        int b = 3;
        int c = a++ - ++b +1; //Tinh ++b -> phep toan con lai -> a++
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
