import java.util.*;

public class hashmap{
    public static void main(String args[]){
        HashMap <String, Integer> map = new HashMap<> ();
        map.put("India", 120);
        map.put("China", 150);
        map.put("USA", 30);
        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);

        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }else {
            System.out.println("Key is not present in the map");
        }
        System.out.println(map.get("China"));
        System.out.println(map.get("Pakistan"));

        int arr[] = {12, 15, 18};
        for(int val: arr){
            System.out.print(val + " ");
        }

        System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.println(" "+e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("China");
        System.out.println(map);

    }
}
 