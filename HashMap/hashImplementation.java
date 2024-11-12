//HASHMAP IMPLEMENTATION

import java.util.*;
public class hashImplementation {
    public static class Hash<K,V>{
        private static final int DEFAULT_CAPACITY=4;
        private static final float LOAD_FACTOR=0.75f;

        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        private void initBuckets(int N){
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        private int Hashfunc(K key){
            int hc=key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }

        private int searchInbucket(LinkedList<Node> ll,K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key) return i;
            }
            return -1;
        }

        public Hash(){
            initBuckets(DEFAULT_CAPACITY);
        }

        private void rehash(){
            LinkedList<Node>[] oldbuckets=buckets;
            initBuckets(oldbuckets.length*2);
            n=0;
            for(var bucket:oldbuckets){
                for(var node:bucket){
                    put(node.key,node.value);
                }
            }
        }

        public int size(){
            return n;
        }
        
        public void put(K key, V value){ //insertion/updation
            int bi=Hashfunc(key);
            LinkedList<Node> currB=buckets[bi];
            int ei=searchInbucket(currB, key);
            if(ei==-1){
                Node node=new Node(key,value);
                currB.add(node);
                n++;
            }else{
                Node currN=currB.get(ei);
                currN.value=value;
            }
            if(n>=buckets.length*LOAD_FACTOR){
                rehash();
            }

        }
        
        public V get(K key){ //get value of given key
            int bi=Hashfunc(key);
            LinkedList<Node> currB=buckets[bi];
            int ei=searchInbucket(currB, key);
            if(ei!=-1){
                Node currN=currB.get(ei);
                return currN.value;
            }
            return null;
        }
        
        public V remove(K key){ //remove the given key
            int bi=Hashfunc(key);
            LinkedList<Node> currB=buckets[bi];
            int ei=searchInbucket(currB, key);
            if(ei!=-1){
                Node currN=currB.get(ei);
                V val=currN.value;
                currB.remove(ei);
                n--;
                return val;
            }
            return null;
        }

    }
    public static void main(String[] args) {
        Hash<String,Integer> h=new Hash<>();
        h.put("a",1);
        h.put("b",2);
        h.put("c",3);
        System.out.println(h.size());
        h.put("c",4);
        System.out.println(h.get("a"));
        System.out.println(h.get("b"));
        System.out.println(h.get("c"));

        System.out.println(h.remove("c"));
        System.out.println(h.remove("c"));
        System.out.println(h.size());
    }
}
