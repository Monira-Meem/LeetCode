package strings.easy;

public class Add_String_415 {

    public static String addString(String num1, String num2) {

        int n = num1.length()-1;
        int m = num2.length()-1;
        int carry = 0;

        StringBuilder s = new StringBuilder();

        while (n >= 0 || m >= 0){
            int sum = carry;

            if (n >= 0){
                char cn = num1.charAt(n);
                int nn = cn -'0';
                sum += nn;
                n--;
            }

            if (m >= 0){
                char cm = num2.charAt(m);
                int mm = cm-'0';
                sum += mm;
                m--;
            }

            int mod = sum % 10;
            s.append(mod);
            carry = sum /10;

        }

        if (carry > 0)
            s.append(carry);

        return s.reverse().toString();
    }

    public static void main(String[] args) {

//        "6913259244"
//        "71103343"

        String num1 = "9244";
        String  num2 = "7";

        int n = num1.length()-1;
        int m = num2.length()-1;
        int carry = 0;

        StringBuilder s = new StringBuilder();

        while (n >= 0 || m >= 0){
            int sum = carry;

            if (n >= 0){
                char cn = num1.charAt(n);
                int nn = cn -'0';
                sum += nn;
                n--;
            }

            if (m >= 0){
                char cm = num2.charAt(m);
                int mm = cm-'0';
                sum += mm;
                m--;
            }

            int mod = sum % 10;
            s.append(mod);
            carry = sum /10;

        }

        if (carry > 0)
            s.append(carry);

        System.out.println(s.reverse().toString());

//        System.out.println(addString(num1,num2));
//        System.out.println(addString("123","11"));

    }
}
