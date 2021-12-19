package strings.easy;

public class ReplaceAllDigitChar {
    public static String replaceDigits(String s) {
        String sb ="";
        for (int i =0; i < s.length(); i++) {
            if (i % 2 == 1) {
                int a = Integer.parseInt(String.valueOf(s.charAt(i)));
                char nw = (char) (s.charAt(i - 1) + a);
                sb += nw;
            } else {
                sb += (Character.toString(s.charAt(i)));
            }
        }
        return sb;
    }

    public static String replace(String s){
        char[] chs = s.toCharArray();

        for (int i = 1; i < s.length(); i+= 2){
            chs[i] = (char)((int) chs[i-1] + chs[i] - '0');
        }
        return String.valueOf(chs);
    }

    public static void main(String[] args) {

//        String s = "a1c1e1";
        String s = "a1b2c3d4e"; // "abbdcfdhe"

//        StringBuilder sb = new StringBuilder();
//        for (int i =0; i < s.length(); i++) {
//            if (i % 2 == 1) {
//                int a = Integer.parseInt(String.valueOf(s.charAt(i)));
//                char nw = (char) (s.charAt(i - 1) + a);
//                sb.append(nw);
//            } else {
//                sb.append(Character.toString(s.charAt(i)));
//            }
//        }

        System.out.println(replaceDigits(s));
        System.out.println(replaceDigits(s));
    }
}
