//Find the Largest subarray sum which equals to zero.

import java.util.*;
public class largestSubarray {
    public static int largestSum(int[] num){
        Map<Integer,Integer> h=new HashMap<>();
        int maxLen=0,psum=0;
        h.put(0,-1);
        for(int i=0;i<num.length;i++){
            psum+=num[i];
            if(h.containsKey(psum)){
                maxLen=Math.max(maxLen, i-h.get(psum));
            }else h.put(psum,i);
        }
        return maxLen;
    }
}
