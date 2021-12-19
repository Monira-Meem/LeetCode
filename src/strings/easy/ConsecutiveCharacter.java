package strings.easy;

public class ConsecutiveCharacter {

    public static void main(String[] args) {

        String s = "t";

        int count = 1;
        int max = 0;
        char c = s.charAt(0);

        for (int i = 1; i < s.length(); i++){
            if (c == s.charAt(i)){
                count++;
            }else {
                c = s.charAt(i);
                count = 1;
            }

            if (count > max){
                max = count;
            }
        }
        System.out.println(max);

    }
}
