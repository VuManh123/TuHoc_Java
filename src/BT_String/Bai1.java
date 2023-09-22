package BT_String;

public class Bai1 {
    /*Cho:
    String str1 = "English = 78 Science = 83 Math = 68 History = 65"
    1. Tính tổng các số trong chuỗi trên
    2. Tính trung bình cộng
     */
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;
        String[] parts = str1.split(" ");
        // Duyet qua tung phan tu trong mang
        for(String pt : parts){
            try{
                // Ep kieu nguyen
                int num = Integer.parseInt(pt);
                sum+=num;
                count++;
            }catch(NumberFormatException e){
                //Nop
            }
        }
        double tbc = (double) sum/count;
        System.out.println("Tong cac so trong chuoi: "+sum);
        System.out.println("TBC cac so trong chuoi: "+tbc);
    }
}
