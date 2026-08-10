package BinarySeach;
public class Floor {
    static void main(String[] args) {
        int[] arr ={1,2,3,5,9,14,16,24};
        int target = 15;
        System.out.println(Floor(arr,target));
    }
    //return the index : greatest nunber <= target
    static int Floor(int[] arr, int target){
        // if target value is greater then last element in array
        if(target>arr[arr.length-1]){
            return -1;
        }
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
        return end;
    }
}
