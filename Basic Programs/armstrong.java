import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        double pow=n%10;
        double arm=0;
        while(n>0){
            int r=n%10;
            arm=arm+Math.pow(r,pow);
            n=n/10;
        }
        if(arm==n1){
            System.out.println("Armstrong ");
        }else{
            System.out.println("Not Armstrong ");
        }
        sc.close();
    }
}
