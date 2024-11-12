//Reverse a Queue using extra stack
import java.util.*;
public class reverseQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        int x=0;
        while(x!=-1){
            x=sc.nextInt();
            q.add(x);
        }
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
        sc.close();
    }
}
