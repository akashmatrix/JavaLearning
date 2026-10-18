package BitwiseOperator;

public class SetBit {
    static void main(String[] args) {
        int n = 4;
        System.out.println(ans(n));
    }
    private static int ans(int n){
        int index=1;
         while((n&1)!=1){
             index++;
            n= n>>1;
         }

        return index;
    }

}
