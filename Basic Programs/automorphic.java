//Automorphic number in java

import java.util.*;
public class automorphic {
    static boolean auto(int n){
        int sq=n*n;
        int nl=0;
        int sql=0;
        while(n>0){
            sql=sq%10;
            nl=n%10;
            if(nl==sql){
                sq=sq/10;
                n=n/10;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        if(auto(m)){
            System.out.println("Automorphic ");
        }else{
            System.out.println("Non Automorphic");
        }
               
        sc.close();
    }
}
