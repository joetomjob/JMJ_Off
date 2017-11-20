package binarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jtomjob on 8/25/2017.
 */
public class RotatedArray {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);a.add(1);a.add(6);a.add(9);a.add(9);
        RotatedArray c = new RotatedArray();
        System.out.println(c.findMin(a));
    }
    public int findMin(final List<Integer> a) {
        int min = a.get(0);
        int n = a.size();
        int start =0;
        int end = a.size();
        while(end>=start){
            int mid = (start+end)/2;
            if(mid-1>=0) {
                if (a.get(mid) < a.get(mid - 1))
                    return a.get(mid);
                else{
                    if(a.get(mid)>a.get(n-1))
                        start = mid+1;
                    else
                        end=mid-1;
                 }
            }
        }
        return min;
    }
}
