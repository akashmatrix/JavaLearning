package BinarySeach;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr= {1,3,5,7,9,8,6,4,2};
        System.out.println(mountainArray(arr));

    }

    static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in descending part of array
                // this m,ay be the ans but look at left
                // this why end != mid-1
                end = mid;
            } else {
                // you are in ace part of array
                start = mid + 1;
            }
        }
        // int the end start==end and pointing to largest number because of above two check
        //start and always trying to find max element in the above two checks
        /*hence , when they are pointing to just one element , that is the max one because
         that is what the checks say */

        return start ; // you can also return end as both are equal
    }
}





