// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

import java.util.*;
public class LC242 {
    public static boolean Anagram(String s1,String s2){
        if(s1.length()==0 || s2.length()==0) return false;
        Map<Character,Integer> h1=new HashMap<>();
        Map<Character,Integer> h2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            h2.put(ch,h2.getOrDefault(ch,0)+1);
        }
        if(h1.equals(h2)) return true;
        else return false;
    }
    public static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";
        System.out.println(Anagram(s1, s2));
    }
}
