//Prefix to Infix Expression conversion

import java.util.*;
public class prefixToInfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> val=new Stack<>();
        String s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int asc=(int)ch;
            String f=""+ch;
            if(asc>=48 && asc<=57) val.push(f);
            else{
                String v1=val.pop();
                String v2=val.pop();
                char c=ch;
                String t=v1+c+v2;
                val.push(t);
            }
        }
        System.out.println(val.peek());
        sc.close();
    }
}
