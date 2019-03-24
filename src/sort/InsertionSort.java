package sort;

import java.util.Arrays;

/**
 * Created by yang0632 on 2019/3/23.
 */
public class InsertionSort {
    public static void insertionSort(int[] a){
        int len = a.length;
        for (int i = 1 ; i< len;i++){ //从1开始
            int tmp = a[i];
            for (int j = i;j>=0;j--){
                if(j>0 && a[j-1]>tmp){
                    a[j] = a[j-1];
                }else {
                    a[j] = tmp;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {2,6,3,7,5,8,1,4};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
