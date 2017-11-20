package Math;

/**
 * Created by jtomjob on 8/23/2017.
 */
public class reverseInteger {
    public static void main(String[] args) {
        reverseInteger r = new reverseInteger();
        int a = 0;
        System.out.println(r.reverse(a));
    }
    public int reverse(int a) {
        try {
            StringBuilder s = new StringBuilder();
            if(a==0)
                return 0;
            int b= Math.abs(a);
            while (b>0){
                s.append(b%10);
                b = b/10;
            }
            int result =Integer.parseInt(s.toString());
            if (a<0)
                return -result;
            else
                return result;
        }
        catch (Exception e){
            return 0;
        }
    }
}
