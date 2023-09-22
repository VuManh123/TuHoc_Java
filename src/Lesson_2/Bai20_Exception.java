package Lesson_2;

public class Bai20_Exception {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        try{
            int c=a/b;
            System.out.println("c = "+c);
        }
        catch(Exception ex){
            System.out.println("Co loi!");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Co loi hay khong deu phai lam cai nay!");
        }
        System.out.println("Da xu ly ngoai le!");
    }
}
