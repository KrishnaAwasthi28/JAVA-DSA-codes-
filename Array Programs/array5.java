import java.util.*;
public class array5 {
    //to find the pairs whose sum is equal to given number
    static int pairs(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int a=arr[i]+arr[j];
                if(a==x){
                    count++;
                }
            }
        }
        return count;
    }
     //to find the triplets whose sum is equal to given number
    static int triplets(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        System.out.println(triplets(arr,x));
        sc.close();
    }
}
