package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayStack_1441 {

    public static void main(String[] args) {

        int[] target = {1,2,3};
        int n = 3;

        List<String> list = new ArrayList<>();
        int temp = 1;

        for (int i = 0; i < target.length; ){
           if (target[i] == temp){
               list.add("Push");
                i++;
           } else {
               list.add("Push");
               list.add("Pop");
           }
           temp++;
        }

        System.out.println(list);
    }
}
