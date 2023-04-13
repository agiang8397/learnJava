// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // data types
        // 1. primitive:
        // so nguyen
        byte a = 1; // 8bits
        short b = 5; // 16 bits
        int c = -3; // 32 bits
        long d = 99; // 64 bits
        // so thuc
        float e = 54.9f; // 32 bits
        double f = 99.99; // 64 bits
        //boolean
        boolean isLoading = true; // 1 bit
        // character
        char kyTu = 'b'; //16 bits
        char kyTu2 = 66;
        //2. non-primitive
        //String
        String str = "helo world";
        //Array
        String[] course = {"PHP", "Java", "Python"};
        int[] numberArray = {1, 2, 3};


        // ép kiểu ngầm định(từ kiểu dữ liệu nhỏ sang lớn)
        int g = 10;
        double h = g;
        System.out.println("h = " + h);
        // ép kiểu tường minh ( từ kiểu dữ liệu nhỏ sang lớn )
        double x = 10.5;
        int y = (int) x;
        System.out.println("y = " + y);




        /* So sánh String, StringBuilder va StringBuffer
        * String: đối tượng bất biến (immutable).
        khi thao tác thay đổi chuỗi tạo ra đối tượng mới. có thể gây lãng phí bộ nhớ, giảm hiệu năng ứng dụng
        * StringBuiler: đối tượng có thể thay đổi và k tạo ra đối tượng mới  (mutable)
        hiệu quả hơn nếu k cần đồng bộ hóa
        * StringBuffer: Giống với StringBuilder, có thể mutable, thường dc sử dụng trong môi trường đa luồng vì có đồng bộ hoá
        */
        String test = "halo";
        test = "hi";
        StringBuilder exam = new StringBuilder("hi my name is Giang");
        exam.append(" dep trai");
        System.out.println(exam);
        //Array
        String[] cousre = {"Java", "PHP", "Python"};
        int[] score = {1, 2, 3};
    }
}