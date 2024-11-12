import java.util.Scanner;
public class prog2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number -");
        int n=sc.nextInt();
        int count =0;
        int s=0;
        int r=0;
        while(n>0){
            s=n%10;
            r=(r*10)+s;
            n=n/10; 
            count=count+1;
        }
        System.out.println("Length of Number-"+count);
        System.out.println("Sum of Numbers -"+s);
        System.out.println("Reverse of Number -"+r);
        sc.close();
    }
}