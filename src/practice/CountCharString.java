package practice;

public class CountCharString {

    public static void main(String[] args) {

//        String s = "aaaabbbccc";
        String s = "aaaabbbc";

        int count = 0;
        char c = s.charAt(0);
        String newString = "";

//        for (int i = 1; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            char prevChar = s.charAt(i-1);
//
//            if (currentChar != prevChar){
//                newString += currentChar;
//            }
//        }

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                count++;
            } else {
                newString += (c + "" + count);
                c = s.charAt(i);
                count = 1;
            }
        }
        System.out.println(newString +c + "" + count);
    }
}