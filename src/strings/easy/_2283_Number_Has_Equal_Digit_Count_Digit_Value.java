package strings.easy;

import java.util.HashMap;
import java.util.Map;

public class _2283_Number_Has_Equal_Digit_Count_Digit_Value {

    public static boolean digitCount(String num) {

        Map<Integer,Integer> map = new HashMap<>();

        for (char c : num.toCharArray()) {
            int cc = c - '0';
            map.put(cc, map.getOrDefault(cc, 0) + 1);
        }

        System.out.println(map);

        for (int i = 0; i < num.length(); i++) {
            int c = num.charAt(i) - '0';

            if (map.containsKey(i)) {
                int n = map.get(i);
                if (n != c)
                    return false;

            } else if (c > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String num = "030";
        System.out.println(digitCount(num));

    }

}
