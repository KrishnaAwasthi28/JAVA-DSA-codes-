//Given an array of size N containing only 0s,1s,2s; sort them in ascending order
//if time complexity is not mentioned then do it using any algorithm
//if time complexity is O(nlogn) then use merge or quick sort
//if time complexity given is linear time,then use count sort
//if it is given that sort it in one pass the use this below algorithm
public class ques5{
    static void swap(int[] n,int a,int b){
        int temp=n[a];
        n[a]=n[b];
        n[b]=temp;
    }
    static void sortQues(int[] arr){
        int n=arr.length;
        int mid=0,lo=0,hi=n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,mid,lo);
                mid++;
                lo++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr, mid, hi);
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int[] m={2,2,0,0,1,1,2,0,1,0};
        sortQues(m);
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
    }
}