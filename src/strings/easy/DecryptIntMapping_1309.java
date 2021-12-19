package strings.easy;

public class DecryptIntMapping_1309 {

    public static void main(String[] args) {

        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        StringBuilder ss = new StringBuilder();
        String temp = "";

        for (int i = s.length()-1; i >=0; i--){
            temp = "";
            if (s.charAt(i) != '#'){
                char c = (char) (Integer.parseInt(String.valueOf(s.charAt(i))) + 96);
                ss.append(c);
            }
            else {
                temp = s.charAt(i-2) + "";
                temp = temp + s.charAt(i-1);
                char cc = (char) (Integer.parseInt(String.valueOf(temp))+96);
                ss.append(cc);
                i-= 2;
            }
        }
        System.out.println(ss.reverse().toString());
    }
}
