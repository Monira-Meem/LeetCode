package practice;

public class StringCompression {

    public static void main(String[] args) {

//        String s = "aaaabbbc";
//        String s = "abbccdccaaa";
//        String s = "abc";
//        String s = "aab";
//        String s =
        String s = "aaab";

        int count = 0;
        String s1 = "";
        char pres = s.charAt(0);

        for (int i = 0; i < s.length(); i++){
            char running = s.charAt(i);

            if(pres == running){
                count++;
            } else {
                s1 += (pres + "" +count);
                pres = s.charAt(i);
                count= 1;
            }
        }

        String newString = s1 + (pres + "" + count);

        if (newString.length() > s.length() || newString.length() < s.length()){
            System.out.println(newString);
        } else {
            System.out.println(s);
        }
    }
}
