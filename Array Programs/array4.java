import java.util.*;
public class array4 {
    static void sorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                 System.out.println("Array is not sorted ");
                 break; 
            }
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
        sorted(arr);
        sc.close();
    }
}
