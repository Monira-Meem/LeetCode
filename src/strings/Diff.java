package strings;

public class Diff {

    public static String solve(String N){

        StringBuilder s = new StringBuilder();

        int length = N.length();
        int l = length -1;
        String diff = Integer.toString(10 - (N.charAt(l) - '0'));
        int m = 0;

        int carry = 0;

        while (l >= 0 || m >= 0){

            int sum = carry;

            if (l >= 0){
                int last = N.charAt(l) - '0';
                sum+= last;
                l--;
            }

            if (m == 0){
                int mm = N.charAt(m)-'0';
                sum += mm;
                m--;
            }

            int mod = sum % 10;
            s.append(mod);
            carry = sum / 10;
        }
        return null;

    }

    public static void main(String[] args) {

        String N = "48";

        StringBuilder s = new StringBuilder();

        int length = N.length();
        int l = length -1;
        String diff = Integer.toString(10 - (N.charAt(l) - '0'));
        int m = diff.length()-1;

        int carry = 0;

        while (l >= 0 || m >= 0){

            int sum = carry;

            if (l >= 0){
                int last = N.charAt(l) - '0';
                sum+= last;
                l--;
            }

            if (m == 0){
                int mm = N.charAt(m)-'0';
                sum += mm;
                m--;
            }

            int mod = sum % 10;
            s.append(mod);
            carry = sum / 10;
        }

        System.out.println(s.reverse());

    }
}
