package Math;

import java.util.ArrayList;

/**
 * Created by jtomjob on 8/24/2017.
 */
public class RearrangeArray
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);a.add(2);a.add(3);a.add(0);a.add(1);
        RearrangeArray r = new RearrangeArray();
        r.arrange(a);
    }
    public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 0; i < n; i++) {
            a.set(i,a.get(i)+(a.get(a.get(i))%n)*n);
        }
        for (int i = 0; i < n; i++) {
            a.set(i,a.get(i)/n);
        }
        System.out.println(a);
    }
}
