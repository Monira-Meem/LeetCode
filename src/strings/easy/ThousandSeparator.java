package strings.easy;

public class ThousandSeparator {

    public static void main(String[] args) {

        int n = 123456789;
        String s = Integer.toString(n);

       StringBuilder ss = new StringBuilder();

       for (int i = 0; i < s.length(); i++){
           if (i != 0){
               if ((s.length() - i) % 3 == 0){
                   ss.append(".");
               }
           }
           ss.append(s.charAt(i));
       }
       System.out.println(ss);

    }
}
