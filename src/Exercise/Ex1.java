package Exercise;

import java.util.ArrayList;

public class Ex1 {
//    1. Cho 1 mảng stringArr gồm các chuỗi, và 1 string pattern. Viết hàm tìm kiếm các
//    chuỗi trong mảng bắt đầu bằng pattern và 1 hàm tìm ra các chuỗi chứa các tất cả
//    các ký tự trong chuỗi pattern
    public static void main(String[] args) {
        String[] stringArr = {"Javascript", "javascript", "java", "PHP", "Ruby", "vaja"};
        String stringPattern = "java";
        ArrayList<String> result1 = findStrings(stringArr, stringPattern);
        System.out.println("ket qua la " + result1);
        ArrayList<String> result2 = findStringsContainingPattern(stringArr, stringPattern);
        System.out.println("ket qua la " + result2);
    }
    public static ArrayList<String> findStrings(String[] stringArr, String stringPattern) {
        int count=0;

        ArrayList<String> result = new ArrayList<String>();
        for (String element : stringArr) {
            if(element.startsWith(stringPattern)) {
                count++;
                result.add(element);

            }
        }
        return result;

    }
    public static ArrayList<String> findStringsContainingPattern(String[] stringArr, String stringPattern){
        ArrayList<String> result = new ArrayList<String>();
        for(String element : stringArr) {
            boolean isContaining = true;
            for (char charPattern : stringPattern.toCharArray()) {
                if (element.indexOf(charPattern) == -1) {
                    isContaining = false;
                    break;
                }
            }
            if(isContaining) {
                result.add(element);
            }
        }
        return result;
    }
}
