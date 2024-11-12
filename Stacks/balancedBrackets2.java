//Find the min number of brackets that we need to remove to make the given bracket sequence balanced.

import java.util.*;
public class balancedBrackets2 {
    public static int isBalanced(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.peek()=='(') st.pop();
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
}
