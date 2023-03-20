package strings.medium;

import java.util.ArrayList;
import java.util.List;

public class _438_Find_All_Anagrams_String {

    public boolean isZero(int[] sArray, int[] pArray){
        for(int j= 0; j<26; j++) {
            if(sArray[j]!=pArray[j]) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        int sLength = s.length();
        int pLength = p.length();

        if (pLength > sLength) {
            return list;
        }

        int[] sFreq = new int[26];
        int[] pFreq = new int[26];

        for (int i = 0; i < pLength; i++) {
            sFreq[s.charAt(i) - 'a']++;
            pFreq[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= sLength - pLength; i++) {
            if (isZero(sFreq,pFreq)) {
                list.add(i);
            }
            sFreq[s.charAt(i) - 'a']--;

            if (i+pLength < sLength) {
                sFreq[s.charAt(i+pLength) - 'a']++;
            }
        }

        return null;
    }


}
