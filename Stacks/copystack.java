//Copy the given Stack into another Stack 
//T.C - O(3N)
import java.util.*;
public class copystack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the size of Stack :");
        int n=sc.nextInt();
        int e;
        System.out.println("Enter the elements in Stack:");
        for(int i=0;i<n;i++){
            e=sc.nextInt();
            st.push(e);
        }
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
        Stack<Integer> ct=new Stack<>();
        while(rt.size()>0){
            ct.push(rt.pop());
        }
        System.out.println(ct);
        sc.close();
    }
}
