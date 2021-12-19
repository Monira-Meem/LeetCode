package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    public static int calPoints(String[] ops) {
        List<Integer> records = new ArrayList<>();
        int total = 0;

        for (String s : ops) {
            if (s.equals("C")){
                records.remove(records.size()-1);
            } else if (s.equals("D")){
                records.add(records.get(records.size()-1) *2);
            } else if (s.equals("+")){
                records.add(records.get(records.size()-1) + records.get(records.size()-2));
            } else {
                records.add(Integer.parseInt(s));
            }
        }

        for (int n : records)
            total+= n;

        return total;
    }

    public static void main(String[] args) {
        String[] ops = {"-42", "90", "82", "+", "C", "-21", "43", "D", "D", "-32", "-98", "83", "D", "-86", "68", "68", "D", "C", "C", "7" };

        System.out.println(calPoints(ops));
    }
}