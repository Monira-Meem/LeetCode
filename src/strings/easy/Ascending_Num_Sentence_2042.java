package strings.easy;

public class Ascending_Num_Sentence_2042 {

    public static boolean areNumbersAscending(String s) {
        String[] ss = s.split(" ");
        int lastNum = -1;
        for (String s1 : ss) {
            if (Character.isDigit(s1.charAt(0))){
                int presNum = Integer.parseInt(s1);
                if (presNum > lastNum){
                    lastNum = presNum;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "1 box has 3 blue 1 red 6 green and 12 yellow marbles";

        String[] ss = s.split(" ");

        int lastNum = -1;
        for (String s1 : ss) {
            if (Character.isDigit(s1.charAt(0))){
                int presNum = Integer.parseInt(s1);
                if (presNum > lastNum){
                    lastNum = presNum;
                } else {
                    System.out.println("False");
                    break;
                }
            }
        }

        System.out.println("True");
    }
}
