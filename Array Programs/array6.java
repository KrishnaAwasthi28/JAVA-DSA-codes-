import java.util.*;
public class array6 {
    static int unique(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                x=arr[i];
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unique number is :"+unique(arr));
        sc.close();
    }
}
