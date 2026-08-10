package BinarySeach;
import java.util.Scanner;
public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {67, 54, 45, 30, 25, 19, 12, 6, 4, };
        int target = 30;
        System.out.println(OderAgnostic(arr,target));
    }
    static int OderAgnostic(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        // find where array is short in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {

                    start = mid + 1;
                }
            }
        }
                return -1;

            }
        }
