//find if the element is present in array or not;
public class r13 {
    static boolean search(int[] a,int i,int t){
        if(i>=a.length){
            return false;
        }
        if(a[i]==t){
            return true;
        }
        return search(a, i+1, t);
    }
    public static void main(String[] args) {
        int[] m={1,2,3,4,5};
        if(search(m, 0, 74)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
