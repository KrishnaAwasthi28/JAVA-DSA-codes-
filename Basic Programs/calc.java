import java.util.*;
public class calc{
    public static float add(float a,float b){
        return a+b;
    }
    public static float sub(float a,float b){
        return a-b;
    }
    public static float mul(float a,float b){
        return a*b;
    }
    public static float div(float a,float b){
        return a/b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        System.out.println(add(x, y));
        System.out.println(sub(x, y));
        System.out.println(mul(x, y));
        System.out.println(div(x, y));
    }
}