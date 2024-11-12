import java.util.*;
public class infixToprefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Equation to convert to Prefix");
        String s=sc.nextLine(); //Input
        Stack<String> val=new Stack<>();  //for Values
        Stack<Character> op=new Stack<>();  //for Operators
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int asc=(int)ch;
            if(asc>=48 && asc<=57){
                String a=""+ch;
                val.push(a);
            }
            else if(op.size()==0||ch=='('||op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){ //performing the operations inside ()
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String f=o+v1+v2;
                    val.push(f);
                }
                op.pop(); //removes the ( bracket
            }
            else{
                if(ch=='+'||ch=='-'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String f=o+v1+v2;
                    val.push(f);
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char o=op.pop();
                        String f=o+v1+v2;
                        val.push(f);
                        op.push(ch);
                    }else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=op.pop();
            String f=o+v1+v2;
            val.push(f);
        }
        System.out.println(s);
        System.out.println(val.peek());
        sc.close();
    }
}
