package strings.easy;

public class SortingSentence {

    public static void main(String[] args) {

        String s = "is2 sentence4 This1 a3";
        String newString = "";

        String[] words = s.split(" ");
        String[] sorts = new String[words.length];

        int k = 1;

        for (int i = 0; i < words.length; i++){
           for (int j = 0; j < words.length; j++){
               if (words[j].contains(Integer.toString(k))){
                   String ss = words[j];
                   ss = ss.replace(Integer.toString(k)," ");
                   sorts[i] = ss;
               }
           }
           k++;
        }

       for (String s1 : sorts){
           newString += s1;
       }
       newString = newString.substring(0,newString.length()-1);
        System.out.println(newString);
    }
}
