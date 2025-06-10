import java.util.*;
class HashMapOper{
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get
        // int pop = hm.get("India");
        // System.out.println(pop);

        // System.out.println(hm.get("Indonesia"));

        // //CobtainsKey

        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indonesia"));

        //Reomve
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);     

        //Size 
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());




    }
}