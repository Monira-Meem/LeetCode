package strings.easy;

public class DetectCapital {

    public static boolean isCapital(String word){

        boolean capital = true;

        for (char ch : word.toCharArray()){
            if ( ch >= 'A' && ch <= 'Z'){

            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "g";
        System.out.println(isCapital(s));
    }
}
