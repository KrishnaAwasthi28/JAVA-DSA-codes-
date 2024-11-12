import java.util.*;
public class basicSTL {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        //Adding the entries in the hashmap
        mp.put("Akash",21);
        mp.put("Yash",19);
        mp.put("Krishna",20);
        mp.put("Aryan",22);
        mp.put("Dhoni",43);
        //Updating/changeing the value
        mp.put("Akash",22);
        //Removing a pair from Hashmap
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("riya")); //null -because no key named riya

        //Checking the existence of the key in Hashmap
        System.out.println(mp.containsKey("Akash")); //false
        System.out.println(mp.containsKey("Yash")); //true

        //Adding new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yahsika", 30); //it will put
        mp.putIfAbsent("Yash", 21);//it will not put

        //Get all keys in Hahsmap
        System.out.println(mp.keySet());
        //Get all values in the Hahmap
        System.out.println(mp.values());
        //Get all key value pair in hashmap
        System.out.println(mp.entrySet());

        //Traversing all the entries of Hashmap
        for(String key:mp.keySet()){
            System.out.printf("Age is %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        //or
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}
