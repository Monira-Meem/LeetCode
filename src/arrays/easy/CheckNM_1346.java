package arrays.easy;

public class CheckNM_1346 {

    public static boolean checkIfExist(int[] arr) {
        boolean isMatch = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (j != i){
                    if (arr[i] == arr[j]*2){
                        return isMatch = true;
                    }
                }
            }
        }
        return isMatch;
    }

    public static void main(String[] args) {

        int[] arr = {10,2,5,3};
        int[] arr1 = {7,1,14,11};
        int[] arr2= {3,1,7,11};

        System.out.println(checkIfExist(arr));
        System.out.println(checkIfExist(arr1));
        System.out.println(checkIfExist(arr2));
    }
}
