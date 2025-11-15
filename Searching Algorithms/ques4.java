//Given an rotated sorted array , return the index of the target element in the array,
public class ques4 {
    static int search(int[] arr,int t){
        int n=arr.length;
        int s=0,e=n-1,mid;
        while(s<=e){
            if(arr[s]<arr[e]){
                if(arr[s]<t && arr[e]>t){
                    mid=s+(e-s)/2;
                    if(arr[mid]==t){
                        return mid;
                    }else if(arr[mid]>t){
                        e=mid-1;
                    }else if(arr[mid]<t){
                        s=mid+1;
                    }
                }
            }
        }
    }     
}
