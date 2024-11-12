import java.util.*;
public class twoSum {
    public static int[] twosum(int[] num,int t){
        Map<Integer,Integer> h=new HashMap<>();
        int[] ans={-1};
        for(int i=0;i<num.length;i++){
            if(!h.containsKey(t-num[i])) h.put(num[i],i);
            else{
                int j=h.get(t-num[i]);
                ans=new int[]{i,j};
                return ans;
            }
        }
        return ans;
    }
}
