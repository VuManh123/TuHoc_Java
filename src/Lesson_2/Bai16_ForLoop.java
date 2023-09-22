package Lesson_2;

public class Bai16_ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<=10; i+=2){
            sum+=i;
        }
        System.out.println("Tong cac so chan tu 0 den 10: "+sum);
    }
}
