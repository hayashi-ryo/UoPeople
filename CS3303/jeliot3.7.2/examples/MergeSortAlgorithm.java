
import jeliot.io.*;

public class MergeSortAlgorithm {

    public static void main() {
        int [] data  = new int [5];
        for (int i=0; i < data.length; i++) {
            data[i] = (int) (20 * Math.random());
        }
        sort(data, 0, data.length - 1);
    }
    

    public static void sort(int a[], int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = (lo + hi) / 2;
    
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
    
        int end_lo = mid;
        int start_hi = mid + 1;
    
        while ((lo <= end_lo) && (start_hi <= hi)) {
            if (a[lo] < a[start_hi]) {
                lo++;
            } else {
                int T = a[start_hi];
        
                for (int k = start_hi - 1; k >= lo; k--) {
                    a[k+1] = a[k];
                }
                a[lo] = T;
                lo++;
                end_lo++;
                start_hi++;
            }
        }
    }
}
