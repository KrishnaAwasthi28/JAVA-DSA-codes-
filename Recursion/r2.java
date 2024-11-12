import java.util.*;
public class r2 {
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(factorial(5));
        sc.close();
    }
}
