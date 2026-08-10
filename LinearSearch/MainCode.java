package LinearSearch;

public class MainCode {
    public static void main(String[] args) {
        int [] num = {25,78,5264,45,-9,36};
        int target=45;
        int ans=linearSearch(num,target);
        System.out.println(ans);

    }

    //search in  the array : return the index if item found
    // otherwise if item is found return -1
    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        for (int index=0; index<arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}