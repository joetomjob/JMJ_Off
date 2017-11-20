package Math;

import java.util.ArrayList;

/**
 * Created by jtomjob on 8/23/2017.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz f = new FizzBuzz();
        System.out.println(f.fizzBuzz(20));
    }
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            if(i%3 == 0 && i%5==0)
                res.add("FizzBuzz");
            else if(i%3 == 0)
                res.add("Fizz");
            else if(i%5 == 0)
                res.add("Buzz");
            else
                res.add(""+i);
        }
        return res;
    }
}
