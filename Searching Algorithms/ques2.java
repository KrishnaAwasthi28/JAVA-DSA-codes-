//Find the square root of the given non negative value x.Round off to nearest integer
public class ques2 {
    static int root(int x){
        int s=0,e=x,ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int val=mid*mid;
            if(val==mid){
                return mid;
            }else if(val<mid){
                ans=mid;
                s=mid-1;
            }else{
                e=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int a=25;
        System.out.println(root(a));
    }
}
