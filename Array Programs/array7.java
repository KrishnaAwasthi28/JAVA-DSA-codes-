import java.util.*;
public class array7 {
    static void secondlargest(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2 && arr[i]<max){
                max2=arr[i];
            }
        }
        System.out.println(max2);
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
        secondlargest(arr);
        sc.close();
    }
}
