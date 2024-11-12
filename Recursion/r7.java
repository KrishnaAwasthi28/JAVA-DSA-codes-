//given a number n and a number k,find k multiples of n.
import java.util.*;
public class r7 {
    static void mul(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        mul(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of n and k:");
        int n1=sc.nextInt();
        int k=sc.nextInt();
        mul(n1, k);
        sc.close();
    }
}
