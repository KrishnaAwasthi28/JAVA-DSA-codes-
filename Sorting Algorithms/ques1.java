//in given integer array move all the 0 at the last of the array while maintaning the relative order of array
//eg : 0 5 3 0 42 -> output : 5 3 42 0 0 
import java.util.*;
public class ques1 {
    static void sorting(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==0){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] m={5,0,1,2,0,3,4,0,2,5};
        sorting(m);
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}
