package strings.easy;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (!(s.length() == t.length()))
            return false;

        int[] frequences = new int[26];
        for (int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            int s1Ind = s1 - 'a';
            int t1Ind = t1 - 'a';

            frequences[s1Ind]++;
            frequences[t1Ind]--;
        }

        for (int i = 0; i < 26; i++){
            if (frequences[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));

    }
}
