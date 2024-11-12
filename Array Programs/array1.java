import java.util.*;
public class array1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n=sc.nextInt();
        int s=0;
        int max=0;
        int []arr=new int[n];
        System.out.println("Enter all the elements of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();        
        }
        for(int i=0;i<n;i++){
            s= s+arr[i] ;
        }
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            else{
                continue;
            }
        }
        System.out.print("Enter the number to be searched :");
        int find=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==find){
                System.out.println("Element is present at Index "+i);
                break;
            }
        }
        System.out.println("Sum of all elements :"+s);
        System.out.println("Maxximum of all elements :"+max);
        sc.close();
    }
}