//Smallest Element of the stack

import java.util.*;
public class minStackEle {
    public static int getmin(Stack<Integer> st){
        int m=Integer.MAX_VALUE;
        while(st.size()>0){
            if(st.peek()<m) m=st.peek();
            st.pop();
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int e=sc.nextInt();
            st.push(e);
        }
        System.out.println(getmin(st));
        sc.close();
    }
}
