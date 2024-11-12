//Remove all the consecutive subsequence of length greater than or equal to 2 that contains the same element

import java.util.*;
public class consecutivgeSubsequence {
    public static int[] isSubsequence(int[] arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                
                if(i==arr.length-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] res=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] ans=isSubsequence(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        } 
        sc.close();
    }
    
}