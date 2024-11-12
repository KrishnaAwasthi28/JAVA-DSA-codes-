//find the sum of all the elements of array using recursion
public class r12 {
    static int sum(int[] a,int i){
        if(i==a.length-1){
            return a[i];
        }
        int s=sum(a,i+1);
        return s+a[i];
    }
    public static void main(String[] args) {
        int[] m={1,2,3,4,5};
        System.out.println(sum(m, 0));
    }
}
