import java.util.ArrayList;
public class MonotonicArrList {
    // static int i=0;
   public static boolean motonic(ArrayList<Integer> list){
    boolean decrease=true;
    boolean increase=true;
    for(int j=1 ; j<list.size() ; j++){
        if(list.get(j) > list.get(j-1)){
            decrease=false; 
        }
        if(list.get(j) < list.get(j-1)){
        increase=false;
        }
   }
   return increase||decrease;
}
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        // list.add(2);
        // list.add(3);
        System.out.println(motonic(list));
        // System.out.println(i);

    }
    
}
