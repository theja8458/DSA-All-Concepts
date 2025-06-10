import java.util.*;;
public class MaxLenChaPaie {

    public static void main(String args[]){
      int pairs[][]={{2,24},{39,60},{5,28},{27,40},{50,90}};

      Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

      int chainLen=1;
      int Chainend=pairs[0][1];

      for(int i=1 ; i<pairs.length ; i++){
        if(pairs[i][0] >= Chainend){
            chainLen++;
           Chainend=pairs[i][1];
        }
      }

      System.out.println(chainLen);
    }
    
}
