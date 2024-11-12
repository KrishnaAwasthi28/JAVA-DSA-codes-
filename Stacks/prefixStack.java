//Evaluation of Prefix Expression

import java.util.*;
public class prefixStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> val=new Stack<>();
        String s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int asc=(int)ch;
            if(asc>=48 && asc<=57) val.push(asc-48);
            else{
                int v1=val.pop();
                int v2=val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
        sc.close();
    }
}
