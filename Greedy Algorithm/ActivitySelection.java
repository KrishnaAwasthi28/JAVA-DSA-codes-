// You are given a set of activities, each with a start time and a finish time, represented by the arrays start[] and finish[], respectively. A single person can perform only one activity at a time, meaning no two activities can overlap. Your task is to determine the maximum number of activities that a person can complete in a day.

// Examples:

// Input: start[] = [1, 3, 0, 5, 8, 5], finish[] = [2, 4, 6, 7, 9, 9]
// Output: 4

import java.util.*;
public class ActivitySelection {
    public static int activitySelection(int[] start,int[] finish){
        int n=start.length;
        ArrayList<Integer> index=new ArrayList<>();
        for(int i=0;i<n;i++){
            index.add(i);
        }
        Collections.sort(index,(a,b)->Integer.compare(finish[a],finish[b]));
        int max=1;
        int lastIdx=finish[index.get(0)];
        for(int i=1;i<n;i++){
            int idx=index.get(i);
            if(start[idx]>lastIdx){
                max++;
                lastIdx=finish[idx];
            }
        }
        return max;
    }
}
