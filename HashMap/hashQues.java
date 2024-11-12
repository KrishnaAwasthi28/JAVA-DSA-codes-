//Take array as input and print the element with the maxximum frequency.

import java.util.*;
public class hashQues{
    public static void main(String[] args) {
        Map<Integer,Integer> mp=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp.entrySet());
        int maxf=0,anskey=-1;
        for(var e:mp.entrySet()){
            if(e.getValue()>maxf){
                maxf=e.getValue();
                anskey=e.getKey();
            }
        }
        System.out.println(anskey);
        sc.close();
    }
}