package arrays.easy;

public class DiagonalSum {

    public static void main(String[] args) {

        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat1 = {{1, 1, 1, 1}, {1, 1, 1, 1},{1, 1, 1, 1},{1,1,1,1}};

        System.out.println(diagonalSum(mat));
        System.out.println(diagonalSum(mat1));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int i = 0, x =mat.length -1;

        int firstSm = 0;
        int secondarySm = 0;

        for (i = 0; i < mat.length; i++){
            firstSm += mat[i][i];
            secondarySm += mat[x][i];
            x--;
        }
        sum = firstSm + secondarySm;

        if (mat.length % 2 == 1){
            int mid = mat.length/2;
            sum = sum - mat[mid][mid];
        }
        return sum;
    }
}
