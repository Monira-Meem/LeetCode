package strings.easy;

public class Check_All_A_2124 {

    public static boolean isAppears(String s) {
        if (s.length() == 2 && s.charAt(1) == 'b')
            return true;

        if (!s.contains("b") || !s.contains("a"))
            return true;

        for (int i = s.indexOf("b"); i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "aaaba";
        boolean isAppears = true;
        int j = s.indexOf("b");
//        System.out.println(j);

        for (int i = j; i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
                isAppears = false;
                break;
            }
        }
        System.out.println(isAppears);
    }

}
