// Implementation of Circular Queue using Array

public class arrayCircularQ {
    public static class CircularQ{
        int[] arr=new int[5];
        int f=-1;
        int r=-1;
        int size=0;
        public void add(int val){
            if(size==arr.length){
                System.err.println("Queue is Full !");
                return;
            }
            else if(size==0){
                f=r=0;
                arr[0]=val;
            }
            else if(r<arr.length-1){
                arr[r+1]=val;
                r++;
            }
            else if(r==arr.length-1){
                r=0;
                arr[0]=val;
            }
            size++;
        }
        
        public int remove(){
            if(size==0){
                System.err.println("Queue is Empty !!");
                return -1;
            }
            else {
                int x=arr[f];
                if(f==arr.length-1) f=0;
                else f++;
                size--;
                return x;
            } 
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
            if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }else{
                for(int i=f;i<=arr.length-1;i++){
                    System.out.println(arr[i]+" ");
                }
                for(int i=0;i<=r;i++){
                    System.out.println(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        CircularQ q=new CircularQ();
        q.displayQ();
        q.add(22);
        q.add(20);
        q.add(10);
        q.add(13);
        q.add(8);
        
        q.displayQ();
        System.out.println(q.peek());
        // q.add(19);
        q.remove();
        q.add(19);
        q.displayQ();
    }
}

