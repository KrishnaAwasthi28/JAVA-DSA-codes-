//Previous Greater Element

import java.util.*;
public class prevGreater {
    public static int[] prevGreat(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            while(st.size()>0 && st.peek()<arr[i] ){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else{
                res[i]=st.peek();
                
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int[] ans=prevGreat(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
