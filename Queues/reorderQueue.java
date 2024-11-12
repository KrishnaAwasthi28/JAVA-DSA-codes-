//ReOrder Queue using Stack only

import java.util.*;
public class reorderQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=9;i++){
            q.add(i);
        }
        int mid=(q.size()/2);
        while(q.size()>mid){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        while(q.size()>mid){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
