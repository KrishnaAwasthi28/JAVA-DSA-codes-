//There are N stones,numbered 0,1,2,..N-1. For each i(0<i<N), the height of stone i is h[i]. There is a frog who is initially on stone 0. He will repeat the following actions some number of times to reach stone N-1.\
//If the frog is currently on stone i,jump to stone i+1 or stone i+2.
//Here,a cost of |h[i] - h[j]| is incurred,where j is the stone to land on.
//Find the minimum possible total cost incurred before the frog reaches stone N.

import java.util.*;
public class frogRrecursion{
    static int mincost(int[] h,int i){
        if(i==h.length-1){
            return 0;
        }
        int x=Math.abs(h[i] - h[i+1]) + mincost(h,i+1);
        if(i==h.length-2){
            return x;
        }
        int y=Math.abs(h[i] - h[i+2]) + mincost(h,i+2);
        return Math.min(x,y);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] m=new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        System.out.println(mincost(m, 0));
        sc.close();
    }
}
