package practice;

public class AnagramTest {

    public static void main(String[] args) {

        String a = "abcd";
        String b = "acdb";
        String bb = "True";

        if (a.length() != b.length()){
            System.out.println("False");
        }

        int[] counts = new int[26];

        for (int i = 0; i < a.length(); i++){

            char firstChar = a.charAt(i);
            char secChar = b.charAt(i);

            int firstInd = firstChar - 'a';
            counts[firstInd]++;

            int secondInd = secChar - 'a';
            counts[secondInd]--;
        }

        for (int i = 0; i < counts.length; i++){
            if (counts[i] != 0){
                bb = "False";
                break;
            }
        }
        System.out.println(bb);
    }
}
