import java.util.*;
public class bubble{
    static void bubblesort(int[] a){
        int temp=0,n=a.length;
        boolean flag=false;//to optimize code
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;//to optimize code
                }
            }
            if(flag==false){
                return;
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
        bubblesort(m);
        for(int i=0;i<n;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}