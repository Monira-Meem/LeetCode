package strings.easy;

public class LastWordLength {

    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length()-1; i >= 0;i--){
            if (s.charAt(i) != ' ')
                count++;
            else{
                if (count == 0)
                    continue;
                else
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("hello world"));
        System.out.println(lengthOfLastWord(" "));
        System.out.println(lengthOfLastWord("cccc "));

    }
}
