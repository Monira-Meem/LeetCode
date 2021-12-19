package practice;

public class CheckUniqueChar {

    public static void main(String[] args) {

//        String s = "monira";
        String s = "meem";
        long count = s.chars().distinct().count();


        if (count == s.length())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
