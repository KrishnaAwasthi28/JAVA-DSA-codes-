import java.util.*;
public class prime {
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= n / 2; i++)
        if (n % i == 0)
            return false;
  
    return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range :");
        int a=sc.nextInt();
        for(int i=1;i<a;i++){
            if(isprime(i)==true){
                System.out.print(i +",");
            }
        }
        // System.out.println(isprime(a));
        sc.close();
    }
}
