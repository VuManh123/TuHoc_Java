package Lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai27_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong pt trong mang: ");
        int n = sc.nextInt();
        int[] M = new int[n];
        //1. Nhap du lieu cho tung phan tu trong mang
        System.out.println("Nhap cac phan tu trong mang:");
        for( int i = 0; i<n; i++){
            M[i]=sc.nextInt();
        }
        System.out.print("Mang la: ");
        for( int i = 0; i<n; i++){
            System.out.print(M[i]+" ");
        }
        System.out.println("\n");

        //2. Sap xep mang tang dan
        Arrays.sort(M);
        System.out.print("Mang theo thu tu tang dan: ");
        System.out.println(Arrays.toString(M));

        //3. Dao nguoc mang
        for(int i=0, j=M.length-1; i<j; i++, j--){
            int tmp = M[i];
            M[i] = M[j];
            M[j] = tmp;
        }
        System.out.print("Mang tang sau khi dao nguoc: ");
        System.out.println(Arrays.toString(M));

        //4. Clone them 1 mang
        int[] M1 = M.clone();
        System.out.print("Mang clone la: ");
        System.out.print(Arrays.toString(M1));
        System.out.println("\n");

        // 5. Tim phan tu va in ra index neu co
        int[] array = {3, 4, 5, 1, 4};
        System.out.print("Nhap vao so ban muon tim: ");
        int so = sc.nextInt();
        boolean check = false;
        String viTri = "";
        for(int i=0; i<array.length; i++){
            if(array[i]==so){
                viTri += (i + " ");
                check = true;
            }
        }
        if(check==false)
            System.out.println("Khong tim thay!");
        else{
            System.out.println("Tim thay o vi tri index la: "+viTri);
        }
    }
}
