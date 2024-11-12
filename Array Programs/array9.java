import java.util.*;
public class array9 {
    static void reverse(int[] arr){
        int[] rev=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[arr.length-1-i]=arr[i];
        }
        System.out.print("Array after reversing :");
        for(int i=0;i<arr.length;i++){
            System.out.print(rev[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        sc.close();
    }
}
