//Reverse the given Stack
import java.util.*;
public class reversestack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter size of stack :");
        int n=sc.nextInt();
        System.out.println("Enter elements in the stack :");
        for(int i=0;i<n;i++){
            int e=sc.nextInt();
            st.push(e);
        }
        Stack<Integer> rt=new Stack<>(); //new stack for storing in reverse order
        for(int i=0;i<n;i++){
            rt.push(st.pop());
        }
        System.out.println(rt);
        sc.close();
    }
}
