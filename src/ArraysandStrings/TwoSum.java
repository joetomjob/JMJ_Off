package ArraysandStrings;

/**
 * Created by jtomjob on 8/14/2017.
 */
public class TwoSum {
    public static void main(String[] args) {
        int target = 18;
        int[] input = {2,7,11,15};
        TwoSum t = new TwoSum();
        int[] op = t.twoSum(input,target);
        for (int i = 0; i < op.length; i++) {
            System.out.print(op[i]);
            System.out.print('\t');
        }

    }
    public static int[] twoSum(int[] in, int target){
        int max = 0;
        int[] op = new int[2];
        for (int i = 0; i < in.length; i++) {
            if(in[i]>max){
                max = in[i];
            }
        }
        int[] tstin = new int[max+1];
        for (int i = 0; i < in.length; i++) {
            tstin[in[i]] = 1;
        }
        for (int i = 0; i < max+1; i++) {
            if(tstin[i]==1 && target-i<max+1 && tstin[target-i]==1){
                op[0] = i;
                op[1] = target-i;
                break;
            }
        }
        return op;
    }
}
