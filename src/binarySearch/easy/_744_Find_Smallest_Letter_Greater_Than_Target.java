package binarySearch.easy;

public class _744_Find_Smallest_Letter_Greater_Than_Target {

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length -1;

        if (letters[end] <= target)
            return letters[0];

        while (start <= end) {

            int mid = start + (end - start)/2;

            if (target < letters[mid]) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return letters[start];
    }

    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target = 'j';

        System.out.println(nextGreatestLetter(letters,target));

    }
}
