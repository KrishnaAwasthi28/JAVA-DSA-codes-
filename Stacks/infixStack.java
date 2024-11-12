//Evaluation of Infix Expression using Stack :

import java.util.*;
public class infixStack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Equation to Evaluate");
        String s=sc.nextLine(); //Input
        Stack<Integer> val=new Stack<>();  //for Values
        Stack<Character> op=new Stack<>();  //for Operators
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int asc=(int)ch;
            if(asc>=48 && asc<=57) val.push(asc-48);  //converting string number into integer
            else if(op.size()==0||ch=='('||op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){ //performing the operations inside ()
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop(); //removes the ( bracket
            }
            else{
                if(ch=='+'||ch=='-'){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        int v2=val.pop();
                        int v1=val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
        sc.close();
    }
}