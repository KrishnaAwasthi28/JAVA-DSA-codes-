//This is not a fix algorithm of bucket sort ,this is totally dependent on given problem.
import java.util.*;
public class bucket {
    static void bucketsort(float[] arr){
        int n=arr.length;
        //Buckets 
        ArrayList<Float>[] buckets=new ArrayList<>>;
        //Create empty buckets
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }

        //Add Elements into our buckets
        for(int i=0;i<n;i++){
            int bi=(int) arr[i]*n;
            buckets[bi].add(arr[i]);
        }

        //sort each buckets individually
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }

        //Merge all buckets to get final sorted array
        int idx=0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Float> currbucket=buckets[i];
            for(int j=0;j<currbucket.size();j++){
                arr[idx++]=currbucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] m={0.3f,0.1f,0.5f,0.4f,0.2f};
        bucketsort(m);
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
    }
}
