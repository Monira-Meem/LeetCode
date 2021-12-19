package strings.easy;

public class SubString_Word_1967 {

    public static void main(String[] args) {

        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";

        int count = 0;

        for (String s : patterns){
            if (word.contains(s))
                count++;
        }
        System.out.println(count);
    }
}
