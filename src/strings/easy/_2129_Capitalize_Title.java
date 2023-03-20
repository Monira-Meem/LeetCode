package strings.easy;

public class _2129_Capitalize_Title {

    public static String capitalizeTitle(String title) {

        String[] words = title.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 2) {
                ans.append(word.toLowerCase()).append(" ");
            } else {
                String firstChar = word.charAt(0)+ "";
                String sub = word.substring(1);
                ans.append(firstChar.toUpperCase()).append(sub.toLowerCase()).append(" ");
            }
        }

        return ans.toString().trim();
    }

    public static void main(String[] args) {

        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
        System.out.println(capitalizeTitle("i lOve leetcode"));

    }

}
