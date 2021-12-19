package binarySearch.easy;

public class Mountain_Array_Index_852 {

    public static void main(String[] args) {

        int[] arr = {24,69,100,99,79,78,67,36,26,19};

        int start = 0;
        int end = arr.length-1;
        int max = 0;

        while (start < end){
            int mid = start + (end - start)/2;
            max = arr[mid+1];

            if (max < arr[mid]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(max);
        System.out.println(end);

    }
}
