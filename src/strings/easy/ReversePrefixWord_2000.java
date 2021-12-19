package strings.easy;

public class ReversePrefixWord_2000 {

    public static void main(String[] args) {

        String word = "abcdefd";
        char ch = 'd';
        StringBuilder reverse = new StringBuilder();

        if (word.contains(Character.toString(ch))){
            int l = word.indexOf(ch);
            String s = word.substring(l+1);

            for (int i = l; i>=0; i--){
                reverse.append(word.charAt(i));
            }
            reverse.append(s);
        }
        System.out.println(reverse.toString());
    }
}
