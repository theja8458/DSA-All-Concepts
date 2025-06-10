import java.util.*;
public class Hashset {

    public static void main(String args[]){
        // HashSet<Integer> hs = new HashSet<>();
        // hs.add(1);
        // hs.add(2);
        // hs.add(4);
        // hs.add(2);
        // hs.add(1);

        // System.out.println(hs);
        // hs.clear();
        // System.out.println(hs.size());
        // System.out.println(hs.isEmpty());
        // hs.remove(2);
        // if(hs.contains(2)){
        //     System.out.println("set contains 2");
        // }
        // if(hs.contains(3)){
        //     System.out.println("set contains 3");
        // }   

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Benguluru");
        System.out.println(cities);
        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // for (String city : cities) {
        //     System.out.println(city);
        // }
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Benguluru");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Benguluru");
        System.out.println(ts);

    }
    
}
