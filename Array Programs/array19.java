//Check if we can partition the array into two subarrays with equal sum.More formally, check that prefix sum of array is equal to the suffix sum of array.
import java.util.*;
public class array19 {
    static int totalsum(int[] arr){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static boolean partition(int[] arr){
        int totalsum=totalsum(arr);
        int pref=0;
        for(int i=0;i<arr.length;i++){
            pref+=arr[i];
            int suffix=totalsum-pref;
            if(suffix==pref){
                return true;
            }
        }
        return false;
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
        System.out.println("Partition :"+partition(arr));
        sc.close();
    }
}
