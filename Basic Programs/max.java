import java.util.*;
public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A  :");
        int a=sc.nextInt();
        System.out.println("Enter B  :");
        int b=sc.nextInt();
        System.out.println("Enter C  :");
        int c=sc.nextInt();
        // if(a>b){
        //     System.out.println("A is greater ");
        // }
        // else{
        //     System.out.println("B is greater ");
        // }
        int max=((a>b && a>c)?a:(b>c)?b:c);
        System.out.println(max);
        sc.close();
    }
    
}
