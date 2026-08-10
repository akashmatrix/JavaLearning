package LinearSearch;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr ={{1,43,2,5},
                {2,56,76,3},
                {4,8,58,97,9},
                {43,6,8,79,74},


        };
        int target = 76;
        int[] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {

            if (target == arr[i][j]) {
                return new int[]{i,j};
            }
        }
    }
        return new int[] {-1,-1};
    }

}
