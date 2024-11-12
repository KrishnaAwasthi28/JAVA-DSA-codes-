import java.util.*;
public class count {
    static void countsort(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] m={4,1,5,2,1,3,5};
        countsort(m);
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}
