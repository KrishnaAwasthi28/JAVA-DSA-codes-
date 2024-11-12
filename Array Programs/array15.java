//I given array, move all even integers at the beginning of array and all odd integers at the end of array
import java.util.*;
public class array15 {
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void even_odd_sort(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]%2==1 && arr[r]%2==0){
                swap(arr,l,r);
                l++;
                r--;
            }
            if(arr[l]%2==0){
                l++;
            }
            if(arr[r]%2==1){
                r--;
            }
        }
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
        even_odd_sort(arr);
        System.out.println("Sorted Even and Odd elements :");
        printarray(arr);
        sc.close();
    }
}
