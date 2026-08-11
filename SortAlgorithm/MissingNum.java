//https://leetcode.com/problems/missing-number/
//Amazon Question
package SortAlgorithm;

class MissingNum {
    public static void main() {
   int[] arr ={7,3,2,5,6,1,0};


        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {

            int i = 0;
            while (i < arr.length) {
                int correct = arr[i] ;
                if (arr[i] < arr.length && arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] != index){
                return index;
            }

        }
        return arr.length;
        }
        static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
