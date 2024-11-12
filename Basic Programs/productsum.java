//WAP to print the sum of each digit of given number.eg: 543 ,sum=5+4+3=12, prod=5*4*3=60

import java.util.*;
public class productsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        int s=0,p=1;
        while(n>0){
            r=n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        System.out.println(s);
        System.out.println(p);
        sc.close();
    }
    
}
