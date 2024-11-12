// Implementation of Queue using Array

public class arrayQueue {
    public static class queueA{
        int[] arr=new int[100];
        int f=-1;
        int r=-1;
        int size=0;
        public void add(int val){
            if(size==arr.length-1){
                System.out.println("Queue is Full !");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[r+1]=val;
                r++;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty !!");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void displayQ(){
            if(size==0){
                System.out.println("Queue is Empty !");
                return;
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q=new queueA();
        q.displayQ();
        q.add(22);
        q.add(20);
        q.add(10);
        q.add(13);
        q.add(8);
        q.add(19);
        q.displayQ();
        System.out.println(q.peek());
        q.remove();
        q.displayQ();
    }
}
