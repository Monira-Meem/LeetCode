package binarySearch;

public class _154_Find_Minimum_Rotated_Sorted_Array_2 {

    public static int findPivotWithDuplicate(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid -1]) {
                return mid -1;
            }

            // if elements at middle, start, end arr equal then just skip the duplicates
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                //skip the duplicates
                //NOTE: what if these elements at start and end were the pivot???
                //check if start is the pivot
                if (start < arr.length-1 && arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                //check if end is pivot
                if (end > 1 && arr[end-1] > arr[end]) {
                    return end -1;
                }
                end--;
            }
            // left side sorted, so pivot should be right
            else if (arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1};
        int pivot = findPivotWithDuplicate(arr);
        System.out.println(pivot);


    }
}
