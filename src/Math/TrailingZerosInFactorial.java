package Math;

/**
 * Created by jtomjob on 8/23/2017.
 */
public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        TrailingZerosInFactorial t = new TrailingZerosInFactorial();
        System.out.println(t.trailingZeroes(5487));
//        t.factorial(10);
    }
    public int trailingZeroes(int a) {
        int count=0;
        for (int i = 5; a/i >= 1; i=i*5) {
            count+=a/i;
        }
        return count;
    }
    public void factorial(int a){
        long res = 1;
        for (int i = 1; i <= a; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}
