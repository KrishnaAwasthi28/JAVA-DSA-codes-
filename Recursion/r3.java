//fibonacci
import java.util.*;
public class r3 {
    static void fibo(int n){
        int a=0,b=1,c=0;
        System.out.println(a+","+b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fibo(10);
        sc.close();
    }
}
