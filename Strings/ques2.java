//Given a string, return the no of palindromic substrings in it.
import java.util.*;
public class ques2 {
    static boolean palindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(palindrome(str.substring(i,j))==true){
                    count++;
                }
            }
        }  
        System.out.println(count);
        sc.close();
    }
}
