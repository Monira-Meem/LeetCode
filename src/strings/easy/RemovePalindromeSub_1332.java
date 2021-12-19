package strings.easy;

public class RemovePalindromeSub_1332 {

    public static int removePalindromeSub(String s) {

        if (s.length() == 0)
            return 0;

        int left = 0;
        int right = s.length()-1;

        for (left = 0; left <= s.length()/2; left++){
            if (s.charAt(left) != s.charAt(right)){
                return 2;
            }
            right--;
        }
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(removePalindromeSub("baabb"));

    }
}
