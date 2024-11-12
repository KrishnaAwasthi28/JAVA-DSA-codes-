//In given sorted array ,return an array of the sqaures of each number sorted in non decreasing order.
import java.util.*;
public class array16 {
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            
        }
    }
    static int[] square(int[] arr){
        int[] ans=new int[arr.length];
        int l=0,r=arr.length-1,i=0;
        while(l<r){
            if(Math.abs(arr[l])>Math.abs(arr[r])){
                ans[i]=arr[l]*arr[l];
                i++;
            }
            else{
                ans[i]=arr[r]*arr[r];
                i++;
            }
        }
        return ans;
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
        square(arr);
        printarray(arr);
        sc.close();
    }
}
