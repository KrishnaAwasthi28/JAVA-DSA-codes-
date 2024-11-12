//Reverse k elements in a Queue

import java.util.*;
public class reverseKeleQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> qt=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=5;i++){
            qt.add(i);
        }
        System.out.println("Enter K:");
        int k=sc.nextInt();
        for(int i=0;i<=k;i++){
            st.push(qt.remove());
        }
        for(int i=1;i<=qt.size()-k;i++){
            int r1=qt.remove();
            qt.add(r1);
        }  
        System.out.println(qt);
        sc.close();
    }
}
