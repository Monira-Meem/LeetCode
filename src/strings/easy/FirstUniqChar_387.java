package strings.easy;

public class FirstUniqChar_387 {

    public static void main(String[] args) {

        String s = "leetcode";
        int ans = -1;

        int l = s.length();
        int[] uniqs = new int[26];
        char[] ss = s.toCharArray();

        for (int i = 0; i < l; i++) {
            char c = ss[i];
            int index = c-'a';
            uniqs[index]++;
        }

        for (int i = 0; i < l; i++){
            if (uniqs[ss[i]-'a'] == 1)
                ans = i;
        }

        System.out.println(ans);
    }
}
