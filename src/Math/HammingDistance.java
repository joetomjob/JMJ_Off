package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jtomjob on 8/23/2017.
 */
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance h = new HammingDistance();
        ArrayList<Integer> l = new ArrayList<>();
        l.add(2);l.add(4);l.add(6);
        System.out.println(h.hammingDistance(l));
//      h.hammingDistance(l);

    }
    public int hammingDistance(final List<Integer> A) {
        int sz = A.size();
        int sum = 0;
        for (int i = 0; i < sz; i++) {
            for (int j = i; j < sz; j++) {
                if(i!=j){
                    if(A.get(i)!=A.get(j)){
                        sum += 2 * this.difference(A.get(i), A.get(j));
                    }
                }
            }
        }
        return sum;
    }
    public int difference(int a, int b){
        ArrayList<Integer> a1 = this.convertintobinary(a);
        ArrayList<Integer> b1 = this.convertintobinary(b);
        ArrayList<Integer> temp;
        int i,k,counter=0;
        if(a1.size()>b1.size()) {
            k = b1.size();
            temp = new ArrayList<>(a1);
        }
        else {
            k = a1.size();
            temp = new ArrayList<>(b1);
        }
        for (i = 0; i < k; i++) {
            if(a1.get(i)!= b1.get(i))
                counter++;
        }
        while (i<temp.size()){
            if(temp.get(i)==1)
                counter++;
            i++;
        }

        return counter;
    }

    public int hammingDistance2(final List<Integer> A) {
        int sz = A.size();
        int sum = 0;

        return sum;
    }

    public ArrayList<Integer> convertintobinary(int a) {
        ArrayList<Integer> r = new ArrayList<>();
        if (a==0) {
            r.add(0);
            return r;
        }
        while(a!=1){
            r.add(a%2);
            a=a/2;
        }
        r.add(a);
        return r;
    }
}
