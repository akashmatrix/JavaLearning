package LinearSearch;

public class SearchInRang {
    public static void main(String[] args) {
        int [] num = {25,78,5264,45,-9,36};
        int target=45;

        System.out.println(linearSearch(num,target,2,5));


}
static int linearSearch(int[] arr, int target ,int start, int end) {

    if (arr.length == 0) {
        return -1;
    }
    for (int index = start; index < end; index++) {
        int element = arr[index];
        if (element == target) {
            return index;
        }
    }

    return -1;
}
}