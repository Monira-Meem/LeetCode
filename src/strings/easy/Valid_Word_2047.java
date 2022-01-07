package strings.easy;

public class Valid_Word_2047 {

    public static boolean isValid(String word){

        if (word.indexOf("-") == 0 || word.indexOf("-") == word.length()-1 || word.indexOf(".") != word.length()-1)
            return false;

        return true;
    }


    public static void main(String[] args) {

        String sentence = "cat and  dog";
        int vWord = 0;

        String[] words = sentence.split(" ");
        System.out.println(words.length);


        for (String word : words){

        }



    }
}
