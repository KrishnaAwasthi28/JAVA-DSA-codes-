import java.util.*;

public class rough {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        A=A.substring(0,1).toUpperCase() + A.substring(1);
        B=B.substring(0,1).toUpperCase() + B.substring(1);
        int a=A.length();
        int b=B.length();
        int sum=a+b;
        System.out.println(sum);
        if(A.compareTo(B)<0){
            System.out.println("N0");
        }else{
            System.out.println("YES");
        }
        System.out.print(A+" "+B);
        // System.out.print(B);
        sc.close();
    }
}