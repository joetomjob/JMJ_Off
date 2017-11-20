package Math;

/**
 * Created by jtomjob on 8/23/2017.
 */
public class GCD {
    public static void main(String[] args) {
        GCD g = new GCD();
        System.out.println(g.gcd(22,10));
    }
    public int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
