package arrays.sorting.cyclicSort;

public class _268_FindMissingNumber {

   public static int missingNumber(int[] nums) {

       int i = 0;
       int length = nums.length;

       while ( i < length) {

           int expectedIndex = nums[i];

           if (expectedIndex < length && nums[expectedIndex] != nums[i]) {
               int temp = nums[expectedIndex];
               nums[expectedIndex] = nums[i];
               nums[i] = temp;
           } else {
               i++;
           }
       }

       for (int j = 0; j < length; j++) {
           if (j != nums[j])
               return j;
       }
       return length;
   }

    public static void main(String[] args) {

       int[] nums = {0,3,4,2};

       System.out.println(missingNumber(nums));

    }


}
