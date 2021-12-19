package strings.easy;

public class AlikeString_1704 {

    public static boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else if (ch == 'A' || ch == 'E' ||  ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }

    public static boolean halvesAreAlike(String s) {

        int countA = 0;
        int countB = 0;
        int j = s.length()-1;

        for (int i = 0; i < s.length()/2; i++){

            if (isVowel(s.charAt(i)))
                countA++;
            if (isVowel(s.charAt(j)))
                countB++;
            j--;
        }
        return countA == countB;
    }

    public static void main(String[] args) {

        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
        System.out.println(halvesAreAlike("MerryChristmas"));
        System.out.println(halvesAreAlike("AbCdEfGh"));
    }

}
