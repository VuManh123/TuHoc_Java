package Lesson_2;

public class Bai18_ForLongNhau {
    public static void main(String[] args) {
        //Cac toa do
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                System.out.print(i+""+j+"\t");
            }
            System.out.println("");
        }
        System.out.println("\n\n");

        //Ve chu n
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(j==1 || j==7 || j==i)
                    System.out.print("*"+"\t");
                else System.out.print(" "+"\t");
            }
            System.out.println("");
        }
    }
}
