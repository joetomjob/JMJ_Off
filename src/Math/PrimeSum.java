package Math;

import java.util.ArrayList;

/**
 * Created by jtomjob on 8/23/2017.
 */
public class PrimeSum {
    public static void main(String[] args) {
        PrimeSum p = new PrimeSum();
        System.out.println(p.primesum(21));

    }
    public ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= a/2 ; i++) {
            if(isPrime(i)){
                if(isPrime(a-i)){
                    result.add(i);result.add(a-i);
                    return result;
                }
            }
        }
        return result;
    }

    public boolean isPrime(int a){
        for (int i = 2; i <= Math.sqrt(a) ; i++) {
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}

