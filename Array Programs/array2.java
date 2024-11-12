import java.util.*;
public class array2 {
    static void printarr(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    static int checkoccur(int[] arr,int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count=count +1;
            }
        }
        return count;
    }
    static int lastoccur(int[] arr,int x){
        int lastindex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastindex=i;
            }
        }
        return lastindex;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println("Enter Element you want to check occurence of -");
        // int e=sc.nextInt();
        System.out.println("Enter Element you want to check last occurence of -");
        int l=sc.nextInt();
        // System.out.println("Element "+e+" has occured "+checkoccur(arr, e)+" times");
        System.out.println("Element "+l+" has last occured at index-"+lastoccur(arr, l));
        
        sc.close();
    }
}
