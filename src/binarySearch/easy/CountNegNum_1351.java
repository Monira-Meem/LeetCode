package binarySearch.easy;

public class CountNegNum_1351 {

    public static int getNegativeNumberCount(int[] numbers) {

        int startingPoint = 0;
        int endingPoint = numbers.length-1;

        while (startingPoint <= endingPoint) {
            int mid = (startingPoint + endingPoint) / 2;

            if(numbers[mid] < 0) {
                endingPoint = mid - 1;
            } else if(numbers[mid] >= 0) {
                startingPoint = mid + 1;
            }
        }
        return numbers.length - endingPoint - 1;
    }

    public static void main(String[] args) {

        int[][] nums = {{4,3,2,-1}, {3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        //System.out.println(getNegativeNumberCount(nums));

    }
}
