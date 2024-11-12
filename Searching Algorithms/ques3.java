//Given an Rotated sorted array , return the index of the minimum element in the array.
public class ques3{
    static int minidx(int[] arr){
        int n=arr.length;
        int s=0,e=n-1,ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[n-1]){
                s=mid+1;
            }else if(arr[mid]<=arr[n-1]){
                ans=mid;
                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] m={3,4,5,1,2};
        System.out.println(minidx(m));
        
    }
}