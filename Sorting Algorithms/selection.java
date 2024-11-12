import java.util.*;
public class selection {
    static void selectionsort(int[] a){
        int n=a.length;
        int min=0;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] m=new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        selectionsort(m);
        for(int i=0;i<n;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}
