import java.util.*;
public class peterson {
    static int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0,s=0,n1=n;
        while(n>0){
            r=n%10;
            s=s+factorial(r);
            n=n/10;
        }
        if(n1==s){
            System.out.println("Peterson Number ");
        }else{
            System.out.println("Not peterson ");
        }
        sc.close();
    }
}
