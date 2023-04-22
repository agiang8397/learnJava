package Exercise;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 extends Ex1 {
    public static void main(String[] args) {
        /*Cho 1 mảng stringArr gồm các chuỗi. Lọc và  in ra màn hình các
        chuỗi trg stringArr thỏa mãn các rules:
        1. Bắt đầu bằng 1 chuỗi ký tự
        2. Chỉ bao gồm các ký tự từ 1 chuỗi ký tự
        mảng stringArr là mảng có sẵn hoặc đọc từ file, lựa chọn rule nào và chuỗi ký tự do
        ng dùng nhập từ bàn phím*/
        String[] stringArr = {"Javascript", "javascript", "java", "PHP", "Ruby", "vaja"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập 1 chuỗi ký tự muốn kiểm tra");
        String stringPattern = sc.nextLine();
        while (true) {
            System.out.println("Mời bạn chọn rule: \nNhấn phím 1: Bắt đầu bằng 1 chuỗi ký tự.\n" +
                    "Nhấn phím 2: Chỉ bao gồm các ký tự từ 1 chuỗi ký tự");
            int number = sc.nextInt();
            if (number==1) {
                ArrayList<String> result1 = findStrings(stringArr, stringPattern);
                if(result1.size()==0)
                    System.out.println("Không có chuỗi nào trong mảng thỏa mãn");
                else
                    System.out.println("ket qua la " + result1);
                break;
            }
            if (number==2) {
                ArrayList<String> result2 = findStringsContainingPattern(stringArr, stringPattern);
                if(result2.size()==0)
                    System.out.println("Không có chuỗi nào trong mảng thỏa mãn");
                else
                    System.out.println("ket qua la " + result2);
                break;
            }
            System.out.println("Số không hợp lệ, mời nhập lại");
        }

    }
}
