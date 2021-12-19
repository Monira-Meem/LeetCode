package practice;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingTest {

    public static void main(String[] args) {

        int left  = 1;
        int right = 22;

        List<Integer> list = new ArrayList<>();

        int count = 0;
        int modCou = 0;


        for (int i = left; i <= right; i++){
            int temp = i;

            while (temp > 0){
                int mod = temp % 10;

                if (!(mod == 0) && (i % mod == 0)){
                    count++;

                }

            }


        }



    }
}
