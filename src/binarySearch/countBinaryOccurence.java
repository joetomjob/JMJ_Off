package binarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jtomjob on 8/25/2017.
 */
public class countBinaryOccurence {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);a.add(2);a.add(6);a.add(9);a.add(9);
        countBinaryOccurence c = new countBinaryOccurence();
        System.out.println(c.findCount(a,2));
    }
    public int findCount(final List<Integer> a, int b) {
        int n = a.size();
        int count=0;
        int start = 0;
        int end = n;
        while (end>=start){
            int m = (start+end)/2;
            if(a.get(m)==b){
                count++;
                int fw=m+1;
                int bk=m-1;

                for (int i = fw; i < n; i++) {
                    if(a.get(i)==b)
                        count++;
                    else
                        break;
                }
                for (int i = bk; i >= 0; i--) {
                    if(a.get(i)==b)
                        count++;
                    else
                        break;
                }
                return count;
            }
            else if(a.get(m)>b)
                end = m-1;
            else if(a.get(m)<b)
                start = m+1;
        }
        return count;
    }
}
