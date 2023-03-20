package strings.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2194_Cells_Range_Excel_Sheet {

    public static void main(String[] args) {

        String s = "A1:F1";

        List<String> list = new ArrayList<>();

        char firstCol = s.charAt(0);
        int firstRow = s.charAt(1);
        char secondCol = s.charAt(s.length()-2);
        int secondRow = s.charAt(s.length()-1);

        for (int i = firstCol; i <= secondCol; i++) {
            for (int j = firstRow; j <= secondRow; j++) {
                String newString = String.valueOf((char) i) +
                        (char) j;
                list.add(newString);
            }
        }

        System.out.println(list);

    }
}
