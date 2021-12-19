package strings.easy;

public class RomanToInteger_13 {

    public static int romanToInt(String s) {
        int answer = 0;

        for (int i = 0; i < s.length()-1; i++){
            char pres = s.charAt(i);
            char next = s.charAt(i+1);

            if (getInt(pres) < getInt(next)){
                answer -= getInt(pres);
            }else {
                answer += getInt(pres);
            }
        }
        return answer+getInt(s.charAt(s.length()-1));
    }

    public static int getInt(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

    }
}
