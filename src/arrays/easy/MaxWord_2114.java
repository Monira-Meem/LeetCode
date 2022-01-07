package arrays.easy;

public class MaxWord_2114 {

    public static void main(String[] args) {

        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int max = 0;

        for (String s : sentences){
            String[] word = s.split(" ");
            if (word.length > max)
                max = word.length;
        }

        System.out.println(max);
    }
}
