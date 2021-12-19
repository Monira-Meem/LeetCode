package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class GreatNumCandies_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max =0;
        for (int candy : candies) {
            if (candy > max)
                max = candy;
        }
        List<Boolean> list = new ArrayList<Boolean>(candies.length);

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(true);
            } else list.add(false);
        }
        return list;
    }
}
