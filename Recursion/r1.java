//wap to print all natural number from n to 1
import java.util.*;
public class r1{
    static void natural(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        natural(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        natural(n);
        sc.close();
    }
}