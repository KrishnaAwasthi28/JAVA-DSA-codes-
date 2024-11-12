//given an array and integer x. find all indices of integer x in the array.
// public class r14 {
//     static void find(int[] a,int i,int x){
//         if(i>=a.length){
//             return;
//         }
//         if(a[i]==x){
//             System.out.println(i);
//         }
//         find(a,i+1,x);
//     }
//     public static void main(String[] args) {
//         int[] m={1,2,3,2,2,5,6};
//         find(m, 0, 2);
//     }
// }

//given an array and integer x. find all indices of integer x in the array using ARRAYLIST.
import java.util.*;
public class r14{
    static ArrayList<Integer> allindices(int[] a,int n,int t,int i){
        if(i>=n){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(a[i]==t){
            ans.add(i);
        }
        ArrayList<Integer> smallans=allindices(a, n, t, i+1);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        int[] m={1,2,2,4,2,5};
        int s=2;
        int size=m.length;
        ArrayList<Integer> f=new ArrayList<>();
        f=allindices(m, size, s, 0);
        for(Integer i:f){
            System.out.print(i+" ");
        }
    }
}