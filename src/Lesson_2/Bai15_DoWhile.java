package Lesson_2;

public class Bai15_DoWhile {
    public static void main(String[] args) {
        //Tinh tong cac so tu 1 den 5
        int a = 1;
        int sum = 0;
        do{
            sum += a;
            a++;
        }while(a<=5);
        System.out.println("Sum = "+sum);

        //Vong lap while(true)
        int n=1;
        while(true){
            ++n;
            System.out.println("n = "+n);
            if(n==5){
                break;
            }
        }
    }
}
