//Binary to Decimal Conversion
import java.util.*;
public class bintodec{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int s;
        int d=0;
        int pow=1;
        while(b>0){
            s=b%10;
            d=d+(s*pow);
            b=b/10;
            pow=pow*2;
        }
        System.out.println(d);
        sc.close();
    }
}