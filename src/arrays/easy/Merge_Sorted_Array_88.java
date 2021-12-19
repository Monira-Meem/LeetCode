package arrays.easy;

public class Merge_Sorted_Array_88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n){

        int i = 0, j = 0, k = 0;
        int[] ans = new int[n+m];

        while (i < m && j < n){
            if (nums1[i] <= nums2[j]){
                ans[k] = nums1[i];
                i++;
            } else {
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }

        while ( i < m){
            ans[k] = nums1[i];
            k++;
            i++;
        }

        while (j < n){
            ans[k] = nums2[j];
            j++;
            k++;
        }

        for (int x = 0; x < ans.length; x++){
            nums1[x] = ans[x];
        }
    }
}
