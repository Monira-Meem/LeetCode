package practice;

public class CheckUniChar2 {

    public static void main(String[] args) {

//        String s = "monira";
//        String s = "meem";
        String s = "asbdfkjshldkfhkjrhfhjhfjg";
        boolean isMatch = false;

        for (int i = 0; i < s.length(); i++){
            for (int j = i+1; j < s.length(); j++ ){

                if (isMatch == false){
                    if (s.charAt(i) == s.charAt(j)){
                        isMatch = true;
                    } else {
                        isMatch = false;
                    }
                }
            }
        }
        if (isMatch == false){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
