//Evaluation of Postfix Expression

import java.util.*;
public class postfix {
    public static void main(String[] args) {
        Stack<Integer> val=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int asc=(int)ch;
            if(asc>=48 && asc<=57){
                val.push(asc-48);
            }
            else{
                int v2=val.pop();
                int v1=val.pop();
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
