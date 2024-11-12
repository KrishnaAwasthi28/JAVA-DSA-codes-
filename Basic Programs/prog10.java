import java.util.*;
class Add{
    public int sum(int a,int b){
        int ans=a+b;
        return ans;
    }
}
public class prog10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        Add obj=new Add();
        int s=obj.sum(c,d);
        System.out.print("The sum of two numbers are :" +s);
        sc.close();
    }
}