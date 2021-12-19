package arrays.easy;

public class FinalValue_2011 {

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};

        int x= 0;

        for (String s : operations){
            if (s.equals("--X") || s.equals("X--")){
                x--;
            }else {
                x++;
            }
        }

        System.out.println(x);
    }
}
