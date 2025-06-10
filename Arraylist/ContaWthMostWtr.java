import java.util.ArrayList;;
public class ContaWthMostWtr {
      public static int Container(ArrayList<Integer> list){
        int lp=0;
        int rp=list.size()-1;
        int max=Integer.MIN_VALUE;
        while(lp < rp){
         int height=Math.min(list.get(lp), list.get(rp));
         int width=rp-lp;
         int curwater=height * width;
         max=Math.max(max, curwater);
         if(list.get(lp) < list.get(rp)){
            lp++;
         }else {
            rp--;
         }
        }
        return max;
      }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1); list.add(8) ; list.add(6); list.add(2); list.add(5);
        list.add(4); list.add(8);  list.add(3) ; list.add(7);
        // //brute force O(n^2)
        // int maxele=Integer.MIN_VALUE;
        // for(int i=0 ; i<list.size() ; i++){
        //     for(int j=i+1 ; j<list.size() ; j++){
        //         int height=Math.min(list.get(i), list.get(j));
        //         int width=j-i;
        //         int waater=height*width;
        //         maxele=Math.max(maxele, waater);
        //     }
        // }
        // System.out.println(maxele);
        System.out.println(Container(list));
    }
    
}
