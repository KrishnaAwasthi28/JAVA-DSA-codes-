public class llqueue {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty !!");
                return -1;
            }
            int a = head.val;
            head = head.next;
            size--;
            return a;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty !!");
                return -1;
            }
            return head.val;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty !!");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        queueLL q=new queueLL();
        q.add(10);
        q.add(3);
        q.add(1);
        q.add(4);
        q.add(8);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
