
import java.util.*;
public class swap {
    static void swapping(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        // a=a+b;
        // b=a-b;
        // a=a-b;
        System.out.println("After swapping a:"+a+" and b:"+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of x and y :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        swapping(x,y);
        
        sc.close();
    }
}
