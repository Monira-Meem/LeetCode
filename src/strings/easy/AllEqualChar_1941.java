package strings.easy;

public class AllEqualChar_1941 {

    public static boolean areOccurrencesEqual(String s) {
        int[] frequences = new int[26];

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int index = c -'a';
            frequences[index]++;
        }
        int firstChar = frequences[s.charAt(0) - 'a'];

        for (int n : frequences){
            if (n != 0 && n != firstChar)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "aabacbc";
//        boolean b = false;
//        int[] freqs = new int[26];
//
//        for (int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            int index = c - 'a';
//            freqs[index]++;
//        }
//        int first = freqs[s.charAt(0) - 'a'];
//
//        System.out.println(first);
//
//        for (int n : freqs){
//            if (n != 0 && first != n){
//                break;
//            }else
//                b = true;
//
//        }
        System.out.println(areOccurrencesEqual(s));
        System.out.println(areOccurrencesEqual("aaaaa"));
        System.out.println(areOccurrencesEqual("aabb"));

    }
}
