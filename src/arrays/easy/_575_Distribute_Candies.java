package arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _575_Distribute_Candies {

    public int distributeCandies2(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int n : candyType) {
            set.add(n);
        }
        int canEat =  candyType.length /2;

        return Math.min(canEat,set.size());
    }

    public static int distributeCandies(int[] candyType) {

        Arrays.sort(candyType);
        int uniqueCandy = 1;
        int length = candyType.length;

        for (int i = 1; i < length && uniqueCandy < candyType.length / 2; i++) {

            if (candyType[i] != candyType[i-1])
                uniqueCandy++;

        }
        return Math.min(uniqueCandy,length/2);
    }

    public static void main(String[] args) {

        int[] candies = {1,1,2,3};
        System.out.println(distributeCandies(candies));

    }
}
