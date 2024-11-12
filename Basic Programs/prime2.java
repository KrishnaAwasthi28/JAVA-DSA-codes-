import java.util.*;
public class prime2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b[]=new boolean[n+1];
        for(int i=0;i<=n;i++){
            b[i]=true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(b[i]){
                for(int j=i*i;j<=n;j=j+i){
                    b[j]=false;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(b[i]==true){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}




