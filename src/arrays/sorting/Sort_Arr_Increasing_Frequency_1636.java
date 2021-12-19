package arrays.sorting;

import java.util.*;

public class Sort_Arr_Increasing_Frequency_1636 {

//    public static Map<Integer,Integer> sortedMap(Map<Integer,Integer> map){
//
//        List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());
//
//        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
//            public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
//                return m1.getValue().compareTo(m2.getValue());
//            }
//        });
//
//        Map<Integer,Integer> sorted = new HashMap<Integer,Integer>();
//
//        for (Map.Entry<Integer,Integer> entry : list){
//            sorted.put(entry.getKey(),entry.getValue());
//        }
//        return sorted;
//    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,2,2,3};


        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        for (int n : nums){
            map.merge(n, 1, Integer::sum);
        }
        System.out.println(map);

        int min;
        int key = 0;
        int i = 0;

        while (i < length){

            min = 1000;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if (entry.getValue() < min){
                    min = entry.getValue();
                    key = entry.getKey();
                } else if (entry.getValue() == min){
                    if (key < entry.getKey()){
                        key = entry.getKey();
                    }
                }
            }
//            System.out.println(min);

            while (min != 0){
                nums[i++] = key;
                min--;
            }

            map.remove(key);
        }
//        System.out.println(min);
//        System.out.println(map);
        System.out.println(Arrays.toString(nums));
    }
}
