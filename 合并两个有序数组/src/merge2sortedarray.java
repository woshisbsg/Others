import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class merge2sortedarray {
    public static void main(String[] args) {
        int[] a = new int[1];
        int[] b = new int[]{1};
        /*
        a[0] = -1;
        a[1] = 0;
        a[2] = 0;
        a[3] = 3;
        a[4] = 3;
        a[5] = 3;

         */

        merge(a,0,b,1);



    }
    public static void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 || j >= 0) {
            int insert;
            if (i >= 0 && j >= 0) {
                if (A[i] > B[j]) {
                    insert = A[i--];
                } else {
                    insert = B[j--];
                }
            } else if (i >= 0) {
                insert = A[i--];
            } else {
                insert = B[j--];
            }
            A[k--] = insert;
        }

    }
}
