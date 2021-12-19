package strings.easy;

public class MaxWordType_1935 {

    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] ss = text.split(" ");
        char[] chs = brokenLetters.toCharArray();

        for (String s : ss){
            for (char ch : chs) {
                if (s.contains(Character.toString(ch))) {
                    count++;
                    break;
                }
            }
        }
        return ss.length - count;
    }

    public static void main(String[] args) {

//        String text= "hello world";
//        String brokenLetters = "ad";
//        String text= "leet code";
//        String brokenLetters = "lt";

        String text= "monira meem liya liza";
        String brokenLetters = "a";
//        String text= "leet code";
//        String brokenLetters = "e";

        String[] s = text.split(" ");
        int maxWord = 0;
        char[] sch = brokenLetters.toCharArray();


            for (String s1 : s){
                for (char c : sch) {
                    if (s1.contains(Character.toString(c))) {
                        maxWord++;
                        break;
                    }
                }
            }

        System.out.println(s.length - maxWord);
    }
}
