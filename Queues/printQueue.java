//Print all the elements in the queue without using builtin method and only using add(),remove(),peek() and extra queue
//In thisextra array and extra queue both have been used.
import java.util.*;
public class printQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q1=new LinkedList<>();
        // Queue<Integer> q2=new LinkedList<>();
        q1.add(2);
        q1.add(3);
        q1.add(1);
        q1.add(5);
        q1.add(4);
        int[] arr=new int[q1.size()];
        int i=0;
        while(q1.size()!=0 && i!=q1.size()){
            int x=q1.remove();
            arr[i]=x;
            System.out.print(x+",");
            i++;
        }
        for(int j=0;j<arr.length;j++){
            q1.add(arr[j]);
        }
        // while(q2.size()!=0){
        //     int x=q2.remove();
        //     System.out.print(x+",");
        //     q1.add(x);
        // }
        System.out.println(q1);
        sc.close();
    }
}
