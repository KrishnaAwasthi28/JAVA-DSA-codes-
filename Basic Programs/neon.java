//Neon Number 
import java.util.*;
public class neon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqrt=n*n;
        int r=0;
        int s=0;
        while(sqrt!=0){
            r=sqrt%10;
            s+=r;
            sqrt=sqrt/10;
        }
        if(n==s){
            System.out.println("Neon Number ");
        }else{
            System.out.println("Not a neon number ");
        }
        sc.close();
    }
}
