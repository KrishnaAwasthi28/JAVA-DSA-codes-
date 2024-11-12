//Fibonacci series using recursion
import java.util.*;
public class r4 {
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev=fibo(n-1);
        int prevprev=fibo(n-2);
        return prev+prevprev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(fibo(i));
        }
        sc.close();
    }    
}
