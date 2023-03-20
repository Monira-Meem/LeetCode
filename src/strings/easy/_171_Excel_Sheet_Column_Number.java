package strings.easy;

public class _171_Excel_Sheet_Column_Number {

    public static int titleToNumber(String columnTitle) {

        int ans = 0;
        int length = columnTitle.length();

        for (int i = 0; i < length; i++) {

            int currentColumn = columnTitle.charAt(i) -'A' +1;
            ans = ans*26 + currentColumn;
        }
        return ans;
    }

    public static void main(String[] args) {

        String columnTitle = "AA";
        System.out.println(titleToNumber(columnTitle));

    }

}
