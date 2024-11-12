import java.util.*;
public class rev_recursive {
    public static void pushAtBottom(Stack<Integer> st,int ele){
        Stack<Integer> ct=new Stack<>();
        while(st.size()>0){
            ct.push(st.pop());
        }
        st.push(ele);
        while(ct.size()>0){
            st.push(ct.pop());
        }
    }
    public static void reverseSt(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reverseSt(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int e=sc.nextInt();
            st.push(e);
        }
        reverseSt(st);
        System.out.println(st);
        sc.close();
    }
}
