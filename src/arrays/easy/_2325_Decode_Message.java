package arrays.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _2325_Decode_Message {

    public static String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        char[] letters = new char[26];
        int i = 0;

        for (char ch : key.toCharArray()) {

            int index = ch-'a';
            if (ch == ' ' || letters[index] != 0)
                continue;

            letters[index] = (char)(i + 'a');
            i++;

            if (i == 26)
                break;
        }

        for (char ch : message.toCharArray()) {

            if (ch == ' ')
                sb.append(" ");
            else
                sb.append( letters[ch-'a'] );
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

//        char[] letters = new char[26];
//
//        int i = 0;
//
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : key.toCharArray()) {
//
//            int index = c - 'a';
//
//            if (index < 0)
//                continue;
//
//            letters[index] = (char) (i + 'a');
//            i++;
//
//        }
//
//        System.out.println(sb.toString());
//        System.out.println(Arrays.toString(letters));

        System.out.println(decodeMessage(key,message));

    }
}
