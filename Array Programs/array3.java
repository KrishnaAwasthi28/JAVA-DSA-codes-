import java.util.*;
public class array3 {
    static int greaterelements(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
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
        System.out.println("Enter the element you want to compare");
        int c=sc.nextInt();
        System.out.println("No. of elements greater than "+c+" are "+greaterelements(arr,c));
        sc.close();
    }
}
