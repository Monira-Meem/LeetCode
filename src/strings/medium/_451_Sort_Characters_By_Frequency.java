package strings.medium;

import java.util.*;

public class _451_Sort_Characters_By_Frequency {

    public static void main(String[] args) {

        String s = "Aabb";
        char[] ss = s.toCharArray();
        Arrays.sort(ss);

        System.out.println(Arrays.toString(ss));

        Map<Character,Integer> map = new HashMap<>();

        StringBuilder newString = new StringBuilder();

        for (char c : ss) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);

        List<Character> list = new ArrayList<>(map.keySet());//convert hashmap keys into list
        list.sort((x,y) -> map.get(y) - map.get(x));//sort the list

        for(char ch: list){
            //run loop till the frequency of the particular character
            newString.append(String.valueOf(ch).repeat(Math.max(0, map.get(ch))));
        }

        System.out.println(newString.toString());

    }

}
