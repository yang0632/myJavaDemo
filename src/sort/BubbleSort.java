package sort;

import java.util.Arrays;

/**
 * Created by yang0632 on 2019/3/6.
 */
public class BubbleSort {
    public static void bubbleSort(int[] a){
        if(a == null || a.length == 0){
            return;
        }
        for(int i = 0;i < a.length;i++){
            for(int j = 0; j < a.length-1-i; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,5,3,1,4};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
