public class HeapOperation{
    public class Heap{
        int heap[];
        int heapSize;
        int capacity;
        Heap(int[] arr){
            heap=arr;
            heapSize=arr.length;
            capacity=arr.length;
        }

        public void swap(int i,int j){
            int temp=heap[i];
            heap[i]=heap[j];
            heap[j]=temp;
        }
        public void heapify(int index){
            int largest=index;
            int leftChildIdx=2*index+1;
            int rightChildIdx=2*index+2;
            if(leftChildIdx<heapSize && heap[leftChildIdx]>largest){
                largest=leftChildIdx;
            }
            if(rightChildIdx<heapSize && heap[rightChildIdx]>largest){
                largest=rightChildIdx;
            }
            if(largest!=index){
                swap(largest,index);
                heapify(largest);
            }
        }
        public void buildTree(){
            for(int i=(heapSize/2)-1;i>=0;i--){
                heapify(i);
            }
        }
    }
}