import java.util.*;
public class quick {
    static int partition(int[] arr,int s,int e){
        int pivot=arr[s];
        int count =0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<pivot){
                count++;
            }
        }
        int pivotindex=s+count;
        int temp=arr[s];
        arr[s]=arr[pivotindex];
        arr[pivotindex]=temp;
        int i=s;
        int j=e;
        while(i<pivotindex && j>pivotindex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotindex && j>pivotindex){
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
                i++;
                j--;
            }
        }
        return pivotindex;
    }
    static void quicksort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int p=partition(arr, s, e);
        quicksort(arr, s, p-1);
        quicksort(arr, p+1, e);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] m={7,13,8,5,10,2,4};
        quicksort(m, 0, m.length-1);
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}
