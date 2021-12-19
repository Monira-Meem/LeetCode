package strings.easy;

public class CheckPanagrams {

    public static void main(String[] args) {

    }

    public boolean checkIfPangram(String sentence) {

        int[] frequenes = new int[26];

        for (int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            int cIn = c - 'a';
            frequenes[cIn]++;
        }

        for (int i = 0; i < 26; i++){
            if (frequenes[i] == 0)
                return false;
        }
        return true;
    }
}
