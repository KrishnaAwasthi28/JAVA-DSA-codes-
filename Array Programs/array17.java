//Given array,return the prefix sum/running sum in the same array without creating a new array.

import java.util.*;
public class array17 {
    static int[] prefixsum(int[] arr){
        // int[] pref=new int[arr.length];
        // pref[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[]pref=prefixsum(arr);
        System.out.println("Array after Prefix sum:");
        for(int i=0;i<n;i++){
            System.out.print(pref[i]+" ");
        }
        sc.close();
    }
}
