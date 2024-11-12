//Given a string,toggle all characters of string and convert all the lowercase char into uppercase char and vice versa
import java.util.*;
public class ques {
    static void changecase(StringBuilder str){
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int asci=(int)ch;
            boolean flag=true;
            if(asci>=97){
                flag=false;
            }
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine()) ;
        changecase(str);
        System.out.println(str);
        sc.close();
    }
}
