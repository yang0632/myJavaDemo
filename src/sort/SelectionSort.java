package sort;

import java.util.Arrays;

/**
 * Created by yang0632 on 2019/3/23.
 */
public class SelectionSort {

    public static void selectionSort(int[] a){
        for(int i = 0;i<a.length-1;i++){
            int min = i;
            for(int j = i;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            exch(a,i,min);
        }
    }
    public static void exch(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j]=tmp;
    }
    public static void main(String[] args) {
        int[] a = {2,6,3,7,5,8,1,4};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
