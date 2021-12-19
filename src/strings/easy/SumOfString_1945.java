package strings.easy;

public class SumOfString_1945 {

    public static void main(String[] args) {

        String s = "leetcode";
        int k = 2;

        int total = 0;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            newStr.append(String.valueOf(c - 96));
        }

        String temp = newStr.toString();

        while (k > 0){
            total = 0;
            for (int i = 0; i < temp.length(); i++){
                char c = temp.charAt(i);
                total+= c - '0';
            }
            temp = String.valueOf(total);
            k--;
        }
        System.out.println(total);
    }
}
