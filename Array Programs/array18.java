//Given array of size n, answer Q queries where you need to print the sum of values in a given range
import java.util.*;
public class array18 {
    static int[] prefixsum(int[] arr){
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
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int[] pref=prefixsum(arr);
        System.out.print("Enter the no. of Queries :");
        int q=sc.nextInt();
        int sum=0;
        while(q>0){
            System.out.println("Querie no."+q);
            System.out.print("Enter Left Indices :");
            int l=sc.nextInt();
            System.out.print("Enter Right Indices :");
            int r=sc.nextInt();
            sum=pref[r]-pref[l-1];
            System.out.println("Sum of Elments from "+l+" to "+r+" : "+sum);
            q--;
        }
        sc.close();
    }
}
