package BitwiseOperator;

public class FindSingleNum {
    static void main(String[] args) {

        int[] arr = {1,2, 3, 1,4, 2,  3, 7, 4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int num =0;
        for( int n : arr){
            num ^= n;
        }

         return num;

    }
}
