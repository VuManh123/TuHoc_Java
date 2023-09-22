package BT_String;

import java.util.Scanner;

public class Bai3 {
    /*Viết Ct chuyển tin nhắn sang mật mã theo bảng:
    * a = "abcdefhgijklmnopqrstuvwxyz"
    * b = "zxcvbnmasdfghjklqwertyuiop"*/
    public static void main(String[] args) {
        String a = "abcdefhgijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String input = sc.nextLine();
        String output = "";
        for(int i=0; i<input.length();i++){
            char character = input.charAt(i);
            // Tim vi tri cua ki tu a
            int index = a.indexOf(character);
            if(index == -1){
                output += character;
            }
            else{
                output += b.charAt(index);
            }
        }
        System.out.print("Sau khi ma hoa, tin nhan la: "+ output);
    }
}
