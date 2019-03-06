package sort;

import java.util.Arrays;

/**
 * Created by yang0632 on 2019/3/6.
 */
public class quickSort {
    public static void qSort(int[] a){
        quickSort(a,0,a.length-1);
    }

    public static void quickSort(int[] a,int lo,int hi){
        if(lo>=hi || a == null || a.length==0){
            return;
        }
        int v = partition(a,lo,hi);
        quickSort(a,lo,v-1);
        quickSort(a,v+1,hi);
    }

    public static int partition(int[] a,int lo,int hi){
        int v = a[lo];
        while (lo<hi){
            while (lo<hi && a[hi]>=v){ //先从后往前(移动指针时保证lo<hi)
                hi--;
            }
            exch(a,lo,hi);
            while (lo<hi && a[lo]<=v){
                lo++;
            }
            exch(a,lo,hi);
        }
        return lo; //lo即是轴
    }

    public static void exch(int[] a,int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {3,1,0,5,2,4};
        qSort(a);
        System.out.println(Arrays.toString(a));

    }
}
