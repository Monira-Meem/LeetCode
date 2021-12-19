package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int num = 48;
        int temp = num;
        int count = 0;
        int modCount = 0;

        while (temp != 0){
            int mod = temp % 10;


            if (mod == 0){
                return;
            }
            if (mod >= 1){
                modCount++;
            }
            temp = temp / 10;

            if (num % mod == 0){
                count++;
            }
        }
        if (count == modCount){
            list.add(num);
        }
        System.out.println(count);
        System.out.println(list);
    }
}
