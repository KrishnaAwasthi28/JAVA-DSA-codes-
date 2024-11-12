import java.util.*;
public class merges {
    static void merge(int[] arr,int l,int m,int r){
        int i,j,k;
        int n1=(m-l)+1;
        int n2=r-m;;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            R[j]=arr[m+1+j];
        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){ //this will compare the elements in both parts of array and place it in arr        accordingly.
            if(L[i]<R[j]){
                arr[k]=L[i];
                i++;
                k++;
            }else{
                arr[k]=R[j];
                j++;
                k++;
            }
        }
        while(i<n1){ //if j goes out of bound then all the elements at i will get in arr as it as
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){ //if i goes out of bound then all the elements at j will get in arr as it as
            arr[k]=R[j];
            j++;
            k++;
        }    
    }
    static void mergesort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergesort(arr, l, mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] m=new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        mergesort(m, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}
