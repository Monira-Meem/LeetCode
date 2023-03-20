package strings.easy;

public class _392_Is_Subsequence {

    public static boolean isSubsequence(String s, String t) {

        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() > t.length()) {
            return false;
        }

        int indexS = 0;

        for (int i = 0; i < t.length(); i++) {

            if (indexS < s.length() && s.charAt(indexS) == t.charAt(i)) {
                indexS++;
            }
        }
        return indexS == s.length();
    }

    public static void main(String[] args) {

      System.out.println(isSubsequence("abc","ahbgdc"));
      System.out.println(isSubsequence("axc","ahbgdc"));
      System.out.println(isSubsequence("b","abc"));

    }
}
