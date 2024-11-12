//Given an array of positive and negative integers, print all negative numbers followed by all positive numbers.
public class ques4 {
    static void signsort(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            while(arr[l]<0){
                l++;
            }
            while(arr[r]>0){
                r--;
            }
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }

    }
    public static void main(String[] args) {
        int[] m={19,-20,7,-4,-13,1,-5,3};
        int n=m.length;
        signsort(m);
        for(int i=0;i<n;i++){
            System.out.print(m[i]+" ");
        }
    }
}
