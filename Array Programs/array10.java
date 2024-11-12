//reverse of array 
import java.util.*;
public class array10 {
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print (arr[i] +" ");
        }
    }
    static void swaparray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
           swaparray(arr, i, j); 
           i++;
           j--;
        }
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
        reverse(arr);
        System.out.println("Array after reversing :");
        printarray(arr);
        sc.close();
    }
}
