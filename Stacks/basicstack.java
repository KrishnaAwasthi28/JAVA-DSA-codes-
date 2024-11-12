import java.util.*;
public class basicstack{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>(); //For Integer Datatype
        st.push(1);
        st.push(12);
        st.push(90);
        st.push(5);
        // System.out.println(st.peek()); //Returns the last element that we have pushed that is 5;
        // st.pop();
        // st.size();
        System.out.println(st);
        //To print the first element of stack
        // while(st.size()>1){
        //     st.pop();
        // }
        // System.out.println(st);
    }
}