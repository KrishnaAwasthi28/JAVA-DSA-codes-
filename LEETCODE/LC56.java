// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
import java.util.*;
public class LC56 {
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int[][] res=new int[n][2];
        res[0]=intervals[0];
        int e=0;
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=res[e][1]){
                res[e][1]=Math.max(res[e][1],intervals[i][1]);
            }else{
                e++;
                res[e]=intervals[i];
            }
        }
        return Arrays.copyOfRange(res, 0, e+1);
    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(merge(intervals));
    }
}
