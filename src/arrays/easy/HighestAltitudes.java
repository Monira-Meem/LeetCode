package arrays.easy;

public class HighestAltitudes {

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int[] gain1 = {-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(gain));
        System.out.println(largestAltitude(gain1));
    }

    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] altitudes = new int[n+1];
        altitudes[0] = 0;

        int highest = 0;

        for (int i = 0; i < n; i++){
            altitudes[i+1] = altitudes[i] + gain[i];

            if (altitudes[i+1] > highest)
                highest = altitudes[i+1];
        }
        return highest;
    }

}
