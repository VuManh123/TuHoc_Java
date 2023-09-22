package Lesson_2;

public class Bai17_Break_Continue {
    public static void main(String[] args) {
        //Tinh tong tu 1->5 nhung bo qua 3
        int sum=0;
        for(int i=0; i<=5; i++){
            if(i==3)
                continue;
            else
                sum += i;
        }
        System.out.println("Sum = "+sum);
    }
}
