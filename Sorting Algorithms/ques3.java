//Given aaray of integer in increasing order, the two elements in array are swapped , so identify it and solve the array. eg input=3,8,6,7,5,9,10 and output=3,5,6,7,8,9,10
public class ques3 {
    static void sorting(int[] arr){
        int n=arr.length;
        int x=-1,y=-1;
        if(n<=1){return;}
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }else{
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[] m={3,8,6,7,5,9,10};
        sorting(m);
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
    }
}
