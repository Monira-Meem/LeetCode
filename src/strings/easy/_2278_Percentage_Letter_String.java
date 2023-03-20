package strings.easy;

public class _2278_Percentage_Letter_String {

    public static int percentageLetter(String s, char letter) {

        int count = 0;
        int length = s.length();

        for (char c : s.toCharArray()) {
            if (c == letter)
                count++;
        }

        if (count == 0)
            return 0;

        return ( count * 100) / length;
    }

    public static void main(String[] args) {

        System.out.println(percentageLetter("karo",'o'));

    }

}
