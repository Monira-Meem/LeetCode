package arrays.medium;

public class MinNumRungs_1936 {

    public static int addRungs(int[] rungs, int dist) {
        int count = 0;
        int start = 0;

        for (int rung : rungs) {
            int dif = rung - start;

            if (dif > dist) {
                count += dif / dist;

                if (dif % dist == 0)
                    count--;
            }
            start = rung;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] rungs = {1,3,5,10};
        int dist = 2;
        int[] rungs1 = {3,6,8,10};
        int dist1 = 3;
        int[] rungs2 = {3,4,6,7};
        int dist2 = 2;
        int[] rungs3 = {5};
        int dist3 = 10;
        int[] rungs4 = {3};
        int dist4 = 1;

//        int count = 0;
//        int start = 0;
//
//        for (int rung : rungs) {
//            int dif = rung - start -1;
//            if (dif > dist) {
//                count += dif / dist;
//            }
//            start = rung;
//        }
        System.out.println(addRungs(rungs,dist));
        System.out.println(addRungs(rungs1,dist1));
        System.out.println(addRungs(rungs2,dist2));
        System.out.println(addRungs(rungs3,dist3));
        System.out.println(addRungs(rungs4,dist4));
    }
}
