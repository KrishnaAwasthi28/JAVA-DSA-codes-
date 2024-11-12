//Basic implementation of  Queue

import java.util.*;
public class basicSTL{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //OR (2 ways of instantiating Queue)
        // Queue<Integer> q1=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        q.remove(); //remove 1 
        System.out.println(q);
        q.poll();//remove 2 (remove()and poll() are same methods)
        System.out.println(q.peek()); //returns 5 (top most element)
        System.out.println(q.element()); //returns 5 (peek() and element() are same methods)
        System.out.println(q.isEmpty());

    }
}