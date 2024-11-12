import java.util.*;
public class arrayStack {
    public static class stack{
        int[] arr=new int[10];
        int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full ");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty !");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty !");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack st=new stack();
        System.out.println("Enter the number of elements :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int e=sc.nextInt();
            st.push(e);
        }
        st.display();
        System.out.println(st.peek());
        sc.close();
    }
}
