package arrays.easy;

public class Best_Time_BuySell_121 {

    public static int profited(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int n : prices){
            if (n < minPrice){
                minPrice = n;
            }
            if (n - minPrice > maxProfit){
                maxProfit = n -minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(profited(prices));

//        int profit = 0;
//        int bD = 0;
//        int sD = 0;
//        int bT = Integer.MAX_VALUE;
//        int sT =Integer.MIN_VALUE;
//
//        for (int i=0; i < prices.length; i++) {
//            int n = prices[i];
//            if (n < bT){
//                bT = n;
//                bD = i;
//            }
//        }
//
//        for (int i = bD+1; i < prices.length; i++ ){
//            int n = prices[i];
//
//            if (n > bT && n > sT){
//                sT = n;
//            }
//        }
//
//        if (sT == Integer.MIN_VALUE){
//
//        }
//
//        profit = sT - bT;
//        System.out.println(profit);
//
//        System.out.println(bT);
//
//        System.out.println(sT);
    }
}
