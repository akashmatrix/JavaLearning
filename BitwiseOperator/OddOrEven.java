package BitwiseOperator;

public class OddOrEven {
    static void main(String[] args) {
        int n = 76;
        System.out.println(Isodd(n));
    }
        private static boolean Isodd(int n){
        return (n&1) == 1;
        }
}
 