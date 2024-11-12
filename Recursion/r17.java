//WAP to print reverse of a string.
// import java.util.*;
// public class r17 {
//     static void reverse(String s){
//         char ch[]=s.toCharArray();
//         String rev="";
//         for(int i=ch.length-1;i>=0;i--){
//             rev=rev + ch[i];
//         }
//         System.out.println(rev);
//     }
//     public static void main(String[] args) {
//         String str="Krishna";
//         reverse(str);
//     }
// }

//WAP to print reverse of a strin using recursion.and also check Palindrome or not
import java.util.*;
public class r17{
    static String reverse(String s){
        if(0==s.length()){
            return "";
        }
        String rev=reverse(s.substring(1));
        return rev + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.nextLine();
        System.out.println(reverse(str));
        if(reverse(str).equals(str)){
            System.out.printf("%str is PALINDROME",str);
        }else{
            System.out.printf("%str is NOT PALINDROME",str);
        }
        sc.close();
    }
}