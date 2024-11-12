import java.util.*;
public class insertion{
    static void insertionsort(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] m=new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        insertionsort(m);
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}
