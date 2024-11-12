public class binary_rec{
    static int binarysearch(int[] arr,int s,int e,int t){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(t==arr[mid]){
            return mid;
        }else if(t<arr[mid]){
            return binarysearch(arr, s, mid-1, t);
        }else if(t>arr[mid]){
            return binarysearch(arr, mid+1, e, t);
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] m={2,4,5,7,15,20,24,45,50,77};
        int target=100;
        int result=binarysearch(m, 0, m.length-1, target);
        if(result==-1){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}

