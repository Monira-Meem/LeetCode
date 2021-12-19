package arrays;

public class RichestCustomer {

    public static void main(String[] args) {

//        int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts = {{1,5},{7,3},{3,5}};

        int wealth = 0;
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++){
            wealth = 0;
            for (int j : accounts[i]){
                wealth += j;
                if (maxWealth == 0){
                    maxWealth = wealth;
                }

                if (wealth > maxWealth){
                    maxWealth = wealth;
                }
            }
        }
        System.out.println(maxWealth);

    }
}
