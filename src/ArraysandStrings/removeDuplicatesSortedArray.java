package ArraysandStrings;

/**
 * Created by jtomjob on 8/10/2017.
 */
public class removeDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,5,5,5,5,7,8,9,9,9};
        removeDuplicatesSortedArray r = new removeDuplicatesSortedArray();
        System.out.println("The length is: "+r.DuplicatesSortedArray(a));

    }
    public int DuplicatesSortedArray(int[] a){
        int length =1;
        int[] b = new int[a.length];
        if(a.length==0){
            return 0;
        }
        else {
            b[0] = a[0];
            int temp = a[0];
            for (int i = 1; i < a.length; i++) {
                if (temp != a[i]) {
                    temp = a[i];
                    b[length] = temp;
                    length++;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(b[i]);
            System.out.print('\t');
        }
        System.out.print('\n');
        return length;
    }
}
