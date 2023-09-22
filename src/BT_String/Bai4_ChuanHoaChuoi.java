package BT_String;

import java.util.Scanner;

public class Bai4_ChuanHoaChuoi {
    /*Chuan hoa chuoi voi quy tac:
    * 1. Không có khoảng trắng dư thửa
    * 2. Các từ cách nhau = 1 khoảng trắng
    * 3. Ký tự đầu tiên tu phải viết hoa*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String ms = sc.nextLine();
        System.out.println("Sau khi chuan hoa ta duoc: "+chuanHoa(ms));
    }
    public static String chuanHoa(String input){
        // Xoa khoang trang dau va cuoi
        input = input.trim();
        String[] words = input.split("\\s+");
        for(int i = 0; i<words.length; i++){
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0,1);
            firstChar  =firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        // Lien ket mang thanh chuoi
        return String.join(" ", words);
    }
}
