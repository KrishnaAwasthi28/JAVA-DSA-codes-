//given Q queries,check if the given number is present in array or not.Array size should not be more than 10^5.(Hint:Make frequency array)
import java.util.*;
public class array13 {
    static int[] frequencyarray(int[] arr){
        int[] freq=new int[1000001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
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
        System.out.print("Enter the no. of Queries :");
        int q=sc.nextInt();
        int[] freq=frequencyarray(arr);
        while(q>0){
            System.out.print("Enter the element to search for :");
            int s=sc.nextInt();
            if(freq[s]>0){
                System.out.println("YES");
            }    
            else{
                System.out.println("NO");
            }
            q--;
        }
        sc.close();
    }
}
