package strings.easy;

public class _168_Excel_Sheet_Column_Title {

    public static String convertToTitle(int columnNumber) {

        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
//            int charNum = (columnNumber-1) % 26;
//            int count = (columnNumber-1) / 26;

            int rem = (columnNumber -1) % 26;
            char currentChar = (char) (('A' + rem));
            ans.append(currentChar);
            columnNumber = (columnNumber-1) / 26;
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {

        int col = 28;

        System.out.println(convertToTitle(col));
    }

}
