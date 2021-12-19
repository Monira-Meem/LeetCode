package arrays.easy;

public class TruncateSentence_1816 {

    public static String truncateSentence(String s, int k) {
        int i = 0, count=0;

        for(i=0; i <s.length() && count < k; i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        if(i==s.length())
            return s.substring(0,i);
        return s.substring(0,i-1);
    }


    public static void main(String[] args) {

        String s = "Hello how are you Contestant";
        int k = 4;

        String[] strings = s.split(" ");
        String newS = "";

        for (int i = 0; i < k -1; i++){
            newS = newS + strings[i]+" " ;
        }
        System.out.println(newS + strings[k -1]);
    }
}
