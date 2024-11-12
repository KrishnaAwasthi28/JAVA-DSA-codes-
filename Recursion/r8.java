//wap to print sum of series upto n,with alternate signs 
//eg: n=5, 1-2+3-4+5=3 ans.
import java.util.*;
public class r8 {
    static int signs(int n){
        if(n==1 || n==0){
            return n;
        }
        if(n%2==0){
            return signs(n-1)-n;
        }
        else{
            return signs(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println(signs(n1));
        sc.close();
    }
}
