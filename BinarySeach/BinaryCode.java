package BinarySeach;

public class BinaryCode {
    static void main(String[] args) {
        int[] arr ={4,9,12,14,17,23,28,40};
        int target = 12;
        System.out.println(binarySearch(arr,target));

    }
    //return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        //find the middle element
        while(start<=end) {
        int mid = start + (end-start)/2;

            if (arr[mid] > target) {
                end = mid - 1;

            } else if (arr[mid] < target) {

                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
