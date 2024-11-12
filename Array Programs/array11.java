//rotate the given array k times 
import java.util.*;
public class array11 {
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of time you want to rotate the array :");
        int k=sc.nextInt();
        System.out.print("Array after rotation :");
        printarray(rotate(arr, k));
        sc.close();
    }
}
