//Reverse the given List
import java.util.*;
public class arraylist1{
    static void reverseList(ArrayList<Integer> list){
        int i=0,j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);
        System.out.println("Original List :"+ l);
        reverseList(l);
        // Collections.reverse(l); this is a inbuilt method in Collection object
        System.out.println("Reversed List :"+ l);
        Collections.sort(l);//Sort in Ascending Order
        System.out.println("Ascending Order List :"+ l);
        Collections.sort(l,Collections.reverseOrder());//Sort in Descending Order
        System.out.println("Descending Order List :"+ l);

    }
}