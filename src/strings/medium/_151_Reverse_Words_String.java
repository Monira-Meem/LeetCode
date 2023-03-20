package strings.medium;

public class _151_Reverse_Words_String {

    public static String reverseWords(String s) {
        s = s.trim();

        if (s.length() == 1)
            return s;

        StringBuilder reverseSentence = new StringBuilder();
        StringBuilder tempString = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {

            char currentChar = s.charAt(i);

            if (currentChar == ' ') {
                tempString = tempString.reverse();
                reverseSentence.append(tempString);
                tempString = new StringBuilder();

                if (s.charAt(i + 1) != ' ' && i > 0) {
                    reverseSentence.append(" ");
                }

            } else {
                tempString.append(currentChar);
            }
        }
        reverseSentence.append(tempString.reverse());
        return reverseSentence.toString();
    }

    public static void main(String[] args) {

        String s = "the sky is blue";
//        s = s.trim();
//
//        StringBuilder reverseSentence = new StringBuilder();
//        StringBuilder tempString = new StringBuilder();
//
//        for (int i = s.length()-1; i >= 0; i--) {
//
//            char currentChar = s.charAt(i);
//
//            if (currentChar == ' ') {
//                tempString = tempString.reverse();
//                reverseSentence.append(tempString);
//                tempString = new StringBuilder();
//
//                if (s.charAt(i + 1) != ' ' && i > 0) {
//                    reverseSentence.append(" ");
//                }
//
//
//            } else {
//                tempString.append(currentChar);
//            }
//        }
//        reverseSentence.append(tempString.reverse());

        System.out.println(reverseWords(s));
    }
}
