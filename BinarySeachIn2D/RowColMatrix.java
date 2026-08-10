package BinarySeachIn2D;
import java.util.Arrays;
public class RowColMatrix {
    static void main(String[] args) {
        int[][] arr = {
                {10, 20, 28, 49},
                {12, 23, 30, 55},
                {15, 25, 35, 57},
                {17, 27, 44, 67}
        };
        System.out.println(Arrays.toString(search(arr, 30)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}


