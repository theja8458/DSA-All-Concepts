import java.util.*;
public class FractionKnap {
    
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]={10,20,30};

        double ratio[][]=new double[val.length][2];
          for(int i=0 ; i<val.length ; i++){
              ratio[i][0]=i;
              ratio[i][1]=val[i]/(double)weight[i];
          }
          Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
                
      int capacity=50;
      int ans=0;
        for(int i=ratio.length-1 ; i>=0 ; i--){
            int idx=(int)ratio[i][0];
          if(capacity >= weight[idx]){
            capacity-=weight[idx];
            ans+=val[idx];
          }else{
            ans+=(ratio[i][1]*capacity);
            capacity=0;
            break;
          }
        }
        System.out.println(ans);
    }
}
