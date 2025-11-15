import java.util.*;
public class prefixSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,1,3,4,5,6};
        // int[] prefix=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();    
    }
}