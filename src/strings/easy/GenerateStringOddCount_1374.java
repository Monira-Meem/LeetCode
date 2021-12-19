package strings.easy;

public class GenerateStringOddCount_1374 {

    public static void main(String[] args) {
        int n = 4;
        String ans = "";

        for (int i = 0; i < n-1; i++){
            ans += "m";
        }

        if (n % 2 == 0){
            ans += "n";
        } else {
            ans += "m";
        }

        System.out.println(ans);
    }
}
