//remove all occurence of a from string s='abcax'.
// public class r16 {
//     public static void main(String[] args) {
//         String s="abcax";
//         char c='a';
//         String ans="";
//         for(int i=0;i<s.length();i++){
//             if(c!=s.charAt(i)){
//                 ans=ans + s.charAt(i);
//             }
//         }
//         System.out.println(ans);
//     }
// }

//remove all occurence of a from string s='abcax' using reccursion.
import java.util.*;
public class r16{
    static String remove(String s,char c){
        if(s.length()==0){
            return "";
        }
        String ans=remove(s.substring(1), c);
        if(s.charAt(0)!=c){
            return s.charAt(0) + ans;
        }else{
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :");
        String a=sc.nextLine();
        System.out.print("Enter the Char to remove :");
        char ch=sc.next().charAt(0);
        System.out.println(remove(a,ch));
        sc.close();
    } 
}