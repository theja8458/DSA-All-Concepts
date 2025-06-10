import java.util.*;
class FndItineraryFrmTick{
     public static String getStart(HashMap<String,String> hm){
        HashMap<String,String> revhm = new HashMap<>();

        for(String key:hm.keySet()){
            revhm.put(hm.get(key) , key);
        }

        for(String key:hm.keySet()){
            if(!revhm.containsKey(key)){
                return key;
            }
        }

        return null;
     }
    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Benguluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        String start = getStart(tickets);
        System.out.print(start);

        for(String key:tickets.keySet()){
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start);
        }

        System.out.println();
    }

}