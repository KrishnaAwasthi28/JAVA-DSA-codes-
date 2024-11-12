import java.util.*;
public class isomorphicH {
    public static boolean isomorphic(String s,String t){
        if(s.length()!=t.length()) return false;
        Map<Character,Character> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);
            if(h.containsKey(sch)){
                if(h.get(sch)!=tch) return false;
                else if(h.containsValue(tch)) return false;
                else h.put(sch,tch);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="aabc";
        String b="xxz";
        System.out.println(isomorphic(a, b));
    }
}
