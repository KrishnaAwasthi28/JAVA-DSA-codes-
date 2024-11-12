//given two interger , find power such that a^b;
import java.util.*;
public class r6 {
    static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
        return pow(a,b-1)*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(pow(n, m));
        sc.close();
    }    
}
