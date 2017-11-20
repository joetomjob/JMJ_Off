package ArraysandStrings;
import java.util.HashMap;

/**
 * Created by jtomjob on 8/14/2017.
 */
public class TwoSumHashMap {
    public static void main(String[] args) {
        int target = 18;
        int[] input = {2,7,11,15};
        TwoSumHashMap t = new TwoSumHashMap();
        t.twoSum(input,target);
//        for (int i = 0; i < op.length; i++) {
//            System.out.print(op[i]);
//            System.out.print('\t');
//        }
    }
    public static void twoSum(int[] in, int target){
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            h.put(in[i],i);
        }
        for (int i = 0; i < in.length; i++) {
//            h.get();
        }
    }

}
