package strings.easy;

public class _520_Detect_Capital {

    public static boolean detectCapitalUse(String word) {

        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count == 0 || count == word.length() || (count == 1 && Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {

        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("helloworld"));

    }

}
