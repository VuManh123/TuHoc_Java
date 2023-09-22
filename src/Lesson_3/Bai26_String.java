package Lesson_3;

public class Bai26_String {
    public static void main(String[] args) {
        String str1 = "Vu Duc Manh - 20215282"+
                    "\nSOICT_HUST";
        System.out.println(str1);

        // StringBuilder
        StringBuilder str2 = new StringBuilder();
        /*Cac phuong thuc thuong dung cua SB:
        * 1. append(string): Them chuoi vao cuoi chuoi goc
        * 2. insert(index,string): Chen string vao vi tri index
        * 3. delete(start, end)
        * 4. string.length()
        * 5. indexOf: Ktra vi tri xuat hien dau cua ky tu hoac chuoi
        * 6. LastIndexOf: Cuoi cung
        * 7. contains: Kiam tra chuoi con
        * 8. substring: Lay mot chuoi con tu chuoi lon
        * 9. replace(str1, str2): Thay the chuoi 2 vao chuoi 1
        * replaceFirst
        * 10. trim: xoa khoang trang o dau va cuoi
        * \\s+$ */
        str2.append("Xin chao ban!");
        str2.append(" Xin chao ban!");
        System.out.println(str2);
        System.out.println(str2.length());
        /*So sanh hai chuoi:
        * str1.compareTo(str2): So sanh 2 chuoi
        * str1.compareToIgnoreCase: So sanh ko pbiet chu hoa hay thuong
        * reverse: Dao nguoc chuoi*/


        //Buoi 3
        //Split Tach chuoi ve mang
        String s1 = "Vu Duc Manh 20215282";
        String[] array = s1.split(" ");
        for(int i=0; i<= array.length; i++) {
            System.out.println(array[i]);
        }

        //.lowercase(), .uppercase(): Chuyen sang chu thuong va hoa
        //.toCharArray(): Tach chuoi thanh tung ki tu cho vao mang

    }
}
