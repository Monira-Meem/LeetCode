package practice;

public class UniqueCharTest {

    public static boolean isUnique(String s){

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int sInd = ch - 'a';
            counts[sInd]++;
        }

        for (int i = 0; i < 26; i++){
            if (counts[i] > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        String s = "monira";
//        String s = "meem";
//        String s = "asbdfkjshldkfhkjrhfhjhfjg";
        String s = "asdfghjkl";

        boolean isUnique = isUnique(s);

        System.out.println(isUnique);
    }
}
