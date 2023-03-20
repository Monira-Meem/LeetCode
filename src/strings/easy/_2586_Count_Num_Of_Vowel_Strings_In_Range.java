package strings.easy;

public class _2586_Count_Num_Of_Vowel_Strings_In_Range {

    public static int vowelStrings(String[] words, int left, int right) {

        int count = 0;

        for (int i = left; i <= right; i++) {
            String s = words[i];
            if (isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1))) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        System.out.println(vowelStrings(new String[] {"are","amy","u"},0,2));
        System.out.println(vowelStrings(new String[] {"hey","aeo","mu","ooo","artro"},1,4));
        System.out.println(vowelStrings(new String[] {"aaa","aeo","mu","ooo","artro"},1,4));
        System.out.println(vowelStrings(new String[] {"aaa","aeo","mu","ooo","artro"},3,4));

    }

}
