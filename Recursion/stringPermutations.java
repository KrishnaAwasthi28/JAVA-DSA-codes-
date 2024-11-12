import java.util.*;
public class stringPermutations {
    public static void main(String[] args) {
        String s="abc";
        List<String> l=new ArrayList<String>();
        printP(s,"",l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
    public static void printP(String s,String t,List<String> l){
        if(s.equals("")){
            l.add(t);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0, i);
            String right=s.substring(i+1);
            String rem=left+right;
            printP(rem,t+ch, l);
        }
    }
}
