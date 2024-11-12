//rotate the given array by k steps without creating a new array 
import java.util.*; 
public class array12 {
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
    static void reverse(int[] arr,int s,int e){
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;

        }
    }
    static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
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
        System.out.print("Enter the number of steps of rotation :");
        int k=sc.nextInt();
        rotate(arr,k);
        printarray(arr);
        sc.close();
    }
}
