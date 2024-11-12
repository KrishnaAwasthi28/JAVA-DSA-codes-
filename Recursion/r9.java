//Find GCD (Greatest Common Divisor) //Euler's Pi Algorithm
import java.util.*;
// public class r9 {
//     static int gcd(int x,int y){
//         int a=0;
//         while(x%y!=0){
//             a=x%y;
//             x=y;
//             y=a;
//         }
//         return y;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int c=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println(gcd(c, b));
//         sc.close();
//     }
// }

//CO PRIME NUMBER PROBLEM 
public class r9{
   
    static int gcd(int x,int y){
        if(x==0){
            return y;
        }
        return gcd(y%x,x);
    }
    static int fact(int n){
        int result=1;
        for(int i=2;i<n;i++){
            if(gcd(i,n)==1){
                result ++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int m=sc.nextInt();
        // System.out.println(gcd(n, m));
        System.out.println(fact(n));
        sc.close();
    }
}