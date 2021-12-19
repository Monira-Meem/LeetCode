package strings.easy;

public class ValidPalindrome_125 {

    public static boolean isPalindrome(String s) {

        s =s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if (!(x >= 'a' && x <= 'z')){
                s = s.replace(Character.toString(x),"");
            }
        }

        if (s.length() <= 1)
            return false;

        int j = s.length()-1;

        for (int i = 0; i <= s.length()/2; i++){
            char ch = s.charAt(i);
            char js = s.charAt(j);

            if (ch != js)
                return false;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";
        String s2 = " ";
//        s =s.toLowerCase();
//
//        for (int i = 0; i < s.length(); i++){
//            char x = s.charAt(i);
//
//            if (!(x >= 96 && x <= 122)){
//                s = s.replace(Character.toString(x),"");
//            }
//        }

//        System.out.println(s);

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(s2.length());
    }
}
