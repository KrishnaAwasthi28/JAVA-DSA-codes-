//This is the third approach for min stack problem, second aproach i did on leetcode which is easy and best for coding rounds during interview

import java.util.*;
public class minStack {
    public static class MinStack{
        public static Stack<Integer> st=new Stack<>();
        public static int min=Integer.MAX_VALUE;
        public static void push(int val){
            if(st.size()==0){
                st.push(val);
                min=val;
            }
            else if(min<=val) st.push(val);
            else if(val<min){
                st.push((2*val)-min);
                min=val;
            }
        }
        public static void pop(){
            if(st.size()==0) return;
            else if(st.peek()>min) st.pop();
            else{
                int old=(2*min)-st.peek();
                min=old;
                st.pop();
            }
        }
        public static int top(){
            if(st.size()==0) return -1;
            else if(st.peek()>min) return st.peek();
            else return min;
        }
        public static int getMin(){
            return min;
        }
    }
    public static void main(String[] args) {
        MinStack st=new MinStack();
        st.push(10);
        st.push(20);
        st.push(2);
        System.out.println(st.getMin());

    }
}
