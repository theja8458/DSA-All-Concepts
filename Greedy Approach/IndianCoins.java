import java.util.*;
public class IndianCoins {

    public static void main(String args[]){
        Integer coins[]={9,6,5,1};

        Arrays.sort(coins,Comparator.reverseOrder());
        int v=19;
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0 ; i<coins.length ; i++){
            if(coins[i] <= v){
             while (coins[i] <= v) {
                count++;
               list.add(coins[i]);
               v-=coins[i];
                
             }
            
        }
    }
        System.out.println(count);

        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
    
}
