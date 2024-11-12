public class radix {
    static int findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){max=arr[i];}
        }
        return max;
    }   
    static void countsort(int[] arr,int place){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        for(int i=0;i<n;i++){ //frequency array of digit place
            count[(arr[i]/place)%10]++;
        }
        for(int i=1;i<count.length;i++){//make prefix sum array
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }
    static void radixsort(int[] arr){
        int max=findmax(arr);
        for(int place=1;max/place>0;place*=10){
            countsort(arr, place);
        }
    }
    public static void main(String[] args) {
        int[] m={170,45,75,90,802,2};
        radixsort(m);
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
    }
}
