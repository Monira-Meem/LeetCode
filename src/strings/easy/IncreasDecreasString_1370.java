package strings.easy;

import java.util.HashMap;
import java.util.Map;

public class IncreasDecreasString_1370 {

    public static String sortString(String s) {
        Map<Character, Integer> map= new HashMap<>();
        StringBuilder ans= new StringBuilder();

        for(char ch: s.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch) +1);
            }else {
                map.put(ch,1);
            }
        }

        while(map.size()>0){
            for(int i=0; i<26; i++){
                char ch= (char)(97+i);
                if(map.containsKey(ch)) {
                    ans.append(ch);
                    map.put(ch, map.get(ch)-1);
                    if(map.get(ch)==0)
                        map.remove(ch);
                }
            }
            for(int i=25; i>=0; i--){
                char ch= (char)(97+i);
                if(map.containsKey(ch)) {
                    ans.append(ch);
                    map.put(ch, map.get(ch)-1);
                    if(map.get(ch)==0)
                        map.remove(ch);
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        String s =  "leetcode";
        System.out.println(sortString(s));

    }
}
