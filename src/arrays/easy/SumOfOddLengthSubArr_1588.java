package arrays.easy;

public class SumOfOddLengthSubArr_1588 {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0,k=3,flag=0;

        if(arr.length>2)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(i==arr.length-1 || flag==1){
                    k+=2;
                    i=0;
                    if(k>arr.length) break;
                }
                for(int j=i;j<i+k && j<arr.length;j++)
                {
                    flag=0;
                    sum+=arr[j];
                    if(j==arr.length-1) flag=1;
                }
            }
        }
        for (int j : arr)
            sum += j;

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {1,4,2,5,3};

        int sum = 0;
        int k = 1;

        for (int i = 0; i < arr.length; i++ ){

        }

    }
}
