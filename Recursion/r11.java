//wap to print max element of an array
// import java.util.*;
public class r11 {
    static int max(int[] a,int i){
        if(i==a.length-1){
            return a[i];
        }
        int m=max(a,i+1);
        return Math.max(m,a[0]);
    }
    public static void main(String[] args) {
        int[] n={1,2,3,4,5};
        System.out.println(max(n, 0));
    }
}
