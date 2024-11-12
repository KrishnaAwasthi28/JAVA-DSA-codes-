public class r5 {
    static int sum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int a=n%10;
        int b=n/10;
        return a+sum(b);
    }
    public static void main(String[] args) {
        int c=1234;
        System.out.println(sum(c));
    }
}
