
import java.util.*;
public class insertstack {
    public static void insertAtBottom(Stack<Integer> st,int e){
        Stack<Integer> ct=new Stack<>();
        while(st.size()>0){
            ct.push(st.pop());
        }
        st.push(e);
        while(ct.size()>0){
            st.push(ct.pop());
        }
        System.out.println(st);
    }
    public static void insertAt(Stack<Integer> st,int e,int idx){
        Stack<Integer> ct=new Stack<>();
        while(st.size()>idx){
            ct.push(st.pop());
        }
        st.push(e);
        while(ct.size()>0){
            st.push(ct.pop());
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter no. of elements :");
        int n=sc.nextInt();
        System.out.println("Enter elements ;");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Enter element to Insert at bottom :");
        int t=sc.nextInt();
        insertAtBottom(st, t);
        insertAt(st, t, 3);
        sc.close();
    }
}
