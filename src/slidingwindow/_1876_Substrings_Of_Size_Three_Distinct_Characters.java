package slidingwindow;

public class _1876_Substrings_Of_Size_Three_Distinct_Characters {

    public static void main(String[] args) {

        String s = "aababcabc";
        int k = 3;

        int start = 0, end = 0, count = 0;

        while (end < s.length()) {

            if (end - start+1 < k) {
                end++;
            } else if (end - start+1 == k) {
                int mid = start +1;
                if (s.charAt(start)!=s.charAt(end) && s.charAt(end)!=s.charAt(mid) && s.charAt(start)!=s.charAt(mid))
                    count++;
                start++;
                end++;

            }

        }

        System.out.println(count);
    }
}
