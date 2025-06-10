import java.util.*;
public class LonlyNums {

    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        ArrayList<Integer> lonly=new ArrayList<>();
        int n=list.size();
        for(int i=0 ; i<n ; i++){
            if(mp.containsKey(list.get(i)) == false){
                mp.put(list.get(i) , 1);
            }else{
                mp.put(list.get(i) , mp.get(list.get(i))+1);
            }
        }
        for(int i=0 ; i<n ; i++){
            if(mp.get(list.get(i)) == 1 && mp.containsKey(list.get(i)+1) == false && mp.containsKey(list.get(i)-1) == false){
             lonly.add(list.get(i));
            }
        }

        System.out.println(lonly);
    }
    
}
