//Find the first occurence of a given element x,given that the array is sorted.If no occurence found then return -1.
public class ques1 {
    static int binarysearch(int[] arr,int t){
        int n=arr.length;
        int s=0,e=n-1,fo=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==t){
                fo=mid;
                e=mid-1;
            }else if(t<arr[mid]){
                e=mid-1;
            }else if(t>arr[mid]){
                s=mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int[] m={2,5,5,6,6,6,8,9,9,9};
        int target=6;
        int result=binarysearch(m, target);
        System.out.println(result);
    }
}
