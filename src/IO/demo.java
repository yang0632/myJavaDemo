package IO;

/**
 * Created by yang0632 on 2019/3/7.
public class demo {

}


import java.util.Arrays;
        import java.util.Scanner;

 class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        //String string = in.nextLine();
        int[] taoqi = new int[N];
        for(int i=0;i<N;i++)
        {
            taoqi[i] = in.nextInt();

        }
        Arrays.sort(taoqi);
        int danzhuo = 2*M-N;
        //System.out.println("单桌"+danzhuo);
        if(danzhuo >= N)
        {
            System.out.println(0);
        }
        int[] couple = new int[(N-M)*2];
        for(int i=0;i<couple.length;i++)
        {
            couple[i] = taoqi[i];
        }
        int max = couple[0] + couple[couple.length-1];
        //System.out.println(max+"max");
        for(int i=0;i<=couple.length/2;i++)
        {
            if(max<(couple[i]+couple[couple.length-i-1]))
            {
                max = couple[i]+couple[couple.length-i-1];
            }
        }
        System.out.println(max);
    }
    Integer.ma
}


#include<bits/stdc++.h>
#include<algorithm>
#include<cstdio>
#include<iostream>


        using namespace std;

                Integer MAX = Integer.MAX_VALUE;
        int n;
                int[] F = new int[MAXN];

        int father(int x)
        {
        return F[x] == x ? x : F[x] = father(F[x]);
        }

        int tot;
        struct node
        {
        int x, y, w;
        bool operator < (const node &A) const
        {
        return w < A.w;
        }
        }e[MAXN];

        int main()
        {

        scanf("%d", &n);
        for (int i = 1; i <= n; ++ i)
        for (int j = i; j <= n; ++ j)
        {
        int w;
        scanf("%d", &w);
        e[++ tot] = {i-1, j, w};
        }
        sort(e+1, e+tot+1);
        for (int i = 0; i <= n; ++ i)
        F[i] = i;
        long long ans = 0;
        for (int i = 1; i <= tot; ++ i)
        {
        int x = father(e[i].x), y = father(e[i].y);
        if (x == y) continue;
        ans += e[i].w;
        F[x] = y;
        }
        cout << ans << endl;

        return 0;
        }
 */
