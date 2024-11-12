//check whether the given brackets sequence is balanced or not.

import java.util.*;
public class balancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
}
