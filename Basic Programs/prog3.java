import java.util.Scanner;
public class prog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n :");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                s=s-i;
            }
            else{
                s=s+i;
            }

        }
        System.out.println(s);
        sc.close();
    }
}
