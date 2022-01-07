package arrays.easy;

public class Find_First_Palindrome_String_2108 {

    public static boolean isPalindrome(String word) {

        int i = 0;
        int j = word.length()-1;

        while (i < j){
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String[] words = {"def","ghi"};
        String ans = "";

        for (String word : words){
            if (isPalindrome(word)) {
                ans = word;
                break;
            }
        }

        System.out.println(ans);
    }
}
