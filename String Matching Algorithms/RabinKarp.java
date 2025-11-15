// import java.util.*;
public class RabinKarp{
    public static final int PRIME=101;
    public static double calculateHash(String str){
        double hash=0;
        for(int i=0;i<str.length();i++){
            hash+=str.charAt(i)*Math.pow(PRIME,i);
        }
        return hash;
    }
    public static double updateHash(double prevhash,char oldchar,char newchar,int patternLength){
        double newhash=(prevhash-oldchar)/PRIME;
        newhash+=newchar*Math.pow(PRIME,patternLength-1);
        return newhash;
    }
    public static int rabinKarp(String text,String pattern){
        int patternLength=pattern.length();
        double patternHash=calculateHash(pattern);
        double textHash=calculateHash(text.substring(0,patternLength));
        for(int i=0;i<=text.length()-patternLength;i++){
            if(textHash==patternHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    return i;
                }
            }
            if(i<text.length()-patternLength){
                textHash=updateHash(textHash, text.charAt(i),text.charAt(i+patternLength), patternLength);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="Krishna";
        String k="ShriyaLovesKrishna";
        System.out.println("Pattern found at index: "+rabinKarp(k, s));
    }
}