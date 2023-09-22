package BT_String;

import java.util.Scanner;

public class Bai2 {
    /*Viết chương trình kiểm tra hợp lệ mật khẩu: aaaaAAAAA1
    * mật khẩu 6 ký tuẹ
    * chứa ít nhất 1 chữ cái
    * chứa ít nhất 1 chữ số
    * 2. Cho nguoi dung nhap vao mat khau login/ so sanh, nếu đăng nhập
    * sai quá 5 lần tự thoát chương trình*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Thiet lap mat khau
        System.out.print("Set your password: ");
        String pw = sc.nextLine();
        for(int i=1; i<=5; i++){
            if(checkMk(pw)==true){
                System.out.println("Thiet lap mat khau thanh cong!");
                break;
            }
            else{
                System.out.print("Mat khau cua ban chua an toan. Nhap lai:");
                pw = sc.nextLine();
            }
        }
        // Dang nhap
        System.out.print("Dang nhap!\nEnter your password: ");
        String x = sc.nextLine();
        for(int j=1; j<=5; j++){
            if(x.equals(pw)){
                System.out.println("Dang nhap thanh cong!");
                break;
            }
            else{
                System.out.print("Mat khau cua ban khong dung. Nhap lai:");
                x = sc.nextLine();
            }
        }
    }

    public static boolean checkMk(String password){
        if(password.length()<6)
            return false;
        // Kiem tra co chu
        boolean hasLetter = false;
        for(char c: password.toCharArray()){
            if(Character.isLetter(c)){
                hasLetter = true;
                break;
            }
        }
        if(hasLetter == false)
            return false;
        //Kiem tra co so
        boolean hasDigit = false;
        for(char c: password.toCharArray()){
            if(Character.isDigit(c)){
                hasDigit = true;
                break;
            }
        }
        if(hasDigit == false)
            return false;
        return true;
    }
}
