//Arrange the given array of string in lexographical order.

import java.util.*;
public class ques2 {
    static void sortLexographical(String[] a){
        int n=a.length;
        int min=0;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[j].compareTo(a[min])<0){
                    min=j;
                }
            }
            String temp=a[i];
            a[i]=a[min];
            a[min]=temp;

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sortLexographical(s);
        for(int i=0;i<n;i++){
            System.out.print(s[i]+" ");
        }
        sc.close();
    }
}
