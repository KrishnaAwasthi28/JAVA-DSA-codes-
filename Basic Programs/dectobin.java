//decimal to binary
import java.util.*;
public class dectobin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int b=0;
        int mul=1;
        while(d>0){
            int n=d%2;
            b=b+(n*mul);
            mul=mul*10;
            d=d/2;
        }
        System.out.println(b);
        sc.close();
    }
    
}