//Iterative Methof of Binary Search
public class binary{
    static boolean binarysearch(int[] arr,int t){
        int n=arr.length;
        int s=0,e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(t==arr[mid]){
                return true;
            }else if(t<arr[mid]){
                e=mid-1;
            }else if(t>arr[mid]){
                s=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] m={2,4,5,7,15,20,24,45,50,77};
        int target=20;
        if(binarysearch(m, target)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}