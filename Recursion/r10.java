//wap to print array elements recursively
import java.util.*;
public class r10 {
    static void pri(int[] a,int i){
        if(i==a.length){
            return;
        }
        pri(a,i+1);
        System.out.print(a[i]+" ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] m={1,2,3,4,5};
        pri(m, 0);
        sc.close();
    }
}
